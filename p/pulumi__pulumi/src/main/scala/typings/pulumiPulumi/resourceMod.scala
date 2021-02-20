package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("@pulumi/pulumi/resource", "ComponentResource")
  @js.native
  class ComponentResource[TData] protected () extends Resource {
    /**
      * Creates and registers a new component resource.  [type] is the fully qualified type token and
      * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
      * [opts.parent] is the optional parent for this component, and [opts.dependsOn] is an optional
      * list of other resources that this resource depends on, controlling the order in which we
      * perform resource operations.
      *
      * @param t The type of the resource.
      * @param name The _unique_ name of the resource.
      * @param args Information passed to [initialize] method.
      * @param opts A bag of options that control this resource's behavior.
      * @param remote True if this is a remote component resource.
      */
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, args: Inputs) = this()
    def this(`type`: String, name: String, args: js.UndefOr[scala.Nothing], opts: ComponentResourceOptions) = this()
    def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions) = this()
    def this(
      `type`: String,
      name: String,
      args: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean
    ) = this()
    def this(
      `type`: String,
      name: String,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions,
      remote: Boolean
    ) = this()
    def this(`type`: String, name: String, args: Inputs, opts: js.UndefOr[scala.Nothing], remote: Boolean) = this()
    def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions, remote: Boolean) = this()
    
    /**
      * Retrieves the data produces by [initialize].  The data is immediately available in a
      * derived class's constructor after the `super(...)` call to `ComponentResource`.
      */
    /* protected */ def getData(): js.Promise[TData] = js.native
    
    /**
      * Can be overridden by a subclass to asynchronously initialize data for this Component
      * automatically when constructed.  The data will be available immediately for subclass
      * constructors to use.  To access the data use `.getData`.
      */
    /* protected */ def initialize(args: Inputs): js.Promise[TData] = js.native
    
    /**
      * registerOutputs registers synthetic outputs that a component has initialized, usually by
      * allocating other child sub-resources and propagating their resulting property values.
      *
      * ComponentResources can call this at the end of their constructor to indicate that they are
      * done creating child resources.  This is not strictly necessary as this will automatically be
      * called after the `initialize` method completes.
      */
    /* protected */ def registerOutputs(): Unit = js.native
    /* protected */ def registerOutputs(outputs: js.Promise[Inputs]): Unit = js.native
    /* protected */ def registerOutputs(outputs: Inputs): Unit = js.native
    /* protected */ def registerOutputs(outputs: Output_[Inputs]): Unit = js.native
  }
  /* static members */
  object ComponentResource {
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/resource", "ComponentResource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/resource", "CustomResource")
  @js.native
  abstract class CustomResource protected () extends Resource {
    /**
      * Creates and registers a new managed resource.  t is the fully qualified type token and name
      * is the "name" part to use in creating a stable and globally unique URN for the object.
      * dependsOn is an optional list of other resources that this resource depends on, controlling
      * the order in which we perform resource operations. Creating an instance does not necessarily
      * perform a create on the physical entity which it represents, and instead, this is dependent
      * upon the diffing of the new goal state compared to the current known resource state.
      *
      * @param t The type of the resource.
      * @param name The _unique_ name of the resource.
      * @param props The arguments to use to populate the new resource.
      * @param opts A bag of options that control this resource's behavior.
      * @param dependency True if this is a synthetic resource used internally for dependency tracking.
      */
    def this(t: String, name: String) = this()
    def this(t: String, name: String, props: Inputs) = this()
    def this(t: String, name: String, props: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions) = this()
    def this(
      t: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: CustomResourceOptions,
      dependency: Boolean
    ) = this()
    def this(t: String, name: String, props: Inputs, opts: js.UndefOr[scala.Nothing], dependency: Boolean) = this()
    def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions, dependency: Boolean) = this()
    
    /**
      * id is the provider-assigned unique ID for this managed resource.  It is set during
      * deployments and may be missing (undefined) during planning phases.
      */
    val id: Output_[ID] = js.native
  }
  /* static members */
  object CustomResource {
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/resource", "CustomResource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/resource", "DependencyProviderResource")
  @js.native
  class DependencyProviderResource protected () extends ProviderResource {
    def this(ref: String) = this()
  }
  
  @JSImport("@pulumi/pulumi/resource", "DependencyResource")
  @js.native
  class DependencyResource protected () extends CustomResource {
    def this(urn: URN) = this()
  }
  
  @JSImport("@pulumi/pulumi/resource", "ProviderResource")
  @js.native
  abstract class ProviderResource protected () extends CustomResource {
    /**
      * Creates and registers a new provider resource for a particular package.
      *
      * @param pkg The package associated with this provider.
      * @param name The _unique_ name of the provider.
      * @param props The configuration to use for this provider.
      * @param opts A bag of options that control this provider's behavior.
      * @param dependency True if this is a synthetic resource used internally for dependency tracking.
      */
    def this(pkg: String, name: String) = this()
    def this(pkg: String, name: String, props: Inputs) = this()
    def this(pkg: String, name: String, props: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions) = this()
    def this(
      pkg: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      pkg: String,
      name: String,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      dependency: Boolean
    ) = this()
    def this(pkg: String, name: String, props: Inputs, opts: js.UndefOr[scala.Nothing], dependency: Boolean) = this()
    def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions, dependency: Boolean) = this()
  }
  /* static members */
  object ProviderResource {
    
    @JSImport("@pulumi/pulumi/resource", "ProviderResource.register")
    @js.native
    def register(): js.Promise[js.UndefOr[String]] = js.native
    @JSImport("@pulumi/pulumi/resource", "ProviderResource.register")
    @js.native
    def register(provider: ProviderResource): js.Promise[js.UndefOr[String]] = js.native
  }
  
  @JSImport("@pulumi/pulumi/resource", "Resource")
  @js.native
  abstract class Resource protected () extends StObject {
    /**
      * Creates and registers a new resource object.  [t] is the fully qualified type token and
      * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
      * dependsOn is an optional list of other resources that this resource depends on, controlling
      * the order in which we perform resource operations.
      *
      * @param t The type of the resource.
      * @param name The _unique_ name of the resource.
      * @param custom True to indicate that this is a custom resource, managed by a plugin.
      * @param props The arguments to use to populate the new resource.
      * @param opts A bag of options that control this resource's behavior.
      * @param remote True if this is a remote component resource.
      * @param dependency True if this is a synthetic resource used internally for dependency tracking.
      */
    def this(t: String, name: String, custom: Boolean) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs) = this()
    def this(t: String, name: String, custom: Boolean, props: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      remote: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean
    ) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions, remote: Boolean) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: js.UndefOr[scala.Nothing],
      opts: ResourceOptions,
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: js.UndefOr[scala.Nothing],
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: js.UndefOr[scala.Nothing],
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: ResourceOptions,
      remote: js.UndefOr[scala.Nothing],
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: ResourceOptions,
      remote: Boolean,
      dependency: Boolean
    ) = this()
    
    def getProvider(moduleMember: String): js.UndefOr[ProviderResource] = js.native
    
    /**
      * urn is the stable logical URN used to distinctly address a resource, both before and after
      * deployments.
      */
    val urn: Output_[URN] = js.native
  }
  /* static members */
  object Resource {
    
    @JSImport("@pulumi/pulumi/resource", "Resource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String]): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: js.UndefOr[Input[URN]], project: String): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: js.UndefOr[Input[URN]],
    project: String,
    stack: String
  ): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN]): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Resource): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: Resource,
    project: js.UndefOr[scala.Nothing],
    stack: String
  ): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: String): Output_[String] = js.native
  @JSImport("@pulumi/pulumi/resource", "createUrn")
  @js.native
  def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: String, stack: String): Output_[String] = js.native
  
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: CustomResourceOptions): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: js.UndefOr[scala.Nothing], opts2: ResourceOptions): ResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ComponentResourceOptions): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ComponentResourceOptions, opts2: ComponentResourceOptions): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: CustomResourceOptions): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: CustomResourceOptions, opts2: CustomResourceOptions): CustomResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ResourceOptions): ResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions(opts1: ResourceOptions, opts2: ResourceOptions): ResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions_ComponentResourceOptions(): ComponentResourceOptions = js.native
  @JSImport("@pulumi/pulumi/resource", "mergeOptions")
  @js.native
  def mergeOptions_ResourceOptions(): ResourceOptions = js.native
  
  @JSImport("@pulumi/pulumi/resource", "rootStackResource")
  @js.native
  val rootStackResource: Resource = js.native
  
  @js.native
  trait Alias extends StObject {
    
    /**
      * The previous name of the resource.  If not provided, the current name of the resource is
      * used.
      */
    var name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The previous parent of the resource.  If not provided (i.e. `{ name: "foo" }`), the current
      * parent of the resource is used (`opts.parent` if provided, else the implicit stack resource
      * parent).
      *
      * To specify no original parent, use `{ parent: pulumi.rootStackResource }`.
      */
    var parent: js.UndefOr[Resource | Input[URN]] = js.native
    
    /**
      * The previous project of the resource. If not provided, defaults to `pulumi.getProject()`.
      */
    var project: js.UndefOr[Input[String]] = js.native
    
    /**
      * The previous stack of the resource.  If not provided, defaults to `pulumi.getStack()`.
      */
    var stack: js.UndefOr[Input[String]] = js.native
    
    /**
      * The previous type of the resource.  If not provided, the current type of the resource is used.
      */
    var `type`: js.UndefOr[Input[String]] = js.native
  }
  object Alias {
    
    @scala.inline
    def apply(): Alias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alias]
    }
    
    @scala.inline
    implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParent(value: Resource | Input[URN]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setProject(value: Input[String]): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setStack(value: Input[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ComponentResourceOptions extends ResourceOptions {
    
    /**
      * An optional set of providers to use for child resources. Either keyed by package name (e.g.
      * "aws"), or just provided as an array.  In the latter case, the package name will be retrieved
      * from the provider itself.
      *
      * In the case of a single provider, the options can be simplified to just pass along `provider: theProvider`
      *
      * Note: do not provide both [provider] and [providers];
      */
    var providers: js.UndefOr[(Record[String, ProviderResource]) | js.Array[ProviderResource]] = js.native
  }
  object ComponentResourceOptions {
    
    @scala.inline
    def apply(): ComponentResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentResourceOptions]
    }
    
    @scala.inline
    implicit class ComponentResourceOptionsMutableBuilder[Self <: ComponentResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProviders(value: (Record[String, ProviderResource]) | js.Array[ProviderResource]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      @scala.inline
      def setProvidersVarargs(value: ProviderResource*): Self = StObject.set(x, "providers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CustomResourceOptions extends ResourceOptions {
    
    /**
      * The names of outputs for this resource that should be treated as secrets. This augments the list that
      * the resource provider and pulumi engine already determine based on inputs to your resource. It can be used
      * to mark certain ouputs as a secrets on a per resource basis.
      */
    var additionalSecretOutputs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * When set to true, deleteBeforeReplace indicates that this resource should be deleted before its replacement
      * is created when replacement is necessary.
      */
    var deleteBeforeReplace: js.UndefOr[Boolean] = js.native
    
    /**
      * When provided with a resource ID, import indicates that this resource's provider should import its state from
      * the cloud resource with the given ID. The inputs to the resource's constructor must align with the resource's
      * current state. Once a resource has been imported, the import property must be removed from the resource's
      * options.
      */
    var `import`: js.UndefOr[ID] = js.native
  }
  object CustomResourceOptions {
    
    @scala.inline
    def apply(): CustomResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomResourceOptions]
    }
    
    @scala.inline
    implicit class CustomResourceOptionsMutableBuilder[Self <: CustomResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalSecretOutputs(value: js.Array[String]): Self = StObject.set(x, "additionalSecretOutputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalSecretOutputsUndefined: Self = StObject.set(x, "additionalSecretOutputs", js.undefined)
      
      @scala.inline
      def setAdditionalSecretOutputsVarargs(value: String*): Self = StObject.set(x, "additionalSecretOutputs", js.Array(value :_*))
      
      @scala.inline
      def setDeleteBeforeReplace(value: Boolean): Self = StObject.set(x, "deleteBeforeReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteBeforeReplaceUndefined: Self = StObject.set(x, "deleteBeforeReplace", js.undefined)
      
      @scala.inline
      def setImport(value: ID): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    }
  }
  
  @js.native
  trait CustomTimeouts extends StObject {
    
    /**
      * The optional create timeout represented as a string e.g. 5m, 40s, 1d.
      */
    var create: js.UndefOr[String] = js.native
    
    /**
      * The optional delete timeout represented as a string e.g. 5m, 40s, 1d.
      */
    var delete: js.UndefOr[String] = js.native
    
    /**
      * The optional update timeout represented as a string e.g. 5m, 40s, 1d.
      */
    var update: js.UndefOr[String] = js.native
  }
  object CustomTimeouts {
    
    @scala.inline
    def apply(): CustomTimeouts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomTimeouts]
    }
    
    @scala.inline
    implicit class CustomTimeoutsMutableBuilder[Self <: CustomTimeouts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type ID = String
  
  @js.native
  trait ResourceOptions extends StObject {
    
    /**
      * An optional list of aliases to treat this resource as matching.
      */
    var aliases: js.UndefOr[js.Array[Input[URN | Alias]]] = js.native
    
    /**
      * An optional customTimeouts configuration block.
      */
    var customTimeouts: js.UndefOr[CustomTimeouts] = js.native
    
    /**
      * An optional additional explicit dependencies on other resources.
      */
    var dependsOn: js.UndefOr[Input[js.Array[Input[Resource]] | Resource]] = js.native
    
    /**
      * An optional existing ID to load, rather than create.
      */
    var id: js.UndefOr[Input[ID]] = js.native
    
    /**
      * Ignore changes to any of the specified properties.
      */
    var ignoreChanges: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An optional parent resource to which this resource belongs.
      */
    var parent: js.UndefOr[Resource] = js.native
    
    /**
      * When set to true, protect ensures this resource cannot be deleted.
      */
    var protect: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional provider to use for this resource's CRUD operations. If no provider is supplied,
      * the default provider for the resource's package will be used. The default provider is pulled
      * from the parent's provider bag (see also ComponentResourceOptions.providers).
      *
      * If this is a [ComponentResourceOptions] do not provide both [provider] and [providers]
      */
    var provider: js.UndefOr[ProviderResource] = js.native
    
    /**
      * Optional list of transformations to apply to this resource during construction. The
      * transformations are applied in order, and are applied prior to transformation applied to
      * parents walking from the resource up to the stack.
      */
    var transformations: js.UndefOr[js.Array[ResourceTransformation]] = js.native
    
    /**
      * An optional version, corresponding to the version of the provider plugin that should be used when operating on
      * this resource. This version overrides the version information inferred from the current package and should
      * rarely be used.
      */
    var version: js.UndefOr[String] = js.native
  }
  object ResourceOptions {
    
    @scala.inline
    def apply(): ResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceOptions]
    }
    
    @scala.inline
    implicit class ResourceOptionsMutableBuilder[Self <: ResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[Input[URN | Alias]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: (Input[URN | Alias])*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setCustomTimeouts(value: CustomTimeouts): Self = StObject.set(x, "customTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomTimeoutsUndefined: Self = StObject.set(x, "customTimeouts", js.undefined)
      
      @scala.inline
      def setDependsOn(value: Input[js.Array[Input[Resource]] | Resource]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
      
      @scala.inline
      def setDependsOnVarargs(value: Input[Resource]*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Input[ID]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIgnoreChanges(value: js.Array[String]): Self = StObject.set(x, "ignoreChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreChangesUndefined: Self = StObject.set(x, "ignoreChanges", js.undefined)
      
      @scala.inline
      def setIgnoreChangesVarargs(value: String*): Self = StObject.set(x, "ignoreChanges", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setProtect(value: Boolean): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
      
      @scala.inline
      def setProvider(value: ProviderResource): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setTransformations(value: js.Array[ResourceTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
      
      @scala.inline
      def setTransformationsVarargs(value: ResourceTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type ResourceTransformation = js.Function1[/* args */ ResourceTransformationArgs, js.UndefOr[ResourceTransformationResult]]
  
  @js.native
  trait ResourceTransformationArgs extends StObject {
    
    /**
      * The name of the Resource.
      */
    var name: String = js.native
    
    /**
      * The original resource options passed to the Resource constructor.
      */
    var opts: ResourceOptions = js.native
    
    /**
      * The original properties passed to the Resource constructor.
      */
    var props: Inputs = js.native
    
    /**
      * The Resource instance that is being transformed.
      */
    var resource: Resource = js.native
    
    /**
      * The type of the Resource.
      */
    var `type`: String = js.native
  }
  object ResourceTransformationArgs {
    
    @scala.inline
    def apply(name: String, opts: ResourceOptions, props: Inputs, resource: Resource, `type`: String): ResourceTransformationArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTransformationArgs]
    }
    
    @scala.inline
    implicit class ResourceTransformationArgsMutableBuilder[Self <: ResourceTransformationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: ResourceOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Inputs): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceTransformationResult extends StObject {
    
    /**
      * The new resource options to use in place of the original `opts`
      */
    var opts: ResourceOptions = js.native
    
    /**
      * The new properties to use in place of the original `props`
      */
    var props: Inputs = js.native
  }
  object ResourceTransformationResult {
    
    @scala.inline
    def apply(opts: ResourceOptions, props: Inputs): ResourceTransformationResult = {
      val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTransformationResult]
    }
    
    @scala.inline
    implicit class ResourceTransformationResultMutableBuilder[Self <: ResourceTransformationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpts(value: ResourceOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Inputs): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type URN = String
}

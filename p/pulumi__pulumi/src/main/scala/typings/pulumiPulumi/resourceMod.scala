package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("@pulumi/pulumi/resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(`type`: String, name: String, args: Unit, opts: ComponentResourceOptions) = this()
    def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions) = this()
    def this(`type`: String, name: String, args: Unit, opts: Unit, remote: Boolean) = this()
    def this(`type`: String, name: String, args: Unit, opts: ComponentResourceOptions, remote: Boolean) = this()
    def this(`type`: String, name: String, args: Inputs, opts: Unit, remote: Boolean) = this()
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
    
    @JSImport("@pulumi/pulumi/resource", "ComponentResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean]
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
    def this(t: String, name: String, props: Unit, opts: CustomResourceOptions) = this()
    def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions) = this()
    def this(t: String, name: String, props: Unit, opts: Unit, dependency: Boolean) = this()
    def this(t: String, name: String, props: Unit, opts: CustomResourceOptions, dependency: Boolean) = this()
    def this(t: String, name: String, props: Inputs, opts: Unit, dependency: Boolean) = this()
    def this(t: String, name: String, props: Inputs, opts: CustomResourceOptions, dependency: Boolean) = this()
    
    /**
      * id is the provider-assigned unique ID for this managed resource.  It is set during
      * deployments and may be missing (undefined) during planning phases.
      */
    val id: Output_[ID] = js.native
  }
  /* static members */
  object CustomResource {
    
    @JSImport("@pulumi/pulumi/resource", "CustomResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean]
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
    def this(pkg: String, name: String, props: Unit, opts: ResourceOptions) = this()
    def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions) = this()
    def this(pkg: String, name: String, props: Unit, opts: Unit, dependency: Boolean) = this()
    def this(pkg: String, name: String, props: Unit, opts: ResourceOptions, dependency: Boolean) = this()
    def this(pkg: String, name: String, props: Inputs, opts: Unit, dependency: Boolean) = this()
    def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions, dependency: Boolean) = this()
  }
  /* static members */
  object ProviderResource {
    
    @JSImport("@pulumi/pulumi/resource", "ProviderResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def register(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[js.Promise[js.UndefOr[String]]]
    inline def register(provider: ProviderResource): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
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
    def this(t: String, name: String, custom: Boolean, props: Unit, opts: ResourceOptions) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions) = this()
    def this(t: String, name: String, custom: Boolean, props: Unit, opts: Unit, remote: Boolean) = this()
    def this(t: String, name: String, custom: Boolean, props: Unit, opts: ResourceOptions, remote: Boolean) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: Unit, remote: Boolean) = this()
    def this(t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions, remote: Boolean) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Unit,
      opts: Unit,
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Unit,
      opts: Unit,
      remote: Unit,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Unit,
      opts: ResourceOptions,
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Unit,
      opts: ResourceOptions,
      remote: Unit,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: Unit,
      remote: Boolean,
      dependency: Boolean
    ) = this()
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: Unit,
      remote: Unit,
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
    def this(
      t: String,
      name: String,
      custom: Boolean,
      props: Inputs,
      opts: ResourceOptions,
      remote: Unit,
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
    
    @JSImport("@pulumi/pulumi/resource", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean]
  }
  
  inline def createUrn(name: Input[String], `type`: Input[String]): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Unit, project: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Unit, project: String, stack: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Unit, project: Unit, stack: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN]): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: Unit, stack: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Resource): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: String, stack: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Resource, project: Unit, stack: String): Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Output_[String]]
  
  inline def mergeOptions(): CustomResourceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")().asInstanceOf[CustomResourceOptions]
  inline def mergeOptions(opts1: Unit, opts2: ComponentResourceOptions): ComponentResourceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any], opts2.asInstanceOf[js.Any])).asInstanceOf[ComponentResourceOptions]
  inline def mergeOptions(opts1: Unit, opts2: CustomResourceOptions): CustomResourceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any], opts2.asInstanceOf[js.Any])).asInstanceOf[CustomResourceOptions]
  inline def mergeOptions(opts1: Unit, opts2: ResourceOptions): ResourceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any], opts2.asInstanceOf[js.Any])).asInstanceOf[ResourceOptions]
  inline def mergeOptions(opts1: ComponentResourceOptions): ComponentResourceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any]).asInstanceOf[ComponentResourceOptions]
  inline def mergeOptions(opts1: ComponentResourceOptions, opts2: ComponentResourceOptions): ComponentResourceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any], opts2.asInstanceOf[js.Any])).asInstanceOf[ComponentResourceOptions]
  inline def mergeOptions(opts1: CustomResourceOptions): CustomResourceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any]).asInstanceOf[CustomResourceOptions]
  inline def mergeOptions(opts1: CustomResourceOptions, opts2: CustomResourceOptions): CustomResourceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any], opts2.asInstanceOf[js.Any])).asInstanceOf[CustomResourceOptions]
  inline def mergeOptions(opts1: ResourceOptions): ResourceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any]).asInstanceOf[ResourceOptions]
  inline def mergeOptions(opts1: ResourceOptions, opts2: ResourceOptions): ResourceOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(opts1.asInstanceOf[js.Any], opts2.asInstanceOf[js.Any])).asInstanceOf[ResourceOptions]
  
  inline def mergeOptions_ComponentResourceOptions(): ComponentResourceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")().asInstanceOf[ComponentResourceOptions]
  
  inline def mergeOptions_ResourceOptions(): ResourceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")().asInstanceOf[ResourceOptions]
  
  @JSImport("@pulumi/pulumi/resource", "rootStackResource")
  @js.native
  val rootStackResource: Resource = js.native
  
  trait Alias extends StObject {
    
    /**
      * The previous name of the resource.  If not provided, the current name of the resource is
      * used.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The previous parent of the resource.  If not provided (i.e. `{ name: "foo" }`), the current
      * parent of the resource is used (`opts.parent` if provided, else the implicit stack resource
      * parent).
      *
      * To specify no original parent, use `{ parent: pulumi.rootStackResource }`.
      */
    var parent: js.UndefOr[Resource | Input[URN]] = js.undefined
    
    /**
      * The previous project of the resource. If not provided, defaults to `pulumi.getProject()`.
      */
    var project: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The previous stack of the resource.  If not provided, defaults to `pulumi.getStack()`.
      */
    var stack: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The previous type of the resource.  If not provided, the current type of the resource is used.
      */
    var `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object Alias {
    
    inline def apply(): Alias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: Resource | Input[URN]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setProject(value: Input[String]): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setStack(value: Input[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ComponentResourceOptions
    extends StObject
       with ResourceOptions {
    
    /**
      * An optional set of providers to use for child resources. Either keyed by package name (e.g.
      * "aws"), or just provided as an array.  In the latter case, the package name will be retrieved
      * from the provider itself.
      *
      * In the case of a single provider, the options can be simplified to just pass along `provider: theProvider`
      *
      * Note: do not provide both [provider] and [providers];
      */
    var providers: js.UndefOr[(Record[String, ProviderResource]) | js.Array[ProviderResource]] = js.undefined
  }
  object ComponentResourceOptions {
    
    inline def apply(): ComponentResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentResourceOptions]
    }
    
    extension [Self <: ComponentResourceOptions](x: Self) {
      
      inline def setProviders(value: (Record[String, ProviderResource]) | js.Array[ProviderResource]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      inline def setProvidersVarargs(value: ProviderResource*): Self = StObject.set(x, "providers", js.Array(value :_*))
    }
  }
  
  trait CustomResourceOptions
    extends StObject
       with ResourceOptions {
    
    /**
      * The names of outputs for this resource that should be treated as secrets. This augments the list that
      * the resource provider and pulumi engine already determine based on inputs to your resource. It can be used
      * to mark certain ouputs as a secrets on a per resource basis.
      */
    var additionalSecretOutputs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * When set to true, deleteBeforeReplace indicates that this resource should be deleted before its replacement
      * is created when replacement is necessary.
      */
    var deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When provided with a resource ID, import indicates that this resource's provider should import its state from
      * the cloud resource with the given ID. The inputs to the resource's constructor must align with the resource's
      * current state. Once a resource has been imported, the import property must be removed from the resource's
      * options.
      */
    var `import`: js.UndefOr[ID] = js.undefined
  }
  object CustomResourceOptions {
    
    inline def apply(): CustomResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomResourceOptions]
    }
    
    extension [Self <: CustomResourceOptions](x: Self) {
      
      inline def setAdditionalSecretOutputs(value: js.Array[String]): Self = StObject.set(x, "additionalSecretOutputs", value.asInstanceOf[js.Any])
      
      inline def setAdditionalSecretOutputsUndefined: Self = StObject.set(x, "additionalSecretOutputs", js.undefined)
      
      inline def setAdditionalSecretOutputsVarargs(value: String*): Self = StObject.set(x, "additionalSecretOutputs", js.Array(value :_*))
      
      inline def setDeleteBeforeReplace(value: Boolean): Self = StObject.set(x, "deleteBeforeReplace", value.asInstanceOf[js.Any])
      
      inline def setDeleteBeforeReplaceUndefined: Self = StObject.set(x, "deleteBeforeReplace", js.undefined)
      
      inline def setImport(value: ID): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    }
  }
  
  trait CustomTimeouts extends StObject {
    
    /**
      * The optional create timeout represented as a string e.g. 5m, 40s, 1d.
      */
    var create: js.UndefOr[String] = js.undefined
    
    /**
      * The optional delete timeout represented as a string e.g. 5m, 40s, 1d.
      */
    var delete: js.UndefOr[String] = js.undefined
    
    /**
      * The optional update timeout represented as a string e.g. 5m, 40s, 1d.
      */
    var update: js.UndefOr[String] = js.undefined
  }
  object CustomTimeouts {
    
    inline def apply(): CustomTimeouts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomTimeouts]
    }
    
    extension [Self <: CustomTimeouts](x: Self) {
      
      inline def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type ID = String
  
  trait ResourceOptions extends StObject {
    
    /**
      * An optional list of aliases to treat this resource as matching.
      */
    var aliases: js.UndefOr[js.Array[Input[URN | Alias]]] = js.undefined
    
    /**
      * An optional customTimeouts configuration block.
      */
    var customTimeouts: js.UndefOr[CustomTimeouts] = js.undefined
    
    /**
      * An optional additional explicit dependencies on other resources.
      */
    var dependsOn: js.UndefOr[Input[js.Array[Input[Resource]] | Resource]] = js.undefined
    
    /**
      * An optional existing ID to load, rather than create.
      */
    var id: js.UndefOr[Input[ID]] = js.undefined
    
    /**
      * Ignore changes to any of the specified properties.
      */
    var ignoreChanges: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An optional parent resource to which this resource belongs.
      */
    var parent: js.UndefOr[Resource] = js.undefined
    
    /**
      * When set to true, protect ensures this resource cannot be deleted.
      */
    var protect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional provider to use for this resource's CRUD operations. If no provider is supplied,
      * the default provider for the resource's package will be used. The default provider is pulled
      * from the parent's provider bag (see also ComponentResourceOptions.providers).
      *
      * If this is a [ComponentResourceOptions] do not provide both [provider] and [providers]
      */
    var provider: js.UndefOr[ProviderResource] = js.undefined
    
    /**
      * Optional list of transformations to apply to this resource during construction. The
      * transformations are applied in order, and are applied prior to transformation applied to
      * parents walking from the resource up to the stack.
      */
    var transformations: js.UndefOr[js.Array[ResourceTransformation]] = js.undefined
    
    /**
      * An optional version, corresponding to the version of the provider plugin that should be used when operating on
      * this resource. This version overrides the version information inferred from the current package and should
      * rarely be used.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object ResourceOptions {
    
    inline def apply(): ResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceOptions]
    }
    
    extension [Self <: ResourceOptions](x: Self) {
      
      inline def setAliases(value: js.Array[Input[URN | Alias]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: (Input[URN | Alias])*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      inline def setCustomTimeouts(value: CustomTimeouts): Self = StObject.set(x, "customTimeouts", value.asInstanceOf[js.Any])
      
      inline def setCustomTimeoutsUndefined: Self = StObject.set(x, "customTimeouts", js.undefined)
      
      inline def setDependsOn(value: Input[js.Array[Input[Resource]] | Resource]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
      
      inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
      
      inline def setDependsOnVarargs(value: Input[Resource]*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
      
      inline def setId(value: Input[ID]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIgnoreChanges(value: js.Array[String]): Self = StObject.set(x, "ignoreChanges", value.asInstanceOf[js.Any])
      
      inline def setIgnoreChangesUndefined: Self = StObject.set(x, "ignoreChanges", js.undefined)
      
      inline def setIgnoreChangesVarargs(value: String*): Self = StObject.set(x, "ignoreChanges", js.Array(value :_*))
      
      inline def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setProtect(value: Boolean): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
      
      inline def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
      
      inline def setProvider(value: ProviderResource): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setTransformations(value: js.Array[ResourceTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      inline def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
      
      inline def setTransformationsVarargs(value: ResourceTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type ResourceTransformation = js.Function1[/* args */ ResourceTransformationArgs, js.UndefOr[ResourceTransformationResult]]
  
  trait ResourceTransformationArgs extends StObject {
    
    /**
      * The name of the Resource.
      */
    var name: String
    
    /**
      * The original resource options passed to the Resource constructor.
      */
    var opts: ResourceOptions
    
    /**
      * The original properties passed to the Resource constructor.
      */
    var props: Inputs
    
    /**
      * The Resource instance that is being transformed.
      */
    var resource: Resource
    
    /**
      * The type of the Resource.
      */
    var `type`: String
  }
  object ResourceTransformationArgs {
    
    inline def apply(name: String, opts: ResourceOptions, props: Inputs, resource: Resource, `type`: String): ResourceTransformationArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTransformationArgs]
    }
    
    extension [Self <: ResourceTransformationArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: ResourceOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Inputs): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceTransformationResult extends StObject {
    
    /**
      * The new resource options to use in place of the original `opts`
      */
    var opts: ResourceOptions
    
    /**
      * The new properties to use in place of the original `props`
      */
    var props: Inputs
  }
  object ResourceTransformationResult {
    
    inline def apply(opts: ResourceOptions, props: Inputs): ResourceTransformationResult = {
      val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTransformationResult]
    }
    
    extension [Self <: ResourceTransformationResult](x: Self) {
      
      inline def setOpts(value: ResourceOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Inputs): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type URN = String
}

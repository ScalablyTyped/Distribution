package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.archiveMod.AssetMap
import typings.pulumiPulumi.assetMod.Archive
import typings.pulumiPulumi.assetMod.Asset
import typings.pulumiPulumi.codePathsMod.CodePathOptions
import typings.pulumiPulumi.dynamicMod.ResourceProvider
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.mocksMod.Mocks
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.OutputConstructor
import typings.pulumiPulumi.outputMod.Unwrap
import typings.pulumiPulumi.providerProviderMod.Provider
import typings.pulumiPulumi.queryableMod.ResolvedResource
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ResourceOptions
import typings.pulumiPulumi.resourceMod.ResourceTransformation
import typings.pulumiPulumi.resourceMod.URN
import typings.pulumiPulumi.rpcMod.OutputResolvers
import typings.pulumiPulumi.rpcMod.ResourceModule
import typings.pulumiPulumi.rpcMod.ResourcePackage
import typings.pulumiPulumi.serializeClosureMod.SerializeFunctionArgs
import typings.pulumiPulumi.serializeClosureMod.SerializedFunction
import typings.pulumiPulumi.stackMod.Stack
import typings.pulumiPulumi.stackReferenceMod.StackReferenceArgs
import typings.pulumiQuery.interfacesMod.AsyncIterable
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import typings.std.Error
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/pulumi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi", "ComponentResource")
  @js.native
  class ComponentResource[TData] protected ()
    extends typings.pulumiPulumi.resourceMod.ComponentResource[TData] {
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
  }
  /* static members */
  object ComponentResource {
    
    @JSImport("@pulumi/pulumi", "ComponentResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi", "Config")
  @js.native
  class Config ()
    extends typings.pulumiPulumi.configMod.Config {
    def this(name: String) = this()
  }
  
  @JSImport("@pulumi/pulumi", "CustomResource")
  @js.native
  abstract class CustomResource protected ()
    extends typings.pulumiPulumi.resourceMod.CustomResource {
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
  }
  /* static members */
  object CustomResource {
    
    @JSImport("@pulumi/pulumi", "CustomResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.CustomResource */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi", "DependencyProviderResource")
  @js.native
  class DependencyProviderResource protected ()
    extends typings.pulumiPulumi.resourceMod.DependencyProviderResource {
    def this(ref: String) = this()
  }
  
  @JSImport("@pulumi/pulumi", "DependencyResource")
  @js.native
  class DependencyResource protected ()
    extends typings.pulumiPulumi.resourceMod.DependencyResource {
    def this(urn: URN) = this()
  }
  
  @JSImport("@pulumi/pulumi", "Output")
  @js.native
  val Output_ : OutputConstructor = js.native
  
  @JSImport("@pulumi/pulumi", "ProviderResource")
  @js.native
  abstract class ProviderResource protected ()
    extends typings.pulumiPulumi.resourceMod.ProviderResource {
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
    
    @JSImport("@pulumi/pulumi", "ProviderResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def register(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[js.Promise[js.UndefOr[String]]]
    inline def register(provider: typings.pulumiPulumi.resourceMod.ProviderResource): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  }
  
  @JSImport("@pulumi/pulumi", "Resource")
  @js.native
  abstract class Resource protected ()
    extends typings.pulumiPulumi.resourceMod.Resource {
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
  }
  /* static members */
  object Resource {
    
    @JSImport("@pulumi/pulumi", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.Resource */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi", "ResourceError")
  @js.native
  class ResourceError protected ()
    extends typings.pulumiPulumi.errorsMod.ResourceError {
    def this(message: String) = this()
    def this(message: String, resource: typings.pulumiPulumi.resourceMod.Resource) = this()
    def this(message: String, resource: Unit, hideStack: Boolean) = this()
    def this(message: String, resource: typings.pulumiPulumi.resourceMod.Resource, hideStack: Boolean) = this()
  }
  /* static members */
  object ResourceError {
    
    @JSImport("@pulumi/pulumi", "ResourceError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi", "RunError")
  @js.native
  class RunError protected ()
    extends typings.pulumiPulumi.errorsMod.RunError {
    def this(message: String) = this()
  }
  /* static members */
  object RunError {
    
    @JSImport("@pulumi/pulumi", "RunError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of a RunError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi", "StackReference")
  @js.native
  class StackReference protected ()
    extends typings.pulumiPulumi.stackReferenceMod.StackReference {
    /**
      * Create a StackReference resource with the given unique name, arguments, and options.
      *
      * If args is not specified, the name of the referenced stack will be the name of the StackReference resource.
      *
      * @param name The _unique_ name of the stack reference.
      * @param args The arguments to use to populate this resource's properties.
      * @Param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackReferenceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StackReferenceArgs, opts: CustomResourceOptions) = this()
  }
  
  inline def all[T](ds: js.Array[js.UndefOr[Input[T]]]): typings.pulumiPulumi.outputMod.Output_[js.Array[Unwrap[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(ds.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Array[Unwrap[T]]]]
  inline def all[T](`val`: Record[String, Input[T]]): typings.pulumiPulumi.outputMod.Output_[Record[String, Unwrap[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Record[String, Unwrap[T]]]]
  inline def all[T1, T2](values: js.Tuple2[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]]]): typings.pulumiPulumi.outputMod.Output_[js.Tuple2[Unwrap[T1], Unwrap[T2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple2[Unwrap[T1], Unwrap[T2]]]]
  inline def all[T1, T2, T3](values: js.Tuple3[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]], js.UndefOr[Input[T3]]]): typings.pulumiPulumi.outputMod.Output_[js.Tuple3[Unwrap[T1], Unwrap[T2], Unwrap[T3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple3[Unwrap[T1], Unwrap[T2], Unwrap[T3]]]]
  inline def all[T1, T2, T3, T4](
    values: js.Tuple4[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[js.Tuple4[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple4[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4]]]]
  inline def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[js.Tuple5[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple5[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5]]]]
  inline def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[
    js.Tuple6[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[
    js.Tuple6[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6]]
  ]]
  inline def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[
    js.Tuple7[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[
    js.Tuple7[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7]]
  ]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]], 
      js.UndefOr[Input[T8]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[
    js.Tuple8[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7], Unwrap[T8]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[
    js.Tuple8[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7], Unwrap[T8]]
  ]]
  
  object asset {
    
    @JSImport("@pulumi/pulumi", "asset.Archive")
    @js.native
    abstract class Archive ()
      extends typings.pulumiPulumi.assetMod.Archive
    /* static members */
    object Archive {
      
      @JSImport("@pulumi/pulumi", "asset.Archive")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns true if the given object is an instance of an Archive.  This is designed to work even when
        * multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean]
    }
    
    @JSImport("@pulumi/pulumi", "asset.Asset")
    @js.native
    abstract class Asset ()
      extends typings.pulumiPulumi.assetMod.Asset
    /* static members */
    object Asset {
      
      @JSImport("@pulumi/pulumi", "asset.Asset")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns true if the given object is an instance of an Asset.  This is designed to work even when
        * multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean]
    }
    
    @JSImport("@pulumi/pulumi", "asset.AssetArchive")
    @js.native
    class AssetArchive protected ()
      extends typings.pulumiPulumi.assetMod.AssetArchive {
      def this(assets: js.Promise[AssetMap]) = this()
      def this(assets: AssetMap) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.FileArchive")
    @js.native
    class FileArchive protected ()
      extends typings.pulumiPulumi.assetMod.FileArchive {
      def this(path: String) = this()
      def this(path: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.FileAsset")
    @js.native
    class FileAsset protected ()
      extends typings.pulumiPulumi.assetMod.FileAsset {
      def this(path: String) = this()
      def this(path: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.RemoteArchive")
    @js.native
    class RemoteArchive protected ()
      extends typings.pulumiPulumi.assetMod.RemoteArchive {
      def this(uri: String) = this()
      def this(uri: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.RemoteAsset")
    @js.native
    class RemoteAsset protected ()
      extends typings.pulumiPulumi.assetMod.RemoteAsset {
      def this(uri: String) = this()
      def this(uri: js.Promise[String]) = this()
    }
    
    @JSImport("@pulumi/pulumi", "asset.StringAsset")
    @js.native
    class StringAsset protected ()
      extends typings.pulumiPulumi.assetMod.StringAsset {
      def this(text: String) = this()
      def this(text: js.Promise[String]) = this()
    }
  }
  
  inline def concat(params: Input[js.Any]*): typings.pulumiPulumi.outputMod.Output_[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(params.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  
  inline def containsUnknowns(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsUnknowns")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def createUrn(name: Input[String], `type`: Input[String]): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Unit, project: String): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Unit, project: String, stack: String): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Unit, project: Unit, stack: String): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN]): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: String): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: String, stack: String): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: Input[URN], project: Unit, stack: String): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(name: Input[String], `type`: Input[String], parent: typings.pulumiPulumi.resourceMod.Resource): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typings.pulumiPulumi.resourceMod.Resource,
    project: String
  ): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typings.pulumiPulumi.resourceMod.Resource,
    project: String,
    stack: String
  ): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  inline def createUrn(
    name: Input[String],
    `type`: Input[String],
    parent: typings.pulumiPulumi.resourceMod.Resource,
    project: Unit,
    stack: String
  ): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUrn")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  
  object dynamic {
    
    @JSImport("@pulumi/pulumi", "dynamic.Resource")
    @js.native
    abstract class Resource protected ()
      extends typings.pulumiPulumi.dynamicMod.Resource {
      /**
        * Creates a new dynamic resource.
        *
        * @param provider The implementation of the resource's CRUD operations.
        * @param name The name of the resource.
        * @param props The arguments to use to populate the new resource. Must not define the reserved
        *              property "__provider".
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(provider: ResourceProvider, name: String, props: Inputs) = this()
      def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
    }
  }
  
  inline def getProject(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProject")().asInstanceOf[String]
  
  inline def getStack(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")().asInstanceOf[String]
  
  inline def interpolate(literals: TemplateStringsArray, placeholders: Input[js.Any]*): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(literals.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  
  inline def isGrpcError(err: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGrpcError")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnknown(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnknown")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object iterable {
    
    @JSImport("@pulumi/pulumi", "iterable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def groupBy[T, V](
      iter: Input[js.Array[Input[T]]],
      selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
    ): typings.pulumiPulumi.outputMod.Output_[StringDictionary[js.Array[V]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[StringDictionary[js.Array[V]]]]
    
    inline def toObject[T, V](
      iter: Input[js.Array[Input[T]]],
      selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
    ): typings.pulumiPulumi.outputMod.Output_[StringDictionary[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[StringDictionary[V]]]
  }
  
  object log {
    
    @JSImport("@pulumi/pulumi", "log")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def debug(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def debug(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def debug(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def debug(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def debug(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def debug(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def debug(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Unit,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def error(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def error(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def error(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def error(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def error(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def error(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def error(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def error(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Unit,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def hasErrors(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasErrors")().asInstanceOf[Boolean]
    
    inline def info(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def info(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def info(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def info(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def info(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def info(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def info(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def info(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Unit,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def warn(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def warn(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def warn(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def warn(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def warn(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def warn(msg: String, resource: typings.pulumiPulumi.resourceMod.Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def warn(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Double,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def warn(
      msg: String,
      resource: typings.pulumiPulumi.resourceMod.Resource,
      streamId: Unit,
      ephemeral: Boolean
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
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
  
  inline def output[T](): typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("output")().asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]]]
  inline def output[T](`val`: Input[T]): typings.pulumiPulumi.outputMod.Output_[Unwrap[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[T]]]
  
  object provider {
    
    @JSImport("@pulumi/pulumi", "provider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def main(provider: Provider, args: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(provider.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@pulumi/pulumi", "rootStackResource")
  @js.native
  val rootStackResource: typings.pulumiPulumi.resourceMod.Resource = js.native
  
  object runtime {
    
    @JSImport("@pulumi/pulumi", "runtime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.StreamInvokeResponse")
    @js.native
    class StreamInvokeResponse[T] protected ()
      extends typings.pulumiPulumi.runtimeMod.StreamInvokeResponse[T] {
      def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
    }
    
    inline def allConfig(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConfig")().asInstanceOf[StringDictionary[String]]
    
    inline def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")().asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(
      extraIncludePaths: js.Array[String],
      extraIncludePackages: js.Array[String],
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(
      extraIncludePaths: js.Array[String],
      extraIncludePackages: Unit,
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(
      extraIncludePaths: Unit,
      extraIncludePackages: js.Array[String],
      extraExcludePackages: js.Array[String]
    ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: Unit, extraExcludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    inline def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
    
    inline def deserializeProperties(outputsStruct: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperties")(outputsStruct.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def deserializeProperty(prop: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def disconnect(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[js.Promise[Unit]]
    
    inline def disconnectSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectSync")().asInstanceOf[Unit]
    
    @JSImport("@pulumi/pulumi", "runtime.excessiveDebugOutput")
    @js.native
    def excessiveDebugOutput: Boolean = js.native
    inline def excessiveDebugOutput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveDebugOutput")(x.asInstanceOf[js.Any])
    
    inline def getConfig(k: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(k.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def getEngine(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[js.UndefOr[js.Object]]
    
    inline def getMonitor(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonitor")().asInstanceOf[js.UndefOr[js.Object]]
    
    inline def getProject(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProject")().asInstanceOf[String]
    
    inline def getRootResource(): js.Promise[js.UndefOr[URN]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootResource")().asInstanceOf[js.Promise[js.UndefOr[URN]]]
    
    inline def getStack(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")().asInstanceOf[String]
    
    inline def getStackResource(): js.UndefOr[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackResource")().asInstanceOf[js.UndefOr[Stack]]
    
    inline def hasEngine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEngine")().asInstanceOf[Boolean]
    
    inline def hasMonitor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMonitor")().asInstanceOf[Boolean]
    
    inline def invoke(tok: String, props: Inputs): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    inline def isDryRun(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDryRun")().asInstanceOf[Boolean]
    
    inline def isLegacyApplyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyApplyEnabled")().asInstanceOf[Boolean]
    
    inline def isQueryMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQueryMode")().asInstanceOf[Boolean]
    
    inline def isRpcSecret(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isTestModeEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTestModeEnabled")().asInstanceOf[Boolean]
    
    inline def leakedPromises(): js.Tuple2[Set[js.Promise[js.Any]], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("leakedPromises")().asInstanceOf[js.Tuple2[Set[js.Promise[js.Any]], String]]
    
    inline def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")().asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
    inline def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
    inline def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
    inline def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](typeFilter: Unit, stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
    
    @JSImport("@pulumi/pulumi", "runtime.maxRPCMessageSize")
    @js.native
    val maxRPCMessageSize: Double = js.native
    
    inline def monitorSupportsFeature(feature: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsFeature")(feature.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def monitorSupportsResourceReferences(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsResourceReferences")().asInstanceOf[js.Promise[Boolean]]
    
    inline def monitorSupportsSecrets(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsSecrets")().asInstanceOf[js.Promise[Boolean]]
    
    inline def readResource(
      res: typings.pulumiPulumi.resourceMod.Resource,
      t: String,
      name: String,
      props: Inputs,
      opts: ResourceOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readResource")(res.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerResource(
      res: typings.pulumiPulumi.resourceMod.Resource,
      t: String,
      name: String,
      custom: Boolean,
      remote: Boolean,
      newDependency: js.Function1[/* urn */ URN, typings.pulumiPulumi.resourceMod.Resource],
      props: Inputs,
      opts: ResourceOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResource")(res.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], newDependency.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerResourceModule(name: String, version: String, module: ResourceModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceModule")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerResourceOutputs(res: typings.pulumiPulumi.resourceMod.Resource, outputs: js.Promise[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerResourceOutputs(res: typings.pulumiPulumi.resourceMod.Resource, outputs: Inputs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerResourceOutputs(
      res: typings.pulumiPulumi.resourceMod.Resource,
      outputs: typings.pulumiPulumi.outputMod.Output_[Inputs]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerResourcePackage(name: String, version: String, pkg: ResourcePackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourcePackage")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerStackTransformation(t: ResourceTransformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStackTransformation")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def resetOptions(
      project: String,
      stack: String,
      parallel: Double,
      engineAddr: String,
      monitorAddr: String,
      preview: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetOptions")(project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], parallel.asInstanceOf[js.Any], engineAddr.asInstanceOf[js.Any], monitorAddr.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolveProperties(
      res: typings.pulumiPulumi.resourceMod.Resource,
      resolvers: Record[
          String, 
          js.Function5[
            /* v */ js.Any, 
            /* isKnown */ Boolean, 
            /* isSecret */ Boolean, 
            /* deps */ js.UndefOr[js.Array[typings.pulumiPulumi.resourceMod.Resource]], 
            /* err */ js.UndefOr[Error], 
            Unit
          ]
        ],
      t: String,
      name: String,
      allProps: js.Any,
      deps: Record[String, js.Array[typings.pulumiPulumi.resourceMod.Resource]]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resolveProperties(
      res: typings.pulumiPulumi.resourceMod.Resource,
      resolvers: Record[
          String, 
          js.Function5[
            /* v */ js.Any, 
            /* isKnown */ Boolean, 
            /* isSecret */ Boolean, 
            /* deps */ js.UndefOr[js.Array[typings.pulumiPulumi.resourceMod.Resource]], 
            /* err */ js.UndefOr[Error], 
            Unit
          ]
        ],
      t: String,
      name: String,
      allProps: js.Any,
      deps: Record[String, js.Array[typings.pulumiPulumi.resourceMod.Resource]],
      err: Error
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@pulumi/pulumi", "runtime.rootPulumiStackTypeName")
    @js.native
    val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
    
    inline def rpcKeepAlive(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcKeepAlive")().asInstanceOf[js.Function0[Unit]]
    
    inline def runInPulumiStack(init: js.Function0[js.Promise[js.Any]]): js.Promise[js.UndefOr[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("runInPulumiStack")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Inputs]]]
    
    inline def serialize(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[Boolean]
    
    inline def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SerializedFunction]]
    inline def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedFunction]]
    
    inline def serializeFunctionAsync(func: js.Function): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any], serialize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, js.Any]]]
    
    inline def serializeProperty(
      ctx: String,
      prop: Input[js.Any],
      dependentResources: Set[typings.pulumiPulumi.resourceMod.Resource]
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    inline def serializeResourceProperties(label: String, props: Inputs): js.Promise[
        js.Tuple2[
          Record[String, js.Any], 
          Map[String, Set[typings.pulumiPulumi.resourceMod.Resource]]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        js.Tuple2[
          Record[String, js.Any], 
          Map[String, Set[typings.pulumiPulumi.resourceMod.Resource]]
        ]
      ]]
    
    inline def setAllConfig(c: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAllConfig")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setConfig(k: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setMockOptions(mockMonitor: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMockOptions(mockMonitor: js.Any, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setMocks(mocks: Mocks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMocks(mocks: Mocks, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setRootResource(res: typings.pulumiPulumi.resourceMod.ComponentResource[js.Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootResource")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@pulumi/pulumi", "runtime.specialArchiveSig")
    @js.native
    val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialAssetSig")
    @js.native
    val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialResourceSig")
    @js.native
    val specialResourceSig: /* "5cf8f73096256a8f31e491e813e4eb8e" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialSecretSig")
    @js.native
    val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
    
    @JSImport("@pulumi/pulumi", "runtime.specialSigKey")
    @js.native
    val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
    
    inline def streamInvoke(tok: String, props: Inputs): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]]]
    inline def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]]]
    
    inline def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressUnhandledGrpcRejections")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    
    inline def terminateRpcs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminateRpcs")().asInstanceOf[Unit]
    
    inline def transferProperties(onto: typings.pulumiPulumi.resourceMod.Resource, label: String, props: Inputs): OutputResolvers = (^.asInstanceOf[js.Dynamic].applyDynamic("transferProperties")(onto.asInstanceOf[js.Any], label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[OutputResolvers]
    
    @JSImport("@pulumi/pulumi", "runtime.unknownValue")
    @js.native
    val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
    
    inline def unwrapRpcSecret(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  inline def secret[T](): typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")().asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]]]
  inline def secret[T](`val`: Input[T]): typings.pulumiPulumi.outputMod.Output_[Unwrap[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[T]]]
}

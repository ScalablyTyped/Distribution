package typings.pulumiPulumi

import typings.pulumiPulumi.anon.Urn
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.ProviderResource
import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Error
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMod {
  
  @JSImport("@pulumi/pulumi/runtime/rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeProperties(outputsStruct: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperties")(outputsStruct.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def deserializeProperty(prop: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isRpcSecret(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def registerResourceModule(name: String, version: String, module: ResourceModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceModule")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerResourcePackage(name: String, version: String, pkg: ResourcePackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourcePackage")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ js.Any, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: js.Any,
    deps: Record[String, js.Array[Resource]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ js.Any, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: js.Any,
    deps: Record[String, js.Array[Resource]],
    err: Error
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, js.Any]]]
  
  @scala.inline
  def serializeProperty(ctx: String, prop: Input[js.Any], dependentResources: Set[Resource]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, js.Any], Map[String, Set[Resource]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Record[String, js.Any], Map[String, Set[Resource]]]]]
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialArchiveSig")
  @js.native
  val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialAssetSig")
  @js.native
  val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialResourceSig")
  @js.native
  val specialResourceSig: /* "5cf8f73096256a8f31e491e813e4eb8e" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialSecretSig")
  @js.native
  val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialSigKey")
  @js.native
  val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
  
  @scala.inline
  def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressUnhandledGrpcRejections")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = (^.asInstanceOf[js.Dynamic].applyDynamic("transferProperties")(onto.asInstanceOf[js.Any], label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[OutputResolvers]
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "unknownValue")
  @js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  
  @scala.inline
  def unwrapRpcSecret(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type OutputResolvers = Record[
    String, 
    js.Function5[
      /* value */ js.Any, 
      /* isStable */ Boolean, 
      /* isSecret */ Boolean, 
      /* deps */ js.UndefOr[js.Array[Resource]], 
      /* err */ js.UndefOr[Error], 
      Unit
    ]
  ]
  
  trait ResourceModule extends StObject {
    
    def construct(name: String, `type`: String, args: js.Any, opts: Urn): Resource
  }
  object ResourceModule {
    
    @scala.inline
    def apply(construct: (String, String, js.Any, Urn) => Resource): ResourceModule = {
      val __obj = js.Dynamic.literal(construct = js.Any.fromFunction4(construct))
      __obj.asInstanceOf[ResourceModule]
    }
    
    @scala.inline
    implicit class ResourceModuleMutableBuilder[Self <: ResourceModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstruct(value: (String, String, js.Any, Urn) => Resource): Self = StObject.set(x, "construct", js.Any.fromFunction4(value))
    }
  }
  
  trait ResourcePackage extends StObject {
    
    def constructProvider(name: String, `type`: String, args: js.Any, opts: Urn): ProviderResource
  }
  object ResourcePackage {
    
    @scala.inline
    def apply(constructProvider: (String, String, js.Any, Urn) => ProviderResource): ResourcePackage = {
      val __obj = js.Dynamic.literal(constructProvider = js.Any.fromFunction4(constructProvider))
      __obj.asInstanceOf[ResourcePackage]
    }
    
    @scala.inline
    implicit class ResourcePackageMutableBuilder[Self <: ResourcePackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructProvider(value: (String, String, js.Any, Urn) => ProviderResource): Self = StObject.set(x, "constructProvider", js.Any.fromFunction4(value))
    }
  }
}

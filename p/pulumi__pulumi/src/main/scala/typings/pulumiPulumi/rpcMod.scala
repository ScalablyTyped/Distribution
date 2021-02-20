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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcMod {
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "deserializeProperties")
  @js.native
  def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "deserializeProperty")
  @js.native
  def deserializeProperty(prop: js.Any): js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "isRpcSecret")
  @js.native
  def isRpcSecret(obj: js.Any): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "registerResourceModule")
  @js.native
  def registerResourceModule(name: String, version: String, module: ResourceModule): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "registerResourcePackage")
  @js.native
  def registerResourcePackage(name: String, version: String, pkg: ResourcePackage): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "resolveProperties")
  @js.native
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ _, 
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
  ): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/rpc", "resolveProperties")
  @js.native
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ _, 
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
  ): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "serializeProperties")
  @js.native
  def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, _]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "serializeProperty")
  @js.native
  def serializeProperty(ctx: String, prop: Input[_], dependentResources: Set[Resource]): js.Promise[_] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "serializeResourceProperties")
  @js.native
  def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, _], Map[String, Set[Resource]]]] = js.native
  
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
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "suppressUnhandledGrpcRejections")
  @js.native
  def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "transferProperties")
  @js.native
  def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "unknownValue")
  @js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "unwrapRpcSecret")
  @js.native
  def unwrapRpcSecret(obj: js.Any): js.Any = js.native
  
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
  
  @js.native
  trait ResourceModule extends StObject {
    
    def construct(name: String, `type`: String, args: js.Any, opts: Urn): Resource = js.native
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
  
  @js.native
  trait ResourcePackage extends StObject {
    
    def constructProvider(name: String, `type`: String, args: js.Any, opts: Urn): ProviderResource = js.native
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

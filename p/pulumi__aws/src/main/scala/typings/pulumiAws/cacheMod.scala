package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("@pulumi/aws/storagegateway/cache", "Cache")
  @js.native
  class Cache protected () extends CustomResource {
    /**
      * Create a Cache resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CacheArgs) = this()
    def this(name: String, args: CacheArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Output_[String] = js.native
  }
  /* static members */
  object Cache {
    
    @JSImport("@pulumi/aws/storagegateway/cache", "Cache")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cache]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cache]
    inline def get(name: String, id: Input[ID], state: CacheState): Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cache]
    inline def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): Cache = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cache]
    
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean]
  }
  
  trait CacheArgs extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: Input[String]
  }
  object CacheArgs {
    
    inline def apply(diskId: Input[String], gatewayArn: Input[String]): CacheArgs = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheArgs]
    }
    
    extension [Self <: CacheArgs](x: Self) {
      
      inline def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheState extends StObject {
    
    /**
      * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
      */
    val diskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: js.UndefOr[Input[String]] = js.undefined
  }
  object CacheState {
    
    inline def apply(): CacheState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheState]
    }
    
    extension [Self <: CacheState](x: Self) {
      
      inline def setDiskId(value: Input[String]): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setDiskIdUndefined: Self = StObject.set(x, "diskId", js.undefined)
      
      inline def setGatewayArn(value: Input[String]): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setGatewayArnUndefined: Self = StObject.set(x, "gatewayArn", js.undefined)
    }
  }
}

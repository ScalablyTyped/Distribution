package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalDiskMod {
  
  @JSImport("@pulumi/aws/storagegateway/getLocalDisk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalDisk")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalDiskResult]]
  inline def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalDisk")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalDiskResult]]
  
  trait GetLocalDiskArgs extends StObject {
    
    /**
      * The device node of the local disk to retrieve. For example, `/dev/sdb`.
      */
    val diskNode: js.UndefOr[String] = js.undefined
    
    /**
      * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
      */
    val diskPath: js.UndefOr[String] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: String
  }
  object GetLocalDiskArgs {
    
    inline def apply(gatewayArn: String): GetLocalDiskArgs = {
      val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalDiskArgs]
    }
    
    extension [Self <: GetLocalDiskArgs](x: Self) {
      
      inline def setDiskNode(value: String): Self = StObject.set(x, "diskNode", value.asInstanceOf[js.Any])
      
      inline def setDiskNodeUndefined: Self = StObject.set(x, "diskNode", js.undefined)
      
      inline def setDiskPath(value: String): Self = StObject.set(x, "diskPath", value.asInstanceOf[js.Any])
      
      inline def setDiskPathUndefined: Self = StObject.set(x, "diskPath", js.undefined)
      
      inline def setGatewayArn(value: String): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLocalDiskResult extends StObject {
    
    /**
      * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
      */
    val diskId: String
    
    val diskNode: js.UndefOr[String] = js.undefined
    
    val diskPath: js.UndefOr[String] = js.undefined
    
    val gatewayArn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetLocalDiskResult {
    
    inline def apply(diskId: String, gatewayArn: String, id: String): GetLocalDiskResult = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalDiskResult]
    }
    
    extension [Self <: GetLocalDiskResult](x: Self) {
      
      inline def setDiskId(value: String): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      inline def setDiskNode(value: String): Self = StObject.set(x, "diskNode", value.asInstanceOf[js.Any])
      
      inline def setDiskNodeUndefined: Self = StObject.set(x, "diskNode", js.undefined)
      
      inline def setDiskPath(value: String): Self = StObject.set(x, "diskPath", value.asInstanceOf[js.Any])
      
      inline def setDiskPathUndefined: Self = StObject.set(x, "diskPath", js.undefined)
      
      inline def setGatewayArn(value: String): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}

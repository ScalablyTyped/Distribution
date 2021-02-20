package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalDiskMod {
  
  @JSImport("@pulumi/aws/storagegateway/getLocalDisk", "getLocalDisk")
  @js.native
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] = js.native
  @JSImport("@pulumi/aws/storagegateway/getLocalDisk", "getLocalDisk")
  @js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] = js.native
  
  @js.native
  trait GetLocalDiskArgs extends StObject {
    
    /**
      * The device node of the local disk to retrieve. For example, `/dev/sdb`.
      */
    val diskNode: js.UndefOr[String] = js.native
    
    /**
      * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
      */
    val diskPath: js.UndefOr[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the gateway.
      */
    val gatewayArn: String = js.native
  }
  object GetLocalDiskArgs {
    
    @scala.inline
    def apply(gatewayArn: String): GetLocalDiskArgs = {
      val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalDiskArgs]
    }
    
    @scala.inline
    implicit class GetLocalDiskArgsMutableBuilder[Self <: GetLocalDiskArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiskNode(value: String): Self = StObject.set(x, "diskNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskNodeUndefined: Self = StObject.set(x, "diskNode", js.undefined)
      
      @scala.inline
      def setDiskPath(value: String): Self = StObject.set(x, "diskPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskPathUndefined: Self = StObject.set(x, "diskPath", js.undefined)
      
      @scala.inline
      def setGatewayArn(value: String): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetLocalDiskResult extends StObject {
    
    /**
      * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
      */
    val diskId: String = js.native
    
    val diskNode: js.UndefOr[String] = js.native
    
    val diskPath: js.UndefOr[String] = js.native
    
    val gatewayArn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
  }
  object GetLocalDiskResult {
    
    @scala.inline
    def apply(diskId: String, gatewayArn: String, id: String): GetLocalDiskResult = {
      val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalDiskResult]
    }
    
    @scala.inline
    implicit class GetLocalDiskResultMutableBuilder[Self <: GetLocalDiskResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiskId(value: String): Self = StObject.set(x, "diskId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskNode(value: String): Self = StObject.set(x, "diskNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskNodeUndefined: Self = StObject.set(x, "diskNode", js.undefined)
      
      @scala.inline
      def setDiskPath(value: String): Self = StObject.set(x, "diskPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskPathUndefined: Self = StObject.set(x, "diskPath", js.undefined)
      
      @scala.inline
      def setGatewayArn(value: String): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}

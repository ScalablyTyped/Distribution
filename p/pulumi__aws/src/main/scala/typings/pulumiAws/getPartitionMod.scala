package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPartitionMod {
  
  @JSImport("@pulumi/aws/getPartition", "getPartition")
  @js.native
  def getPartition(): js.Promise[GetPartitionResult] = js.native
  @JSImport("@pulumi/aws/getPartition", "getPartition")
  @js.native
  def getPartition(opts: InvokeOptions): js.Promise[GetPartitionResult] = js.native
  
  @js.native
  trait GetPartitionResult extends StObject {
    
    /**
      * Base DNS domain name for the current partition (e.g. `amazonaws.com` in AWS Commercial, `amazonaws.com.cn` in AWS China).
      */
    val dnsSuffix: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Identifier of the current partition (e.g. `aws` in AWS Commercial, `aws-cn` in AWS China).
      */
    val partition: String = js.native
  }
  object GetPartitionResult {
    
    @scala.inline
    def apply(dnsSuffix: String, id: String, partition: String): GetPartitionResult = {
      val __obj = js.Dynamic.literal(dnsSuffix = dnsSuffix.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPartitionResult]
    }
    
    @scala.inline
    implicit class GetPartitionResultMutableBuilder[Self <: GetPartitionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    }
  }
}

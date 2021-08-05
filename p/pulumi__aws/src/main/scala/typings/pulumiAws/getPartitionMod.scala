package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPartitionMod {
  
  @JSImport("@pulumi/aws/getPartition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPartition(): js.Promise[GetPartitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPartition")().asInstanceOf[js.Promise[GetPartitionResult]]
  inline def getPartition(opts: InvokeOptions): js.Promise[GetPartitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPartition")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPartitionResult]]
  
  trait GetPartitionResult extends StObject {
    
    /**
      * Base DNS domain name for the current partition (e.g. `amazonaws.com` in AWS Commercial, `amazonaws.com.cn` in AWS China).
      */
    val dnsSuffix: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Identifier of the current partition (e.g. `aws` in AWS Commercial, `aws-cn` in AWS China).
      */
    val partition: String
  }
  object GetPartitionResult {
    
    inline def apply(dnsSuffix: String, id: String, partition: String): GetPartitionResult = {
      val __obj = js.Dynamic.literal(dnsSuffix = dnsSuffix.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPartitionResult]
    }
    
    extension [Self <: GetPartitionResult](x: Self) {
      
      inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    }
  }
}

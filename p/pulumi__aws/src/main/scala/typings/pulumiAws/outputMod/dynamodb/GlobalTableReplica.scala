package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTableReplica extends StObject {
  
  /**
    * AWS region name of replica DynamoDB Table. e.g. `us-east-1`
    */
  var regionName: String
}
object GlobalTableReplica {
  
  @scala.inline
  def apply(regionName: String): GlobalTableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableReplica]
  }
  
  @scala.inline
  implicit class GlobalTableReplicaMutableBuilder[Self <: GlobalTableReplica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: String): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
  }
}

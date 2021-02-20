package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableReplica extends StObject {
  
  var regionName: String = js.native
}
object GetTableReplica {
  
  @scala.inline
  def apply(regionName: String): GetTableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableReplica]
  }
  
  @scala.inline
  implicit class GetTableReplicaMutableBuilder[Self <: GetTableReplica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: String): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
  }
}

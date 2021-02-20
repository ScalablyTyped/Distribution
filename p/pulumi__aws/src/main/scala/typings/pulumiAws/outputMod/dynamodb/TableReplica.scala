package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableReplica extends StObject {
  
  /**
    * Region name of the replica.
    */
  var regionName: String = js.native
}
object TableReplica {
  
  @scala.inline
  def apply(regionName: String): TableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableReplica]
  }
  
  @scala.inline
  implicit class TableReplicaMutableBuilder[Self <: TableReplica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: String): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
  }
}

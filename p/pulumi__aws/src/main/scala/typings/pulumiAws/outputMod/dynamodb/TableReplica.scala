package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableReplica extends StObject {
  
  /**
    * Region name of the replica.
    */
  var regionName: String
}
object TableReplica {
  
  inline def apply(regionName: String): TableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableReplica]
  }
  
  extension [Self <: TableReplica](x: Self) {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
  }
}

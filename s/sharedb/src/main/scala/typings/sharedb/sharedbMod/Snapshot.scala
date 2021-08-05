package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var id: String
  
  var m: SnapshotMeta | Null
  
  var `type`: String | Null
  
  var v: Double
}
object Snapshot {
  
  inline def apply(id: String, v: Double): Snapshot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], m = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setM(value: SnapshotMeta): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMNull: Self = StObject.set(x, "m", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}

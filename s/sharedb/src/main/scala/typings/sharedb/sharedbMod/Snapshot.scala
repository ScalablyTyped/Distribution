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
  
  @scala.inline
  def apply(id: String, v: Double): Snapshot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], m = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: SnapshotMeta): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNull: Self = StObject.set(x, "m", null)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}

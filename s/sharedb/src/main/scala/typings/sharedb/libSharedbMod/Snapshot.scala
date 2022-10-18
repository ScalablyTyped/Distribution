package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot[T] extends StObject {
  
  var data: js.UndefOr[T] = js.undefined
  
  var id: IDString
  
  var m: SnapshotMeta | Null
  
  var `type`: String | Null
  
  var v: VersionNumber
}
object Snapshot {
  
  inline def apply[T](id: IDString, v: VersionNumber): Snapshot[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], m = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Snapshot[T]]
  }
  
  extension [Self <: Snapshot[?], T](x: Self & Snapshot[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: IDString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setM(value: SnapshotMeta): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMNull: Self = StObject.set(x, "m", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setV(value: VersionNumber): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}

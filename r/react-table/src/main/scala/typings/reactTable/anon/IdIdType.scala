package typings.reactTable.anon

import typings.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdIdType[D /* <: js.Object */] extends StObject {
  
  var id: IdType[D]
}
object IdIdType {
  
  inline def apply[D /* <: js.Object */](id: IdType[D]): IdIdType[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdType[D]]
  }
  
  extension [Self <: IdIdType[?], D /* <: js.Object */](x: Self & IdIdType[D]) {
    
    inline def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

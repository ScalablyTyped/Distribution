package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldId extends StObject {
  
  @JSName("$id")
  var $id: String
}
object FieldId {
  
  inline def apply($id: String): FieldId = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldId]
  }
  
  extension [Self <: FieldId](x: Self) {
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
  }
}

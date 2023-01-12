package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Type describing an id used for a field in the `IdSchema` */
trait FieldId extends StObject {
  
  /** The id for a field */
  @JSName("$id")
  var $id: String
}
object FieldId {
  
  inline def apply($id: String): FieldId = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldId] (val x: Self) extends AnyVal {
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
  }
}

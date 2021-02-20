package typings.reactTable.anon

import typings.reactTable.mod.FilterValue
import typings.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value[D /* <: js.Object */] extends StObject {
  
  var id: IdType[D] = js.native
  
  var value: FilterValue = js.native
}
object Value {
  
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D], value: FilterValue): Value[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[D]]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value[_], D /* <: js.Object */] (val x: Self with Value[D]) extends AnyVal {
    
    @scala.inline
    def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalBodyInterface[TRow /* <: js.Object */] extends StObject {
  
  /**
    * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
    * new row data when the save button is clicked in the modal window.
    */
  def getFieldValue(): TRow = js.native
}
object ModalBodyInterface {
  
  @scala.inline
  def apply[TRow /* <: js.Object */](getFieldValue: () => TRow): ModalBodyInterface[TRow] = {
    val __obj = js.Dynamic.literal(getFieldValue = js.Any.fromFunction0(getFieldValue))
    __obj.asInstanceOf[ModalBodyInterface[TRow]]
  }
  
  @scala.inline
  implicit class ModalBodyInterfaceMutableBuilder[Self <: ModalBodyInterface[_], TRow /* <: js.Object */] (val x: Self with ModalBodyInterface[TRow]) extends AnyVal {
    
    @scala.inline
    def setGetFieldValue(value: () => TRow): Self = StObject.set(x, "getFieldValue", js.Any.fromFunction0(value))
  }
}

package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalBodyInterface[TRow /* <: js.Object */] extends StObject {
  
  /**
    * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
    * new row data when the save button is clicked in the modal window.
    */
  def getFieldValue(): TRow
}
object ModalBodyInterface {
  
  inline def apply[TRow /* <: js.Object */](getFieldValue: () => TRow): ModalBodyInterface[TRow] = {
    val __obj = js.Dynamic.literal(getFieldValue = js.Any.fromFunction0(getFieldValue))
    __obj.asInstanceOf[ModalBodyInterface[TRow]]
  }
  
  extension [Self <: ModalBodyInterface[?], TRow /* <: js.Object */](x: Self & ModalBodyInterface[TRow]) {
    
    inline def setGetFieldValue(value: () => TRow): Self = StObject.set(x, "getFieldValue", js.Any.fromFunction0(value))
  }
}

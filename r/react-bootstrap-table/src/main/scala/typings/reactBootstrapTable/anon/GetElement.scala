package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import typings.reactBootstrapTable.mod.EditableAttrs
import typings.reactBootstrapTable.mod.InsertModalColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetElement extends StObject {
  
  def getElement(
    column: InsertModalColumnDescription[Any],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: Any
  ): ReactElement | Boolean
}
object GetElement {
  
  inline def apply(
    getElement: (InsertModalColumnDescription[Any], EditableAttrs, String, Boolean, Any) => ReactElement | Boolean
  ): GetElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
    __obj.asInstanceOf[GetElement]
  }
  
  extension [Self <: GetElement](x: Self) {
    
    inline def setGetElement(
      value: (InsertModalColumnDescription[Any], EditableAttrs, String, Boolean, Any) => ReactElement | Boolean
    ): Self = StObject.set(x, "getElement", js.Any.fromFunction5(value))
  }
}

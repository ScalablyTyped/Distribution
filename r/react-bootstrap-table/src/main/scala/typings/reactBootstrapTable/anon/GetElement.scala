package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import typings.reactBootstrapTable.mod.EditableAttrs
import typings.reactBootstrapTable.mod.InsertModalColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetElement extends StObject {
  
  def getElement(
    column: InsertModalColumnDescription[js.Any],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: js.Any
  ): ReactElement | Boolean
}
object GetElement {
  
  @scala.inline
  def apply(
    getElement: (InsertModalColumnDescription[js.Any], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
  ): GetElement = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction5(getElement))
    __obj.asInstanceOf[GetElement]
  }
  
  @scala.inline
  implicit class GetElementMutableBuilder[Self <: GetElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElement(
      value: (InsertModalColumnDescription[js.Any], EditableAttrs, String, Boolean, js.Any) => ReactElement | Boolean
    ): Self = StObject.set(x, "getElement", js.Any.fromFunction5(value))
  }
}

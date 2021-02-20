package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableAttrs extends StObject {
  
  /**
    * Callback for on cell blur.
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback for onKeyDown.
    */
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Placeholder text to use for the cell editor field.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Function to pass a reference to the input editor field.
    */
  var ref: js.UndefOr[js.Function1[/* ref */ js.Any, _]] = js.native
}
object EditableAttrs {
  
  @scala.inline
  def apply(): EditableAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableAttrs]
  }
  
  @scala.inline
  implicit class EditableAttrsMutableBuilder[Self <: EditableAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: () => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRef(value: /* ref */ js.Any => _): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}

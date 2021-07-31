package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * The default text in the TextInput.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the TextInput can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether multiple lines can be inputted into the TextInput.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the TextInput text is changed. The new text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  /**
    * Whether the TextInput can be written to by the user.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether characters are hidden in the TextInput. Commonly used for passwords.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the TextInput can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object TextInputProps {
  
  @scala.inline
  def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  
  @scala.inline
  implicit class TextInputPropsMutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* text */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

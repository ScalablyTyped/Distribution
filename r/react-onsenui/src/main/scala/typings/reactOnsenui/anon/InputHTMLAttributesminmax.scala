package typings.reactOnsenui.anon

import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.InputHTMLAttributes<'min' | 'max' | 'step'> & {  modifier :string | undefined,   disabled :boolean | undefined,   readOnly :boolean | undefined,   onChange :(e : react.react.ChangeEvent<any>): void | undefined,   onBlur :(e : react.react.FocusEvent<any>): void | undefined,   onFocus :(e : react.react.FocusEvent<any>): void | undefined,   value :string | undefined,   defaultValue :string | undefined,   checked :boolean | undefined,   placeholder :string | undefined,   type :string | undefined,   inputId :string | undefined,   float :boolean | undefined,   name :string | undefined,   autoFocus :boolean | undefined} */
trait InputHTMLAttributesminmax extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var float: js.UndefOr[Boolean] = js.undefined
  
  var inputId: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double | String] = js.undefined
  
  var min: js.UndefOr[Double | String] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[js.Any], Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[js.Any], Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[js.Any], Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double | String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object InputHTMLAttributesminmax {
  
  @scala.inline
  def apply(): InputHTMLAttributesminmax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputHTMLAttributesminmax]
  }
  
  @scala.inline
  implicit class InputHTMLAttributesminmaxMutableBuilder[Self <: InputHTMLAttributesminmax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    @scala.inline
    def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ FocusEvent[js.Any] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ ChangeEvent[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ FocusEvent[js.Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

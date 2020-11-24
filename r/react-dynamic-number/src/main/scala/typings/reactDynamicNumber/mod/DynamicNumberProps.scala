package typings.reactDynamicNumber.mod

import typings.react.mod.ChangeEvent
import typings.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typings.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typings.reactDynamicNumber.reactDynamicNumberStrings.Space
import typings.reactDynamicNumber.reactDynamicNumberStrings._empty
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'> ]:? react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'>[P]} */ @js.native
trait DynamicNumberProps extends js.Object {
  
  var fraction: js.UndefOr[Double] = js.native
  
  var integer: js.UndefOr[Double] = js.native
  
  var negative: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[
      /* event */ ChangeEvent[HTMLInputElement], 
      /* modelValue */ Double, 
      /* viewValue */ String, 
      Unit
    ]
  ] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var positive: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[Dot | Comma] = js.native
  
  var thousand: js.UndefOr[Boolean | Space] = js.native
  
  var value: js.UndefOr[Double | _empty] = js.native
}
object DynamicNumberProps {
  
  @scala.inline
  def apply(): DynamicNumberProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicNumberProps]
  }
  
  @scala.inline
  implicit class DynamicNumberPropsOps[Self <: DynamicNumberProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFraction(value: Double): Self = this.set("fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFraction: Self = this.set("fraction", js.undefined)
    
    @scala.inline
    def setInteger(value: Double): Self = this.set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* event */ ChangeEvent[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    
    @scala.inline
    def setSeparator(value: Dot | Comma): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setThousand(value: Boolean | Space): Self = this.set("thousand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousand: Self = this.set("thousand", js.undefined)
    
    @scala.inline
    def setValue(value: Double | _empty): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

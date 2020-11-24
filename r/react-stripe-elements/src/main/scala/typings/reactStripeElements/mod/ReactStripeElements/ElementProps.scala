package typings.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementProps
  extends typings.stripeV3.stripe.elements.ElementsOptions {
  
  var className: js.UndefOr[String] = js.native
  
  var elementRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.native
  
  var onReady: js.UndefOr[js.Function1[/* el */ HTMLStripeElement, Unit]] = js.native
}
object ElementProps {
  
  @scala.inline
  def apply(): ElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementProps]
  }
  
  @scala.inline
  implicit class ElementPropsOps[Self <: ElementProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setElementRef(value: /* ref */ js.Any => Unit): Self = this.set("elementRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* event */ ElementChangeResponse => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ ElementChangeResponse => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ ElementChangeResponse => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* el */ HTMLStripeElement => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
  }
}

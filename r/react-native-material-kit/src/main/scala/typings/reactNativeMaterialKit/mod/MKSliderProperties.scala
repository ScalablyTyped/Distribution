package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MKSliderProperties extends BaseSlider {
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function0[Unit]] = js.native
}
object MKSliderProperties {
  
  @scala.inline
  def apply(): MKSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSliderProperties]
  }
  
  @scala.inline
  implicit class MKSliderPropertiesOps[Self <: MKSliderProperties] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: () => Unit): Self = this.set("onConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
  }
}

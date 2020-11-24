package typings.reactNativeSimpleRadioButton.mod

import typings.reactNativeSimpleRadioButton.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactNativeRadioFormProps extends DefaultRadioFormProps {
  
  var animation: js.UndefOr[Boolean] = js.native
  
  var buttonColor: js.UndefOr[String] = js.native
  
  var formHorizontal: js.UndefOr[Boolean] = js.native
  
  var initial: js.UndefOr[Double] = js.native
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelHorizontal: js.UndefOr[Boolean] = js.native
  
  var radio_props: js.UndefOr[js.Array[Label]] = js.native
}
object ReactNativeRadioFormProps {
  
  @scala.inline
  def apply(): ReactNativeRadioFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativeRadioFormProps]
  }
  
  @scala.inline
  implicit class ReactNativeRadioFormPropsOps[Self <: ReactNativeRadioFormProps] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setButtonColor(value: String): Self = this.set("buttonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonColor: Self = this.set("buttonColor", js.undefined)
    
    @scala.inline
    def setFormHorizontal(value: Boolean): Self = this.set("formHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormHorizontal: Self = this.set("formHorizontal", js.undefined)
    
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelHorizontal(value: Boolean): Self = this.set("labelHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHorizontal: Self = this.set("labelHorizontal", js.undefined)
    
    @scala.inline
    def setRadio_propsVarargs(value: Label*): Self = this.set("radio_props", js.Array(value :_*))
    
    @scala.inline
    def setRadio_props(value: js.Array[Label]): Self = this.set("radio_props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadio_props: Self = this.set("radio_props", js.undefined)
  }
}

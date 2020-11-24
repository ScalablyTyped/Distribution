package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomTextArea extends ICustomControl {
  
  var component: textarea = js.native
  
  var defaultValue: String = js.native
  
  var maxlength: Double = js.native
  
  var rows: Double = js.native
  
  var show: valueOrfunc[Boolean] = js.native
}
object ICustomTextArea {
  
  @scala.inline
  def apply(
    component: textarea,
    defaultValue: String,
    label: String,
    maxlength: Double,
    ref: String,
    rows: Double,
    show: valueOrfunc[Boolean],
    `type`: String
  ): ICustomTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomTextArea]
  }
  
  @scala.inline
  implicit class ICustomTextAreaOps[Self <: ICustomTextArea] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: textarea): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFunction0(value: () => Boolean): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: valueOrfunc[Boolean]): Self = this.set("show", value.asInstanceOf[js.Any])
  }
}

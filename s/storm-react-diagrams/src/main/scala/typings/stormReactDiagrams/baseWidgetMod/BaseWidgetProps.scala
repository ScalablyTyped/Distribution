package typings.stormReactDiagrams.baseWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWidgetProps extends js.Object {
  /**
    * Override the base class name
    */
  var baseClass: js.UndefOr[String] = js.native
  /**
    * append additional classes
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Additional props to add
    */
  var extraProps: js.UndefOr[js.Any] = js.native
}

object BaseWidgetProps {
  @scala.inline
  def apply(): BaseWidgetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetProps]
  }
  @scala.inline
  implicit class BaseWidgetPropsOps[Self <: BaseWidgetProps] (val x: Self) extends AnyVal {
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
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setExtraProps(value: js.Any): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraProps: Self = this.set("extraProps", js.undefined)
  }
  
}


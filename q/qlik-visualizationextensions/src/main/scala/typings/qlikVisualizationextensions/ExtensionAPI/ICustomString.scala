package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomString extends ICustomControl {
  var defaultValue: String = js.native
  var expression: ExpressionType = js.native
  var maxlength: Double = js.native
  var show: valueOrfunc[Boolean] = js.native
}

object ICustomString {
  @scala.inline
  def apply(
    defaultValue: String,
    expression: ExpressionType,
    label: String,
    maxlength: Double,
    ref: String,
    show: valueOrfunc[Boolean],
    `type`: String
  ): ICustomString = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomString]
  }
  @scala.inline
  implicit class ICustomStringOps[Self <: ICustomString] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: ExpressionType): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowFunction0(value: () => Boolean): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: valueOrfunc[Boolean]): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}


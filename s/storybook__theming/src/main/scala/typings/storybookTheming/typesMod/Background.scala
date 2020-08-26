package typings.storybookTheming.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var app: String = js.native
  var bar: String = js.native
  var content: String = js.native
  var critical: String = js.native
  var gridCellSize: Double = js.native
  var hoverable: String = js.native
  var negative: String = js.native
  var positive: String = js.native
  var warning: String = js.native
}

object Background {
  @scala.inline
  def apply(
    app: String,
    bar: String,
    content: String,
    critical: String,
    gridCellSize: Double,
    hoverable: String,
    negative: String,
    positive: String,
    warning: String
  ): Background = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], gridCellSize = gridCellSize.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setBar(value: String): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritical(value: String): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridCellSize(value: Double): Self = this.set("gridCellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverable(value: String): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegative(value: String): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositive(value: String): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactNativeSafeAreaContext.safeAreaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  var frame: Rect = js.native
  var insets: EdgeInsets = js.native
}

object Metrics {
  @scala.inline
  def apply(frame: Rect, insets: EdgeInsets): Metrics = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
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
    def setFrame(value: Rect): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsets(value: EdgeInsets): Self = this.set("insets", value.asInstanceOf[js.Any])
  }
  
}


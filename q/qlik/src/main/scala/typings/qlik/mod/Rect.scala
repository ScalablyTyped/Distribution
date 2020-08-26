package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends js.Object {
  var qHeight: Double = js.native
  var qLeft: Double = js.native
  var qTop: Double = js.native
  var qWdith: Double = js.native
}

object Rect {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWdith: Double): Rect = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWdith = qWdith.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
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
    def setQHeight(value: Double): Self = this.set("qHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLeft(value: Double): Self = this.set("qLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTop(value: Double): Self = this.set("qTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setQWdith(value: Double): Self = this.set("qWdith", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactScrollRotate.mod

import typings.react.mod.ReactNode
import typings.reactScrollRotate.reactScrollRotateStrings.prec
import typings.reactScrollRotate.reactScrollRotateStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRotateProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.native
  var children: ReactNode = js.native
  var from: js.UndefOr[Double] = js.native
  var loops: js.UndefOr[Double] = js.native
  var method: js.UndefOr[px | prec] = js.native
  var target: js.UndefOr[String] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
}

object ScrollRotateProps {
  @scala.inline
  def apply(): ScrollRotateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRotateProps]
  }
  @scala.inline
  implicit class ScrollRotatePropsOps[Self <: ScrollRotateProps] (val x: Self) extends AnyVal {
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLoops(value: Double): Self = this.set("loops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoops: Self = this.set("loops", js.undefined)
    @scala.inline
    def setMethod(value: px | prec): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}


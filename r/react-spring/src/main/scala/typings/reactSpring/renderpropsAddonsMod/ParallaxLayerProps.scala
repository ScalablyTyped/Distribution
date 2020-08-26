package typings.reactSpring.renderpropsAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallaxLayerProps extends js.Object {
  var factor: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object ParallaxLayerProps {
  @scala.inline
  def apply(): ParallaxLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallaxLayerProps]
  }
  @scala.inline
  implicit class ParallaxLayerPropsOps[Self <: ParallaxLayerProps] (val x: Self) extends AnyVal {
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}


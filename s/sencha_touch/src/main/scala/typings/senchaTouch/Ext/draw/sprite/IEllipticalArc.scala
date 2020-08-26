package typings.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEllipticalArc extends IEllipse {
  /** [Config Option] (Boolean) */
  var anticlockwise: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
}

object IEllipticalArc {
  @scala.inline
  def apply(): IEllipticalArc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllipticalArc]
  }
  @scala.inline
  implicit class IEllipticalArcOps[Self <: IEllipticalArc] (val x: Self) extends AnyVal {
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
    def setAnticlockwise(value: Boolean): Self = this.set("anticlockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnticlockwise: Self = this.set("anticlockwise", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
  
}


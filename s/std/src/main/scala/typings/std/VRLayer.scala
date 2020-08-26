package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRLayer extends js.Object {
  var leftBounds: js.UndefOr[js.Array[Double] | Float32Array | Null] = js.native
  var rightBounds: js.UndefOr[js.Array[Double] | Float32Array | Null] = js.native
  var source: js.UndefOr[HTMLCanvasElement | Null] = js.native
}

object VRLayer {
  @scala.inline
  def apply(): VRLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRLayer]
  }
  @scala.inline
  implicit class VRLayerOps[Self <: VRLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeftBoundsVarargs(value: Double*): Self = this.set("leftBounds", js.Array(value :_*))
    @scala.inline
    def setLeftBounds(value: js.Array[Double] | Float32Array): Self = this.set("leftBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftBounds: Self = this.set("leftBounds", js.undefined)
    @scala.inline
    def setLeftBoundsNull: Self = this.set("leftBounds", null)
    @scala.inline
    def setRightBoundsVarargs(value: Double*): Self = this.set("rightBounds", js.Array(value :_*))
    @scala.inline
    def setRightBounds(value: js.Array[Double] | Float32Array): Self = this.set("rightBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightBounds: Self = this.set("rightBounds", js.undefined)
    @scala.inline
    def setRightBoundsNull: Self = this.set("rightBounds", null)
    @scala.inline
    def setSource(value: HTMLCanvasElement): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}


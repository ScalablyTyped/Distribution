package typings.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined raphael.raphael.RaphaelPotentialFailure<raphael.raphael.RaphaelRgbComponentInfo> */
@js.native
trait RaphaelPotentialFailureRaB extends js.Object {
  /** The RGB blue channel */
  var b: Double = js.native
  /**
    * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
    * properties in this object may not be valid.
    */
  var error: js.UndefOr[Double] = js.native
  /** The RGB green channel */
  var g: Double = js.native
  /** Hex string of the color, in the format `#XXXXXX`. */
  var hex: String = js.native
  /** The RGB red channel */
  var r: Double = js.native
}

object RaphaelPotentialFailureRaB {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double): RaphaelPotentialFailureRaB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelPotentialFailureRaB]
  }
  @scala.inline
  implicit class RaphaelPotentialFailureRaBOps[Self <: RaphaelPotentialFailureRaB] (val x: Self) extends AnyVal {
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
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}


package typings.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  /** High bits */
  var high: Double = js.native
  /** Low bits */
  var low: Double = js.native
  /** Whether unsigned or not */
  var unsigned: Boolean = js.native
}

object Long {
  @scala.inline
  def apply(high: Double, low: Double, unsigned: Boolean): Long = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
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
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsigned(value: Boolean): Self = this.set("unsigned", value.asInstanceOf[js.Any])
  }
  
}


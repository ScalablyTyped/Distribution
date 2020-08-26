package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offset extends js.Object {
  var offset: js.Array[Double] = js.native
  var offsetRelative: js.Array[Double] = js.native
}

object Offset {
  @scala.inline
  def apply(offset: js.Array[Double], offsetRelative: js.Array[Double]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetRelative = offsetRelative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  @scala.inline
  implicit class OffsetOps[Self <: Offset] (val x: Self) extends AnyVal {
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
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetRelativeVarargs(value: Double*): Self = this.set("offsetRelative", js.Array(value :_*))
    @scala.inline
    def setOffsetRelative(value: js.Array[Double]): Self = this.set("offsetRelative", value.asInstanceOf[js.Any])
  }
  
}


package typings.restifyPlugins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxBodySize extends js.Object {
  var maxBodySize: js.UndefOr[Double] = js.native
}

object MaxBodySize {
  @scala.inline
  def apply(): MaxBodySize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxBodySize]
  }
  @scala.inline
  implicit class MaxBodySizeOps[Self <: MaxBodySize] (val x: Self) extends AnyVal {
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
    def setMaxBodySize(value: Double): Self = this.set("maxBodySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBodySize: Self = this.set("maxBodySize", js.undefined)
  }
  
}


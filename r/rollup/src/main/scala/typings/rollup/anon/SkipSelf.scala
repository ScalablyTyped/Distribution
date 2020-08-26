package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipSelf extends js.Object {
  var skipSelf: Boolean = js.native
}

object SkipSelf {
  @scala.inline
  def apply(skipSelf: Boolean): SkipSelf = {
    val __obj = js.Dynamic.literal(skipSelf = skipSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipSelf]
  }
  @scala.inline
  implicit class SkipSelfOps[Self <: SkipSelf] (val x: Self) extends AnyVal {
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
    def setSkipSelf(value: Boolean): Self = this.set("skipSelf", value.asInstanceOf[js.Any])
  }
  
}


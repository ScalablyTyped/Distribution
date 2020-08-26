package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainOptions extends js.Object {
  var onceNext: js.UndefOr[Boolean] = js.native
  var strictNext: js.UndefOr[Boolean] = js.native
}

object ChainOptions {
  @scala.inline
  def apply(): ChainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainOptions]
  }
  @scala.inline
  implicit class ChainOptionsOps[Self <: ChainOptions] (val x: Self) extends AnyVal {
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
    def setOnceNext(value: Boolean): Self = this.set("onceNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnceNext: Self = this.set("onceNext", js.undefined)
    @scala.inline
    def setStrictNext(value: Boolean): Self = this.set("strictNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictNext: Self = this.set("strictNext", js.undefined)
  }
  
}


package typings.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFetchOptions extends js.Object {
  /** Whether expecting a binary response */
  var binary: js.UndefOr[Boolean] = js.native
  /** If `true`, forces the use of XMLHttpRequest */
  var xhr: js.UndefOr[Boolean] = js.native
}

object IFetchOptions {
  @scala.inline
  def apply(): IFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFetchOptions]
  }
  @scala.inline
  implicit class IFetchOptionsOps[Self <: IFetchOptions] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}


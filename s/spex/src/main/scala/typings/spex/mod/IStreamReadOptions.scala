package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamReadOptions extends js.Object {
  var closable: js.UndefOr[Boolean] = js.native
  var readChunks: js.UndefOr[Boolean] = js.native
  var readSize: js.UndefOr[Double] = js.native
}

object IStreamReadOptions {
  @scala.inline
  def apply(): IStreamReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamReadOptions]
  }
  @scala.inline
  implicit class IStreamReadOptionsOps[Self <: IStreamReadOptions] (val x: Self) extends AnyVal {
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
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setReadChunks(value: Boolean): Self = this.set("readChunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadChunks: Self = this.set("readChunks", js.undefined)
    @scala.inline
    def setReadSize(value: Double): Self = this.set("readSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadSize: Self = this.set("readSize", js.undefined)
  }
  
}


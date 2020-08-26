package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedOptions extends js.Object {
  /**
    * Algorithm, defaults to sha1
    */
  var algorithm: js.UndefOr[Algorithm] = js.native
  /**
    * Key encoding, defaults to ascii
    */
  var encoding: js.UndefOr[Encoding] = js.native
}

object SharedOptions {
  @scala.inline
  def apply(): SharedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedOptions]
  }
  @scala.inline
  implicit class SharedOptionsOps[Self <: SharedOptions] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setEncoding(value: Encoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
  
}


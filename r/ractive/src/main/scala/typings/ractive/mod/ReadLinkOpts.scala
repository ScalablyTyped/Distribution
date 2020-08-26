package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLinkOpts extends js.Object {
  /** Whether or not to follow through any upstream links when resolving the source. */
  var canonical: js.UndefOr[Boolean] = js.native
}

object ReadLinkOpts {
  @scala.inline
  def apply(): ReadLinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadLinkOpts]
  }
  @scala.inline
  implicit class ReadLinkOptsOps[Self <: ReadLinkOpts] (val x: Self) extends AnyVal {
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
    def setCanonical(value: Boolean): Self = this.set("canonical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonical: Self = this.set("canonical", js.undefined)
  }
  
}


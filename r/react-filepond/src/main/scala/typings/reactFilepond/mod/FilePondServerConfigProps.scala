package typings.reactFilepond.mod

import typings.reactFilepond.anon.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondServerConfigProps extends js.Object {
  var instantUpload: js.UndefOr[Boolean] = js.native
  var server: js.UndefOr[String | Fetch] = js.native
}

object FilePondServerConfigProps {
  @scala.inline
  def apply(): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
  @scala.inline
  implicit class FilePondServerConfigPropsOps[Self <: FilePondServerConfigProps] (val x: Self) extends AnyVal {
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
    def setInstantUpload(value: Boolean): Self = this.set("instantUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstantUpload: Self = this.set("instantUpload", js.undefined)
    @scala.inline
    def setServer(value: String | Fetch): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}


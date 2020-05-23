package typings.reactFilepond.mod

import typings.reactFilepond.anon.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondServerConfigProps extends js.Object {
  var instantUpload: js.UndefOr[Boolean] = js.undefined
  var server: js.UndefOr[String | Fetch] = js.undefined
}

object FilePondServerConfigProps {
  @scala.inline
  def apply(instantUpload: js.UndefOr[Boolean] = js.undefined, server: String | Fetch = null): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload.get.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
}


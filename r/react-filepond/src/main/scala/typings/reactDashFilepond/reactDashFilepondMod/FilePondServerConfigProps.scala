package typings.reactDashFilepond.reactDashFilepondMod

import typings.reactDashFilepond.Anon_Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondServerConfigProps extends js.Object {
  var instantUpload: js.UndefOr[Boolean] = js.undefined
  var server: js.UndefOr[String | Anon_Fetch] = js.undefined
}

object FilePondServerConfigProps {
  @scala.inline
  def apply(instantUpload: js.UndefOr[Boolean] = js.undefined, server: String | Anon_Fetch = null): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
}


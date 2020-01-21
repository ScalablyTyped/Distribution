package typings.reactFilepond.mod

import typings.reactFilepond.AnonFetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondServerConfigProps extends js.Object {
  var instantUpload: js.UndefOr[Boolean] = js.undefined
  var server: js.UndefOr[String | AnonFetch] = js.undefined
}

object FilePondServerConfigProps {
  @scala.inline
  def apply(instantUpload: js.UndefOr[Boolean] = js.undefined, server: String | AnonFetch = null): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
}


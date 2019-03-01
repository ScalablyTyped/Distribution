package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondServerConfigProps extends js.Object {
  var instantUpload: js.UndefOr[scala.Boolean] = js.undefined
  var server: js.UndefOr[java.lang.String | reactDashFilepondLib.Anon_Fetch] = js.undefined
}

object FilePondServerConfigProps {
  @scala.inline
  def apply(
    instantUpload: js.UndefOr[scala.Boolean] = js.undefined,
    server: java.lang.String | reactDashFilepondLib.Anon_Fetch = null
  ): FilePondServerConfigProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload)
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondServerConfigProps]
  }
}


package typings.qiniu.qiniuMod.conf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "conf.Zone")
@js.native
class Zone protected () extends js.Object {
  def this(
    srcUpHosts: js.UndefOr[js.Any],
    cdnUpHosts: js.UndefOr[js.Any],
    ioHost: js.UndefOr[String],
    rsHost: js.UndefOr[String],
    rsfHost: js.UndefOr[String],
    apiHost: js.UndefOr[String]
  ) = this()
  var apiHost: String = js.native
  var cdnUpHosts: js.Any = js.native
  var ioHost: String = js.native
  var rsHost: String = js.native
  var rsfHost: String = js.native
  var srcUpHosts: js.Any = js.native
}


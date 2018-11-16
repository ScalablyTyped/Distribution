package typings
package sixDashRuntimeLib.SixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsMap extends js.Object {
  @JSName("sso")
  var sso_Original: sixDashRuntimeLib.SixNs.pluginsNs.ssoNs.ssoFactory = js.native
  @JSName("static")
  var static_Original: sixDashRuntimeLib.SixNs.pluginsNs.staticNs.staticFactory = js.native
  @JSName("uac")
  var uac_Original: sixDashRuntimeLib.SixNs.pluginsNs.uacNs.uacFactory = js.native
  @JSName("upm")
  var upm_Original: sixDashRuntimeLib.SixNs.pluginsNs.upmNs.upmFactory = js.native
  def sso(conf: sixDashRuntimeLib.SixNs.pluginsNs.ssoNs.ssoConf): js.Any = js.native
  def static(conf: sixDashRuntimeLib.SixNs.pluginsNs.staticNs.staticConf): middleware = js.native
  def uac(conf: sixDashRuntimeLib.SixNs.pluginsNs.uacNs.uacConf): js.Any = js.native
  def upm(conf: sixDashRuntimeLib.SixNs.pluginsNs.upmNs.upmConf): js.Any = js.native
}


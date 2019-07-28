package typings.sixDashRuntime.SixNs

import typings.sixDashRuntime.SixNs.pluginsNs.ssoNs.ssoConf
import typings.sixDashRuntime.SixNs.pluginsNs.ssoNs.ssoFactory
import typings.sixDashRuntime.SixNs.pluginsNs.staticNs.staticConf
import typings.sixDashRuntime.SixNs.pluginsNs.staticNs.staticFactory
import typings.sixDashRuntime.SixNs.pluginsNs.uacNs.uacConf
import typings.sixDashRuntime.SixNs.pluginsNs.uacNs.uacFactory
import typings.sixDashRuntime.SixNs.pluginsNs.upmNs.upmConf
import typings.sixDashRuntime.SixNs.pluginsNs.upmNs.upmFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsMap extends js.Object {
  @JSName("sso")
  var sso_Original: ssoFactory = js.native
  @JSName("static")
  var static_Original: staticFactory = js.native
  @JSName("uac")
  var uac_Original: uacFactory = js.native
  @JSName("upm")
  var upm_Original: upmFactory = js.native
  def sso(conf: ssoConf): js.Any = js.native
  def static(conf: staticConf): middleware = js.native
  def uac(conf: uacConf): js.Any = js.native
  def upm(conf: upmConf): js.Any = js.native
}


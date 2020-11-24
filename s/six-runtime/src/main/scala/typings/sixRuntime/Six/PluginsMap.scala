package typings.sixRuntime.Six

import typings.sixRuntime.Six.plugins.sso.ssoConf
import typings.sixRuntime.Six.plugins.sso.ssoFactory
import typings.sixRuntime.Six.plugins.static.staticConf
import typings.sixRuntime.Six.plugins.static.staticFactory
import typings.sixRuntime.Six.plugins.uac.uacConf
import typings.sixRuntime.Six.plugins.uac.uacFactory
import typings.sixRuntime.Six.plugins.upm.upmConf
import typings.sixRuntime.Six.plugins.upm.upmFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginsMap extends js.Object {
  
  def sso(conf: ssoConf): js.Any = js.native
  @JSName("sso")
  var sso_Original: ssoFactory = js.native
  
  def static(conf: staticConf): middleware = js.native
  @JSName("static")
  var static_Original: staticFactory = js.native
  
  def uac(conf: uacConf): js.Any = js.native
  @JSName("uac")
  var uac_Original: uacFactory = js.native
  
  def upm(conf: upmConf): js.Any = js.native
  @JSName("upm")
  var upm_Original: upmFactory = js.native
}

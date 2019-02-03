package typings
package seleniumDashWebdriverLib.edgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", "Options")
@js.native
class Options () extends js.Object {
  /**
    * Sets the page load strategy for Edge.
    * Supported values are 'normal', 'eager', and 'none';
    *
    * @param {string} pageLoadStrategy The page load strategy to use.
    * @return {!Options} A self reference.
    */
  def setPageLoadStrategy(pageLoadStrategy: java.lang.String): Options = js.native
  /**
    * Sets the proxy settings for the new session.
    * @param {capabilities.ProxyConfig} proxy The proxy configuration to use.
    * @return {!Options} A self reference.
    */
  def setProxy(proxy: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ProxyConfig): Options = js.native
  /**
    * Converts this options instance to a {@link capabilities.Capabilities}
    * object.
    * @param {capabilities.Capabilities=} opt_capabilities The capabilities to
    *     merge these options into, if any.
    * @return {!capabilities.Capabilities} The capabilities.
    */
  def toCapabilities(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  def toCapabilities(opt_capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
}

/* static members */
@JSImport("selenium-webdriver/edge", "Options")
@js.native
object Options extends js.Object {
  /**
    * Extracts the MicrosoftEdgeDriver specific options from the given
    * capabilities object.
    * @param {!capabilities.Capabilities} caps The capabilities object.
    * @return {!Options} The MicrosoftEdgeDriver options.
    */
  def fromCapabilities(cap: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.edgeMod.Options = js.native
}


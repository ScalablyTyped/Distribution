package typings
package seleniumDashWebdriverLib.firefoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", "Options")
@js.native
class Options ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities {
  /**
    * Sets the binary to use. The binary may be specified as the path to a
    * Firefox executable, or as a {@link Binary} object.
    *
    * @param {(string|!Binary)} binary The binary to use.
    * @return {!Options} A self reference.
    */
  def setBinary(binary: java.lang.String): Options = js.native
  def setBinary(binary: js.Any): Options = js.native
  /**
    * Sets the profile to use. The profile may be specified as a
    * {@link Profile} object or as the path to an existing Firefox profile to use
    * as a template.
    *
    * @param {(string|!Profile)} profile The profile to use.
    * @return {!Options} A self reference.
    */
  def setProfile(profile: java.lang.String): Options = js.native
  /**
    * Sets whether to use Mozilla's geckodriver to drive the browser. This option
    * is enabled by default and required for Firefox 47+.
    *
    * @param {boolean} enable Whether to enable the geckodriver.
    * @see https://github.com/mozilla/geckodriver
    */
  def useGeckoDriver(enable: scala.Boolean): Options = js.native
}


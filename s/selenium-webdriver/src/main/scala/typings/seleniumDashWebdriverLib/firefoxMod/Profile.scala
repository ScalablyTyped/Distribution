package typings
package seleniumDashWebdriverLib.firefoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", "Profile")
@js.native
/**
  * @param {string=} opt_dir Path to an existing Firefox profile directory to
  *     use a template for this profile. If not specified, a blank profile will
  *     be used.
  * @constructor
  */
class Profile () extends js.Object {
  def this(opt_dir: java.lang.String) = this()
  /**
    * @return {boolean} Whether the FirefoxDriver is configured to automatically
    *     accept untrusted SSL certificates.
    */
  def acceptUntrustedCerts(): scala.Boolean = js.native
  /**
    * Registers an extension to be included with this profile.
    * @param {string} extension Path to the extension to include, as either an
    *     unpacked extension directory or the path to a xpi file.
    */
  def addExtension(extension: java.lang.String): scala.Unit = js.native
  /**
    * @return {boolean} Whether to assume untrusted certs come from untrusted
    *     issuers.
    */
  def assumeUntrustedCertIssuer(): scala.Boolean = js.native
  /**
    * Encodes this profile as a zipped, base64 encoded directory.
    * @return {!promise.Promise.<string>} A promise for the encoded profile.
    */
  def encode(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  /**
    * @return {number} The port this profile is currently configured to use, or
    *     0 if the port will be selected at random when the profile is written
    *     to disk.
    */
  def getPort(): scala.Double = js.native
  /**
    * Returns the currently configured value of a profile preference. This does
    * not include any defaults defined in the profile's template directory user.js
    * file (if a template were specified on construction).
    * @param {string} key The desired preference.
    * @return {(string|number|boolean|undefined)} The current value of the
    *     requested preference.
    */
  def getPreference(key: java.lang.String): js.Any = js.native
  /**
    * Returns whether native events are enabled in this profile.
    * @return {boolean} .
    */
  def nativeEventsEnabled(): scala.Boolean = js.native
  /**
    * Sets whether the FirefoxDriver should automatically accept untrusted SSL
    * certificates.
    * @param {boolean} value .
    */
  def setAcceptUntrustedCerts(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether to assume untrusted certificates come from untrusted issuers.
    * @param {boolean} value .
    */
  def setAssumeUntrustedCertIssuer(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether to use native events with this profile.
    * @param {boolean} enabled .
    */
  def setNativeEventsEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the port to use for the WebDriver extension loaded by this profile.
    * @param {number} port The desired port, or 0 to use any free port.
    */
  def setPort(port: scala.Double): scala.Unit = js.native
  /**
    * Sets a desired preference for this profile.
    * @param {string} key The preference key.
    * @param {(string|number|boolean)} value The preference value.
    * @throws {Error} If attempting to set a frozen preference.
    */
  def setPreference(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setPreference(key: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setPreference(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
    * Writes this profile to disk.
    * @param {boolean=} opt_excludeWebDriverExt Whether to exclude the WebDriver
    *     extension from the generated profile. Used to reduce the size of an
    *     {@link #encode() encoded profile} since the server will always install
    *     the extension itself.
    * @return {!promise.Promise.<string>} A promise for the path to the new
    *     profile directory.
    */
  def writeToDisk(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  def writeToDisk(opt_excludeWebDriverExt: scala.Boolean): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
}


package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "WebElement")
@js.native
class WebElement protected ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement {
  def this(driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, id: java.lang.String) = this()
  /**
    * @param {!WebDriver} driver the parent WebDriver instance for this element.
    * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
    *     the underlying DOM element.
    */
  def this(driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, id: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String]) = this()
}

/* static members */
@JSImport("protractor", "WebElement")
@js.native
object WebElement extends js.Object {
  /**
    * @param {string} id The raw ID.
    * @param {boolean=} opt_noLegacy Whether to exclude the legacy element key.
    * @return {!Object} The element ID for use with WebDriver's wire protocol.
    */
  def buildId(id: java.lang.String): js.Object = js.native
  def buildId(id: java.lang.String, opt_noLegacy: scala.Boolean): js.Object = js.native
  /**
    * Compares two WebElements for equality.
    *
    * @param {!WebElement} a A WebElement.
    * @param {!WebElement} b A WebElement.
    * @return {!promise.Promise<boolean>} A promise that will be
    *     resolved to whether the two WebElements are equal.
    */
  def equals(
    a: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    b: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
    * Extracts the encoded WebElement ID from the object.
    *
    * @param {?} obj The object to extract the ID from.
    * @return {string} the extracted ID.
    * @throws {TypeError} if the object is not a valid encoded ID.
    */
  def extractId(obj: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IWebElementId): java.lang.String = js.native
  /**
    * @param {?} obj the object to test.
    * @return {boolean} whether the object is a valid encoded WebElement ID.
    */
  def isId(obj: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IWebElementId): scala.Boolean = js.native
}


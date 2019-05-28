package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassWebElement
  extends org.scalablytyped.runtime.Instantiable2[
      /* driver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
      /* id */ js.Promise[java.lang.String], 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
    ] {
  /**
    * @param {string} id The raw ID.
    * @param {boolean=} opt_noLegacy Whether to exclude the legacy element key.
    * @return {!Object} The element ID for use with WebDriver's wire protocol.
    */
  def buildId(id: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.IWebElementId = js.native
  def buildId(id: java.lang.String, opt_noLegacy: scala.Boolean): seleniumDashWebdriverLib.seleniumDashWebdriverMod.IWebElementId = js.native
  /**
    * Compares two WebElements for equality.
    *
    * @param {!WebElement} a A WebElement.
    * @param {!WebElement} b A WebElement.
    * @return {!Promise<boolean>} A promise that will be
    *     resolved to whether the two WebElements are equal.
    */
  def equals(
    a: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    b: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
  ): js.Promise[scala.Boolean] = js.native
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


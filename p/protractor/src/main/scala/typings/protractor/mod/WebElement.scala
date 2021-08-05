package typings.protractor.mod

import typings.seleniumWebdriver.mod.IWebElementId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "WebElement")
@js.native
class WebElement protected ()
  extends typings.seleniumWebdriver.mod.WebElement {
  def this(driver: typings.seleniumWebdriver.mod.WebDriver, id: String) = this()
  /**
    * @param {!WebDriver} driver the parent WebDriver instance for this element.
    * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
    *     the underlying DOM element.
    */
  def this(driver: typings.seleniumWebdriver.mod.WebDriver, id: js.Promise[String]) = this()
}
/* static members */
object WebElement {
  
  @JSImport("protractor", "WebElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {string} id The raw ID.
    * @param {boolean=} opt_noLegacy Whether to exclude the legacy element key.
    * @return {!Object} The element ID for use with WebDriver's wire protocol.
    */
  inline def buildId(id: String): IWebElementId = ^.asInstanceOf[js.Dynamic].applyDynamic("buildId")(id.asInstanceOf[js.Any]).asInstanceOf[IWebElementId]
  inline def buildId(id: String, opt_noLegacy: Boolean): IWebElementId = (^.asInstanceOf[js.Dynamic].applyDynamic("buildId")(id.asInstanceOf[js.Any], opt_noLegacy.asInstanceOf[js.Any])).asInstanceOf[IWebElementId]
  
  /**
    * Compares two WebElements for equality.
    *
    * @param {!WebElement} a A WebElement.
    * @param {!WebElement} b A WebElement.
    * @return {!Promise<boolean>} A promise that will be
    *     resolved to whether the two WebElements are equal.
    */
  inline def equals(a: typings.seleniumWebdriver.mod.WebElement, b: typings.seleniumWebdriver.mod.WebElement): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Extracts the encoded WebElement ID from the object.
    *
    * @param {?} obj The object to extract the ID from.
    * @return {string} the extracted ID.
    * @throws {TypeError} if the object is not a valid encoded ID.
    */
  inline def extractId(obj: IWebElementId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractId")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @param {?} obj the object to test.
    * @return {boolean} whether the object is a valid encoded WebElement ID.
    */
  inline def isId(obj: IWebElementId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isId")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

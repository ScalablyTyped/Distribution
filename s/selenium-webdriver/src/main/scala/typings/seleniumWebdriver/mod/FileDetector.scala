package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "FileDetector")
@js.native
/** @constructor */
class FileDetector () extends StObject {
  
  /**
    * Handles the file specified by the given path, preparing it for use with
    * the current browser. If the path does not refer to a valid file, it will
    * be returned unchanged, otherwisee a path suitable for use with the current
    * browser will be returned.
    *
    * This default implementation is a no-op. Subtypes may override this
    * function for custom tailored file handling.
    *
    * @param {!WebDriver} driver The driver for the current browser.
    * @param {string} path The path to process.
    * @return {!Promise<string>} A promise for the processed
    *     file path.
    * @package
    */
  def handleFile(driver: WebDriver, path: String): js.Promise[String] = js.native
}

package typings.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IType extends js.Object {
  /** Logs originating from the browser. */
  var BROWSER: String
  /** Logs from a WebDriver client. */
  var CLIENT: String
  /** Logs from a WebDriver implementation. */
  var DRIVER: String
  /** Logs related to performance. */
  var PERFORMANCE: String
  /** Logs from the remote server. */
  var SERVER: String
}

object IType {
  @scala.inline
  def apply(BROWSER: String, CLIENT: String, DRIVER: String, PERFORMANCE: String, SERVER: String): IType = {
    val __obj = js.Dynamic.literal(BROWSER = BROWSER.asInstanceOf[js.Any], CLIENT = CLIENT.asInstanceOf[js.Any], DRIVER = DRIVER.asInstanceOf[js.Any], PERFORMANCE = PERFORMANCE.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IType]
  }
}


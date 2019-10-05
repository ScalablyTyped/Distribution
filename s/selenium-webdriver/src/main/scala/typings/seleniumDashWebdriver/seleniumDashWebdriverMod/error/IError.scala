package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "error.IError")
@js.native
class IError () extends Error {
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}


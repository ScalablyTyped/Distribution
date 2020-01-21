package typings.seleniumWebdriver.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThenableWebDriver
  extends WebDriver
     with Promise[WebDriver]


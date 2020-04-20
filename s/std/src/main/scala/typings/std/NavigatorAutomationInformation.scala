package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorAutomationInformation extends js.Object {
  val webdriver: scala.Boolean
}

object NavigatorAutomationInformation {
  @scala.inline
  def apply(webdriver: scala.Boolean): NavigatorAutomationInformation = {
    val __obj = js.Dynamic.literal(webdriver = webdriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorAutomationInformation]
  }
}


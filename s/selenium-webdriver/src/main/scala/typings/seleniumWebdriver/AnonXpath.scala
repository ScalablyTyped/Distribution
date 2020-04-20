package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXpath extends ByHash {
  var xpath: String
}

object AnonXpath {
  @scala.inline
  def apply(xpath: String): AnonXpath = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXpath]
  }
}


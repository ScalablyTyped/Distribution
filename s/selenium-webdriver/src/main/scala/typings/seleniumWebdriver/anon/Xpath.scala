package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xpath extends ByHash {
  var xpath: String
}

object Xpath {
  @scala.inline
  def apply(xpath: String): Xpath = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpath]
  }
}


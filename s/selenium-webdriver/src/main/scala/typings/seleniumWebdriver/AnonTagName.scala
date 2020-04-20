package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTagName extends ByHash {
  var tagName: String
}

object AnonTagName {
  @scala.inline
  def apply(tagName: String): AnonTagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTagName]
  }
}


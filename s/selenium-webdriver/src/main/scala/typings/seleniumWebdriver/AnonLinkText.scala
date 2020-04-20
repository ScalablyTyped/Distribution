package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinkText extends ByHash {
  var linkText: String
}

object AnonLinkText {
  @scala.inline
  def apply(linkText: String): AnonLinkText = {
    val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinkText]
  }
}


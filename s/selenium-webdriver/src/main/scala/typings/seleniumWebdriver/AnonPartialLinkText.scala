package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartialLinkText extends ByHash {
  var partialLinkText: String
}

object AnonPartialLinkText {
  @scala.inline
  def apply(partialLinkText: String): AnonPartialLinkText = {
    val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartialLinkText]
  }
}


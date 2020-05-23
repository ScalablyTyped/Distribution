package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialLinkText extends ByHash {
  var partialLinkText: String
}

object PartialLinkText {
  @scala.inline
  def apply(partialLinkText: String): PartialLinkText = {
    val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLinkText]
  }
}


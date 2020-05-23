package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkText extends ByHash {
  var linkText: String
}

object LinkText {
  @scala.inline
  def apply(linkText: String): LinkText = {
    val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkText]
  }
}


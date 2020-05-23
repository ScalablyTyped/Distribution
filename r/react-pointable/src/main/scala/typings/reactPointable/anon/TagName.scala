package typings.reactPointable.anon

import typings.reactPointable.reactPointableStrings.auto
import typings.reactPointable.reactPointableStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagName extends js.Object {
  var tagName: div
  var touchAction: auto
}

object TagName {
  @scala.inline
  def apply(tagName: div, touchAction: auto): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
}


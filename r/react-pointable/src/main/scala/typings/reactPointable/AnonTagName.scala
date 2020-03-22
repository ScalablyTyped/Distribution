package typings.reactPointable

import typings.reactPointable.reactPointableStrings.auto
import typings.reactPointable.reactPointableStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTagName extends js.Object {
  var tagName: div
  var touchAction: auto
}

object AnonTagName {
  @scala.inline
  def apply(tagName: div, touchAction: auto): AnonTagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTagName]
  }
}


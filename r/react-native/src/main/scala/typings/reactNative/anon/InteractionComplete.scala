package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionComplete extends js.Object {
  var interactionComplete: String
  var interactionStart: String
}

object InteractionComplete {
  @scala.inline
  def apply(interactionComplete: String, interactionStart: String): InteractionComplete = {
    val __obj = js.Dynamic.literal(interactionComplete = interactionComplete.asInstanceOf[js.Any], interactionStart = interactionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionComplete]
  }
}


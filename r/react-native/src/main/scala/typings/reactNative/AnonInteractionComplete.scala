package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInteractionComplete extends js.Object {
  var interactionComplete: String
  var interactionStart: String
}

object AnonInteractionComplete {
  @scala.inline
  def apply(interactionComplete: String, interactionStart: String): AnonInteractionComplete = {
    val __obj = js.Dynamic.literal(interactionComplete = interactionComplete.asInstanceOf[js.Any], interactionStart = interactionStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInteractionComplete]
  }
}


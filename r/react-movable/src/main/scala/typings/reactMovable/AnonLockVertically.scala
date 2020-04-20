package typings.reactMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLockVertically extends js.Object {
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var voiceover: AnonCanceled
}

object AnonLockVertically {
  @scala.inline
  def apply(
    lockVertically: Boolean,
    removableByMove: Boolean,
    transitionDuration: Double,
    voiceover: AnonCanceled
  ): AnonLockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLockVertically]
  }
}


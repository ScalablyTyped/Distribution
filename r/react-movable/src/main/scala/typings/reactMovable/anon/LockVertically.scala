package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockVertically extends js.Object {
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var voiceover: Canceled
}

object LockVertically {
  @scala.inline
  def apply(lockVertically: Boolean, removableByMove: Boolean, transitionDuration: Double, voiceover: Canceled): LockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockVertically]
  }
}


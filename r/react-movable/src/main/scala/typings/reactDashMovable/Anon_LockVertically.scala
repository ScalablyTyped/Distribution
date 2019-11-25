package typings.reactDashMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LockVertically extends js.Object {
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var voiceover: Anon_Canceled
}

object Anon_LockVertically {
  @scala.inline
  def apply(
    lockVertically: Boolean,
    removableByMove: Boolean,
    transitionDuration: Double,
    voiceover: Anon_Canceled
  ): Anon_LockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LockVertically]
  }
}


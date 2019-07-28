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
    val __obj = js.Dynamic.literal(lockVertically = lockVertically, removableByMove = removableByMove, transitionDuration = transitionDuration, voiceover = voiceover)
  
    __obj.asInstanceOf[Anon_LockVertically]
  }
}


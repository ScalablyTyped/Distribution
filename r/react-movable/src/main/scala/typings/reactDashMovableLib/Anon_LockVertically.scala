package typings
package reactDashMovableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LockVertically extends js.Object {
  var lockVertically: scala.Boolean
  var removableByMove: scala.Boolean
  var transitionDuration: scala.Double
  var voiceover: Anon_Canceled
}

object Anon_LockVertically {
  @scala.inline
  def apply(
    lockVertically: scala.Boolean,
    removableByMove: scala.Boolean,
    transitionDuration: scala.Double,
    voiceover: Anon_Canceled
  ): Anon_LockVertically = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically, removableByMove = removableByMove, transitionDuration = transitionDuration, voiceover = voiceover)
  
    __obj.asInstanceOf[Anon_LockVertically]
  }
}


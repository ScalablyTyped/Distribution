package typings.seen.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "TransitionAnimator")
@js.native
class TransitionAnimator () extends Animator {
  var queue: js.Array[js.Array[Transition]] = js.native
  var transitions: js.Array[Transition] = js.native
  def add(txn: Transition): Unit = js.native
  def keyframe(): Unit = js.native
  def update(): Unit = js.native
  def update(t: Double): Unit = js.native
}


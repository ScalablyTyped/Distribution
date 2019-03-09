package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "TransitionAnimator")
@js.native
class TransitionAnimator () extends Animator {
  var queue: js.Array[js.Array[Transition]] = js.native
  var transitions: js.Array[Transition] = js.native
  def add(txn: Transition): scala.Unit = js.native
  def keyframe(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(t: scala.Double): scala.Unit = js.native
}


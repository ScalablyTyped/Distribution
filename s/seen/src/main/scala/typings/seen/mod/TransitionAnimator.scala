package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "TransitionAnimator")
@js.native
class TransitionAnimator () extends Animator {
  
  def add(txn: Transition): Unit = js.native
  
  def keyframe(): Unit = js.native
  
  var queue: js.Array[js.Array[Transition]] = js.native
  
  var transitions: js.Array[Transition] = js.native
  
  def update(): Unit = js.native
  def update(t: Double): Unit = js.native
}

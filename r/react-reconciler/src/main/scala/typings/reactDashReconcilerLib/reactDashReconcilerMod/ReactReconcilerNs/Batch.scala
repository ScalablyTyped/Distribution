package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiberRoot
// TODO: This should be lifted into the renderer.
trait Batch extends js.Object {
  var _defer: scala.Boolean
  var _expirationTime: ExpirationTime
  var _next: Batch | scala.Null
  def _onComplete(): js.Any
}

object Batch {
  @scala.inline
  def apply(
    _defer: scala.Boolean,
    _expirationTime: ExpirationTime,
    _onComplete: () => js.Any,
    _next: Batch = null
  ): Batch = {
    val __obj = js.Dynamic.literal(_defer = _defer, _expirationTime = _expirationTime, _onComplete = js.Any.fromFunction0(_onComplete))
    if (_next != null) __obj.updateDynamic("_next")(_next)
    __obj.asInstanceOf[Batch]
  }
}


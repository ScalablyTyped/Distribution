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
    _onComplete: js.Function0[js.Any],
    _next: Batch = null
  ): Batch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_defer")(_defer)
    __obj.updateDynamic("_expirationTime")(_expirationTime)
    __obj.updateDynamic("_onComplete")(_onComplete)
    if (_next != null) __obj.updateDynamic("_next")(_next)
    __obj.asInstanceOf[Batch]
  }
}


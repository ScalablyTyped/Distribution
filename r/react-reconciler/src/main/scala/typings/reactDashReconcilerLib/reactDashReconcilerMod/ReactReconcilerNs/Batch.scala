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


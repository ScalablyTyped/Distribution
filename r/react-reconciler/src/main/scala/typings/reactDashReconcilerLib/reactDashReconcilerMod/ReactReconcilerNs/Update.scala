package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactUpdateQueue

trait Update[State] extends js.Object {
  var callback: js.Function0[_] | scala.Null
  var expirationTime: ExpirationTime
  var next: Update[State] | scala.Null
  var nextEffect: Update[State] | scala.Null
  var payload: js.Any
  var tag: reactDashReconcilerLib.reactDashReconcilerLibNumbers.`0` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`1` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`2` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`3`
}


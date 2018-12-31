package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQueue[State] extends js.Object {
  var baseState: State
  var firstCapturedEffect: Update[State] | scala.Null
  var firstCapturedUpdate: Update[State] | scala.Null
  var firstEffect: Update[State] | scala.Null
  var firstUpdate: Update[State] | scala.Null
  var lastCapturedEffect: Update[State] | scala.Null
  var lastCapturedUpdate: Update[State] | scala.Null
  var lastEffect: Update[State] | scala.Null
  var lastUpdate: Update[State] | scala.Null
}


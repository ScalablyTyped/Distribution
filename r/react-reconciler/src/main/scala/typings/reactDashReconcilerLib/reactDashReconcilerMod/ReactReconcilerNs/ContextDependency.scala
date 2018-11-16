package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiberNewContext

trait ContextDependency[T] extends js.Object {
  var context: ReactContext[T]
  var next: ContextDependency[_] | scala.Null
  var observedBits: scala.Double
}


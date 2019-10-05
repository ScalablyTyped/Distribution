package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RNFirebase {
  type ErrorHandler = Handler[RnError]
  type Handler[T] = js.Function1[/* value */ T, Unit]
}

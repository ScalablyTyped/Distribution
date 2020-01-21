package typings.reactNativeFirebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RNFirebase {
  type ErrorHandler = typings.reactNativeFirebase.mod.RNFirebase.Handler[typings.reactNativeFirebase.mod.RNFirebase.RnError]
  type Handler[T] = js.Function1[/* value */ T, scala.Unit]
}

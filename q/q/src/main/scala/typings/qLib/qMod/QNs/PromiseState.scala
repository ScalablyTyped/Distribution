package typings
package qLib.qMod.QNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromiseState[T] extends js.Object {
  var reason: js.UndefOr[js.Any] = js.undefined
  var state: qLib.qLibStrings.fulfilled | qLib.qLibStrings.rejected | qLib.qLibStrings.pending
  var value: js.UndefOr[T] = js.undefined
}


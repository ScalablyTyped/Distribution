package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionObserver[T] extends js.Object {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  def complete(): scala.Unit
}


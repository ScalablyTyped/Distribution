package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorObserver[T] extends js.Object {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  def error(err: js.Any): scala.Unit
}


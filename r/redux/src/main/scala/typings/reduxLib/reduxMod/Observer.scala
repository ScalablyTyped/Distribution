package typings
package reduxLib.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](next: /* value */ T => scala.Unit = null): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[T]]
  }
}


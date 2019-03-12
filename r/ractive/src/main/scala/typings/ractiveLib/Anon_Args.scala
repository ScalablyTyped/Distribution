package typings
package ractiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  // TODO: undocumented GH-429
  var update: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  def teardown(): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply(teardown: () => scala.Unit, update: /* repeated */ js.Any => scala.Unit = null): Anon_Args = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[Anon_Args]
  }
}


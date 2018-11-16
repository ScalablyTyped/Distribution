package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Monitor extends js.Object {
  var actionDispatched: js.UndefOr[js.Function1[/* action */ reduxLib.reduxMod.Action[_], scala.Unit]] = js.undefined
  var effectCancelled: js.UndefOr[js.Function1[/* effectId */ scala.Double, scala.Unit]] = js.undefined
  var effectRejected: js.UndefOr[js.Function2[/* effectId */ scala.Double, /* err */ js.Any, scala.Unit]] = js.undefined
  var effectResolved: js.UndefOr[js.Function2[/* effectId */ scala.Double, /* res */ js.Any, scala.Unit]] = js.undefined
  var effectTriggered: js.UndefOr[js.Function1[/* desc */ reduxDashSagaLib.Anon_ParentEffectId, scala.Unit]] = js.undefined
}


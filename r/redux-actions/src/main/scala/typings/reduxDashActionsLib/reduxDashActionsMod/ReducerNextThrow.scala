package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerNextThrow[State, Payload] extends _ReducerMapValue[State, Payload] {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
}

object ReducerNextThrow {
  @scala.inline
  def apply[State, Payload](
    next: js.Function2[/* state */ State, /* action */ Action[Payload], State] = null,
    `throw`: js.Function2[/* state */ State, /* action */ Action[Payload], State] = null
  ): ReducerNextThrow[State, Payload] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (`throw` != null) __obj.updateDynamic("throw")(`throw`)
    __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
  }
}


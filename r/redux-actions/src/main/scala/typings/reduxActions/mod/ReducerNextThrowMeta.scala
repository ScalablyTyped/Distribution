package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerNextThrowMeta[State, Payload, Meta] extends js.Object {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.undefined
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.undefined
}

object ReducerNextThrowMeta {
  @scala.inline
  def apply[State, Payload, Meta](
    next: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State = null,
    `throw`: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State = null
  ): ReducerNextThrowMeta[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2(next))
    if (`throw` != null) __obj.updateDynamic("throw")(js.Any.fromFunction2(`throw`))
    __obj.asInstanceOf[ReducerNextThrowMeta[State, Payload, Meta]]
  }
}


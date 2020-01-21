package typings.reduxActions.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReducerMapValue[State, Payload] extends js.Object

object _ReducerMapValue {
  @scala.inline
  def ReducerNextThrow[State, Payload](
    next: (State, /* action */ Action[Payload]) => State = null,
    `throw`: (State, /* action */ Action[Payload]) => State = null
  ): _ReducerMapValue[State, Payload] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2(next))
    if (`throw` != null) __obj.updateDynamic("throw")(js.Any.fromFunction2(`throw`))
    __obj.asInstanceOf[_ReducerMapValue[State, Payload]]
  }
  @scala.inline
  def ReducerMap[State, Payload](StringDictionary: /* actionType */ StringDictionary[ReducerMapValue[State, Payload]] = null): _ReducerMapValue[State, Payload] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[_ReducerMapValue[State, Payload]]
  }
}


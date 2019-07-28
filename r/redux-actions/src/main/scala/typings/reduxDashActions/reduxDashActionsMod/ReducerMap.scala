package typings.reduxDashActions.reduxDashActionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerMap[State, Payload]
  extends /* actionType */ StringDictionary[ReducerMapValue[State, Payload]]
     with _ReducerMapValue[State, Payload]

object ReducerMap {
  @scala.inline
  def apply[State, Payload](StringDictionary: /* actionType */ StringDictionary[ReducerMapValue[State, Payload]] = null): ReducerMap[State, Payload] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReducerMap[State, Payload]]
  }
}


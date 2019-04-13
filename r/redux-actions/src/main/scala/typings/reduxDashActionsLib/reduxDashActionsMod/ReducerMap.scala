package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerMap[State, Payload]
  extends /* actionType */ org.scalablytyped.runtime.StringDictionary[ReducerMapValue[State, Payload]]
     with _ReducerMapValue[State, Payload]

object ReducerMap {
  @scala.inline
  def apply[State, Payload](
    StringDictionary: /* actionType */ org.scalablytyped.runtime.StringDictionary[ReducerMapValue[State, Payload]] = null
  ): ReducerMap[State, Payload] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReducerMap[State, Payload]]
  }
}


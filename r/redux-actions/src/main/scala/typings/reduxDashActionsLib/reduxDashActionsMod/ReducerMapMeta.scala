package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerMapMeta[State, Payload, Meta]
  extends /* actionType */ org.scalablytyped.runtime.StringDictionary[
      (ReducerMeta[State, Payload, Meta]) | (ReducerNextThrowMeta[State, Payload, Meta]) | (ReducerMapMeta[State, Payload, Meta])
    ]

object ReducerMapMeta {
  @scala.inline
  def apply[State, Payload, Meta](
    StringDictionary: /* actionType */ org.scalablytyped.runtime.StringDictionary[
      (ReducerMeta[State, Payload, Meta]) | (ReducerNextThrowMeta[State, Payload, Meta]) | (ReducerMapMeta[State, Payload, Meta])
    ] = null
  ): ReducerMapMeta[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReducerMapMeta[State, Payload, Meta]]
  }
}


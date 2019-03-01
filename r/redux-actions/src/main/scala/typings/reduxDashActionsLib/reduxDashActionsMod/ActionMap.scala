package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMap[Payload, Meta]
  extends /* actionType */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        (ActionMap[Payload, Meta]) | ActionFunctionAny[Payload] | (js.Tuple2[ActionFunctionAny[Payload], ActionFunctionAny[Meta]])
      ]
    ]

object ActionMap {
  @scala.inline
  def apply[Payload, Meta](
    StringDictionary: /* actionType */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        (ActionMap[Payload, Meta]) | ActionFunctionAny[Payload] | (js.Tuple2[ActionFunctionAny[Payload], ActionFunctionAny[Meta]])
      ]
    ] = null
  ): ActionMap[Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ActionMap[Payload, Meta]]
  }
}


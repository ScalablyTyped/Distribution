package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActionMap[Payload, Meta]
  extends /* actionType */ ScalablyTyped.runtime.StringDictionary[
      js.UndefOr[
        (ActionMap[Payload, Meta]) | ActionFunctionAny[Payload] | (js.Tuple2[ActionFunctionAny[Payload], ActionFunctionAny[Meta]])
      ]
    ]


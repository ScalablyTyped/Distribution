package typings.reduxActions.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMap[Payload, Meta]
  extends /* actionType */ StringDictionary[
      js.UndefOr[
        (ActionMap[Payload, Meta]) | ActionFunctionAny[Payload] | (js.Tuple2[ActionFunctionAny[Payload], ActionFunctionAny[Meta]])
      ]
    ]

object ActionMap {
  @scala.inline
  def apply[Payload, Meta](): ActionMap[Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionMap[Payload, Meta]]
  }
}


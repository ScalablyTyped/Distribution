package typings.reduxActions.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReducerMap[State, Payload]
  extends /* actionType */ StringDictionary[ReducerMapValue[State, Payload]]
     with _ReducerMapValue[State, Payload]

object ReducerMap {
  @scala.inline
  def apply[State, Payload](): ReducerMap[State, Payload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerMap[State, Payload]]
  }
}


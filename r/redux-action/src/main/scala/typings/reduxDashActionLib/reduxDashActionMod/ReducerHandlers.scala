package typings
package reduxDashActionLib.reduxDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerHandlers[State]
  extends /* type */ org.scalablytyped.runtime.StringDictionary[ReducerHandler[State]]

object ReducerHandlers {
  @scala.inline
  def apply[State](
    StringDictionary: /* type */ org.scalablytyped.runtime.StringDictionary[ReducerHandler[State]] = null
  ): ReducerHandlers[State] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReducerHandlers[State]]
  }
}


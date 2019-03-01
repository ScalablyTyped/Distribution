package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateHandlerMap[TState]
  extends /* updaterName */ org.scalablytyped.runtime.StringDictionary[StateHandler[TState]]

object StateHandlerMap {
  @scala.inline
  def apply[TState](
    StringDictionary: /* updaterName */ org.scalablytyped.runtime.StringDictionary[StateHandler[TState]] = null
  ): StateHandlerMap[TState] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StateHandlerMap[TState]]
  }
}


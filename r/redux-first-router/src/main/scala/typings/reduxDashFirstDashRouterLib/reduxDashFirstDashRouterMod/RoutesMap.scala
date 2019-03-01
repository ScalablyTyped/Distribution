package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutesMap[TKeys, TState]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[Route[TKeys, TState]]

object RoutesMap {
  @scala.inline
  def apply[TKeys, TState](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[Route[TKeys, TState]] = null
  ): RoutesMap[TKeys, TState] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RoutesMap[TKeys, TState]]
  }
}


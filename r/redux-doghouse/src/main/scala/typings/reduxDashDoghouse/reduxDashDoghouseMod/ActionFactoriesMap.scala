package typings.reduxDashDoghouse.reduxDashDoghouseMod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionFactoriesMap extends /* key */ StringDictionary[ScopedActionFactory[_] | ActionCreator[_] | ActionFactoriesMap]

object ActionFactoriesMap {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[ScopedActionFactory[_] | ActionCreator[_] | ActionFactoriesMap] = null
  ): ActionFactoriesMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ActionFactoriesMap]
  }
}


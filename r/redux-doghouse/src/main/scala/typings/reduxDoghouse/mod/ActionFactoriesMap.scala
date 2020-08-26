package typings.reduxDoghouse.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionFactoriesMap extends /* key */ StringDictionary[ScopedActionFactory[_] | ActionCreator[_] | ActionFactoriesMap]

object ActionFactoriesMap {
  @scala.inline
  def apply(): ActionFactoriesMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionFactoriesMap]
  }
}


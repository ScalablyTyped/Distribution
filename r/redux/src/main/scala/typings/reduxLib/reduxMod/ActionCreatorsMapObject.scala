package typings
package reduxLib.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCreatorsMapObject[A]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[ActionCreator[A]]

object ActionCreatorsMapObject {
  @scala.inline
  def apply[A](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[ActionCreator[A]] = null): ActionCreatorsMapObject[A] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ActionCreatorsMapObject[A]]
  }
}


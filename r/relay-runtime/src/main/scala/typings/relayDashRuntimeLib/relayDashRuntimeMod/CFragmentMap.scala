package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFragmentMap[TFragment]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[TFragment]

object CFragmentMap {
  @scala.inline
  def apply[TFragment](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[TFragment] = null): CFragmentMap[TFragment] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CFragmentMap[TFragment]]
  }
}


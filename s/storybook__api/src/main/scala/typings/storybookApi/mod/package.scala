package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventMap = org.scalablytyped.runtime.StringDictionary[typings.storybookChannels.mod.Listener]
  type OtherAPI = org.scalablytyped.runtime.StringDictionary[js.Any]
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type SubState = org.scalablytyped.runtime.StringDictionary[js.Any]
}

package typings.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookApiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStorybookChannels.atStorybookChannelsMod.Listener

  type EventMap = StringDictionary[Listener]
  type OtherAPI = StringDictionary[js.Any]
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type SubState = StringDictionary[js.Any]
}

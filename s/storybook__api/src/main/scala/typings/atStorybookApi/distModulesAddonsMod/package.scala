package typings.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distModulesAddonsMod {
  import org.scalablytyped.runtime.StringDictionary

  type Collection = StringDictionary[Addon]
  type Panels = StringDictionary[Addon]
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type Types = types | String
}

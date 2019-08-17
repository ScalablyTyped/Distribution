package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.immutable.immutableMod.List

  type CommandFunc = js.Function2[/* editor */ Editor, /* repeated */ js.Any, Editor]
  type Path = List[Double] | js.Array[Double] | String
  type QueryFunc = js.Function2[/* editor */ Editor, /* repeated */ js.Any, js.Any]
  type RulesByNodeType = StringDictionary[Rules]
  type resetMemoization = js.Function0[Unit]
  type useMemoization = js.Function1[/* enabled */ Boolean, Unit]
}

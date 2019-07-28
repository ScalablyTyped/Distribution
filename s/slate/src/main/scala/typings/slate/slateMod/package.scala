package typings.slate

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateMod {
  type CommandFunc = js.Function2[/* editor */ Editor, /* repeated */ js.Any, Editor]
  /* Rewritten from type alias, can be one of: 
    - typings.slate.slateMod.Document[org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typings.slate.slateMod.Block
    - typings.slate.slateMod.Inline
    - typings.slate.slateMod.Text
  */
  type Node = _Node | Document[StringDictionary[js.Any]]
  type Path = List[Double] | String | Double
  type QueryFunc = js.Function2[/* editor */ Editor, /* repeated */ js.Any, js.Any]
  type RulesByNodeType = StringDictionary[Rules]
  type resetMemoization = js.Function0[Unit]
  type useMemoization = js.Function0[Unit]
}

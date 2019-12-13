package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.immutable.Immutable.List
  import typings.immutable.Immutable.Map

  type CommandFunc[T /* <: Controller */] = js.Function2[/* editor */ T, /* repeated */ js.Any, T]
  type Data = Map[js.Any, js.Any]
  type Path = List[Double] | js.Array[Double] | String
  type QueryFunc[T /* <: Controller */] = js.Function2[/* editor */ T, /* repeated */ js.Any, js.Any]
  type RulesByNodeType = StringDictionary[Rules]
  type resetMemoization = js.Function0[Unit]
  type useMemoization = js.Function1[/* enabled */ Boolean, Unit]
}

package typings.streamDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filtersFilterBaseMod {
  import typings.node.streamMod.Transform

  type FilterBase = Transform
  type FilterFunction = js.Function2[/* stack */ Stack, /* token */ Token, Boolean]
  type ReplacementFunction = js.Function2[/* stack */ Stack, /* token */ Token, js.Array[Token]]
  type Stack = js.Array[Double | String | Null]
}

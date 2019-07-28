package typings.streamDashJson

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filtersFilterBaseMod {
  type FilterBase = Transform
  type FilterFunction = js.Function2[/* stack */ Stack, /* token */ Token, Boolean]
  type ReplacementFunction = js.Function2[/* stack */ Stack, /* token */ Token, js.Array[Token]]
  type Stack = js.Array[Double | String | Null]
}

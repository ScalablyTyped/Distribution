package typings
package streamDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filtersFilterBaseMod {
  type FilterBase = nodeLib.streamMod.Transform
  type FilterFunction = js.Function2[/* stack */ Stack, /* token */ Token, scala.Boolean]
  type ReplacementFunction = js.Function2[/* stack */ Stack, /* token */ Token, js.Array[Token]]
  type Stack = js.Array[scala.Double | java.lang.String | scala.Null]
}

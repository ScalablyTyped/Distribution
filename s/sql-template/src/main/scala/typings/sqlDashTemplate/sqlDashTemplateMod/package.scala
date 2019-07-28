package typings.sqlDashTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlDashTemplateMod {
  type ChainFn = js.Function2[/* values */ js.Array[js.Any], /* part */ String, String]
  type Transformer = js.Function3[/* values */ js.Array[js.Any], /* str */ String, /* chain */ ChainFn, Unit]
}

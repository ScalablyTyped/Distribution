package typings.reactable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactableMod {
  type ColumnsType = String | KeyLabelObject
  type FilterMethodType = js.Function1[/* text */ String, Unit]
}

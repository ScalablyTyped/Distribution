package typings
package streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  val name: java.lang.String
  val value: js.UndefOr[
    js.Array[
      java.lang.String | scala.Null | streamDashJsonLib.streamDashJsonLibNumbers.`true` | streamDashJsonLib.streamDashJsonLibNumbers.`false`
    ]
  ] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: js.Array[
      java.lang.String | scala.Null | streamDashJsonLib.streamDashJsonLibNumbers.`true` | streamDashJsonLib.streamDashJsonLibNumbers.`false`
    ] = null
  ): Token = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Token]
  }
}


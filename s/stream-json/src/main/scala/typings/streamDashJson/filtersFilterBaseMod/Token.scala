package typings.streamDashJson.filtersFilterBaseMod

import typings.streamDashJson.streamDashJsonNumbers.`false`
import typings.streamDashJson.streamDashJsonNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  val name: String
  val value: js.UndefOr[js.Array[String | Null | `true` | `false`]] = js.undefined
}

object Token {
  @scala.inline
  def apply(name: String, value: js.Array[String | Null | `true` | `false`] = null): Token = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}


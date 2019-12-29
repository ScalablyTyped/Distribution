package typings.streamDashJson.filtersFilterBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  val name: String
  val value: js.UndefOr[String | Null | Boolean] = js.undefined
}

object Token {
  @scala.inline
  def apply(name: String, value: String | Boolean = null): Token = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}


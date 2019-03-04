package typings
package streamDashJsonLib.assemblerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Token {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String = null): Token = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Token]
  }
}


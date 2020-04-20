package typings.searchParams.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParsedName extends js.Object {
  var hasBrackets: Boolean
  var name: String
}

object IParsedName {
  @scala.inline
  def apply(hasBrackets: Boolean, name: String): IParsedName = {
    val __obj = js.Dynamic.literal(hasBrackets = hasBrackets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParsedName]
  }
}


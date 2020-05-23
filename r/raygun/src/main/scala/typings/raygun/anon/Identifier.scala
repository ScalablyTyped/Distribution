package typings.raygun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends js.Object {
  var identifier: String
}

object Identifier {
  @scala.inline
  def apply(identifier: String): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}


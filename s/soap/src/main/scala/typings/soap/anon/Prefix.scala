package typings.soap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var name: String
  var prefix: String
}

object Prefix {
  @scala.inline
  def apply(name: String, prefix: String): Prefix = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
}


package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair extends js.Object {
  var name: String
  var value: String
}

object KeyValuePair {
  @scala.inline
  def apply(name: String, value: String): KeyValuePair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[KeyValuePair]
  }
}


package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object KeyValuePair {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[KeyValuePair]
  }
}


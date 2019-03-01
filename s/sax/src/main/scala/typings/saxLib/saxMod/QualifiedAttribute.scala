package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedAttribute extends QualifiedName {
  var value: java.lang.String
}

object QualifiedAttribute {
  @scala.inline
  def apply(
    local: java.lang.String,
    name: java.lang.String,
    prefix: java.lang.String,
    uri: java.lang.String,
    value: java.lang.String
  ): QualifiedAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[QualifiedAttribute]
  }
}


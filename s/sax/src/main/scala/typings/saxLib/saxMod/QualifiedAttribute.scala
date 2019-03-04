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
    val __obj = js.Dynamic.literal(local = local, name = name, prefix = prefix, uri = uri, value = value)
  
    __obj.asInstanceOf[QualifiedAttribute]
  }
}


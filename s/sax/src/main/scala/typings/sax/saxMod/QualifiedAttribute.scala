package typings.sax.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedAttribute extends QualifiedName {
  var value: String
}

object QualifiedAttribute {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String, value: String): QualifiedAttribute = {
    val __obj = js.Dynamic.literal(local = local, name = name, prefix = prefix, uri = uri, value = value)
  
    __obj.asInstanceOf[QualifiedAttribute]
  }
}


package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedName extends js.Object {
  var local: java.lang.String
  var name: java.lang.String
  var prefix: java.lang.String
  var uri: java.lang.String
}

object QualifiedName {
  @scala.inline
  def apply(local: java.lang.String, name: java.lang.String, prefix: java.lang.String, uri: java.lang.String): QualifiedName = {
    val __obj = js.Dynamic.literal(local = local, name = name, prefix = prefix, uri = uri)
  
    __obj.asInstanceOf[QualifiedName]
  }
}


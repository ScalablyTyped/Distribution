package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedName extends js.Object {
  var local: String
  var name: String
  var prefix: String
  var uri: String
}

object QualifiedName {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String): QualifiedName = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedName]
  }
}


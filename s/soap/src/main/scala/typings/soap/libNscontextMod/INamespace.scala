package typings.soap.libNscontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamespace extends js.Object {
  var declared: Boolean
  var prefix: String
  var uri: String
}

object INamespace {
  @scala.inline
  def apply(declared: Boolean, prefix: String, uri: String): INamespace = {
    val __obj = js.Dynamic.literal(declared = declared.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INamespace]
  }
}


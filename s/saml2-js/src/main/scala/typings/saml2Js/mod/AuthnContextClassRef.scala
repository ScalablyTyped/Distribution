package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthnContextClassRef extends js.Object {
  var class_refs: js.Array[String]
  var comparison: String
}

object AuthnContextClassRef {
  @scala.inline
  def apply(class_refs: js.Array[String], comparison: String): AuthnContextClassRef = {
    val __obj = js.Dynamic.literal(class_refs = class_refs.asInstanceOf[js.Any], comparison = comparison.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthnContextClassRef]
  }
}


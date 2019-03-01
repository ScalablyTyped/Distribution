package typings
package saml2DashJsLib.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthnContextClassRef extends js.Object {
  var class_refs: js.Array[java.lang.String]
  var comparison: java.lang.String
}

object AuthnContextClassRef {
  @scala.inline
  def apply(class_refs: js.Array[java.lang.String], comparison: java.lang.String): AuthnContextClassRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class_refs")(class_refs)
    __obj.updateDynamic("comparison")(comparison)
    __obj.asInstanceOf[AuthnContextClassRef]
  }
}


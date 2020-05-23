package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIdentityAssertion extends js.Object {
  var idp: java.lang.String
  var name: java.lang.String
}

object RTCIdentityAssertion {
  @scala.inline
  def apply(idp: java.lang.String, name: java.lang.String): RTCIdentityAssertion = {
    val __obj = js.Dynamic.literal(idp = idp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityAssertion]
  }
}


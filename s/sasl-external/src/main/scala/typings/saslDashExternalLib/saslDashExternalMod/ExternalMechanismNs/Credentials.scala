package typings
package saslDashExternalLib.saslDashExternalMod.ExternalMechanismNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(authzid: java.lang.String = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (authzid != null) __obj.updateDynamic("authzid")(authzid)
    __obj.asInstanceOf[Credentials]
  }
}


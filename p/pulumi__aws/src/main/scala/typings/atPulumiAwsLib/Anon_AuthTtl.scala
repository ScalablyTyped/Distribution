package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthTtl extends js.Object {
  var authTtl: js.UndefOr[scala.Double] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var iatTtl: js.UndefOr[scala.Double] = js.undefined
  var issuer: java.lang.String
}

object Anon_AuthTtl {
  @scala.inline
  def apply(
    issuer: java.lang.String,
    authTtl: scala.Int | scala.Double = null,
    clientId: java.lang.String = null,
    iatTtl: scala.Int | scala.Double = null
  ): Anon_AuthTtl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("issuer")(issuer)
    if (authTtl != null) __obj.updateDynamic("authTtl")(authTtl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (iatTtl != null) __obj.updateDynamic("iatTtl")(iatTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthTtl]
  }
}


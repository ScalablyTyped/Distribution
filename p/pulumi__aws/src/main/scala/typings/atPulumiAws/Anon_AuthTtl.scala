package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthTtl extends js.Object {
  var authTtl: js.UndefOr[Double] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var iatTtl: js.UndefOr[Double] = js.undefined
  var issuer: String
}

object Anon_AuthTtl {
  @scala.inline
  def apply(issuer: String, authTtl: Int | Double = null, clientId: String = null, iatTtl: Int | Double = null): Anon_AuthTtl = {
    val __obj = js.Dynamic.literal(issuer = issuer)
    if (authTtl != null) __obj.updateDynamic("authTtl")(authTtl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (iatTtl != null) __obj.updateDynamic("iatTtl")(iatTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthTtl]
  }
}


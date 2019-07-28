package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CrlConfigurations extends js.Object {
  var crlConfigurations: js.UndefOr[js.Array[Anon_CustomCnameEnabledExpirationInDays]] = js.undefined
}

object Anon_CrlConfigurations {
  @scala.inline
  def apply(crlConfigurations: js.Array[Anon_CustomCnameEnabledExpirationInDays] = null): Anon_CrlConfigurations = {
    val __obj = js.Dynamic.literal()
    if (crlConfigurations != null) __obj.updateDynamic("crlConfigurations")(crlConfigurations)
    __obj.asInstanceOf[Anon_CrlConfigurations]
  }
}


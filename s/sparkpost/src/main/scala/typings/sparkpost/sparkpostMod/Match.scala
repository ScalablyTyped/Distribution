package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /** Inbound domain associated with this webhook. Required when protocol is “SMTP”. */
  var domain: js.UndefOr[String] = js.undefined
  /** ESME address binding associated with this webhook  yes, when protocol is “SMPP”. SparkPost Enterprise API only. */
  var esme_address: js.UndefOr[String] = js.undefined
  /** Inbound messaging protocol associated with this webhook. Defaults to “SMTP” */
  var protocol: js.UndefOr[String] = js.undefined
}

object Match {
  @scala.inline
  def apply(domain: String = null, esme_address: String = null, protocol: String = null): Match = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (esme_address != null) __obj.updateDynamic("esme_address")(esme_address.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
}


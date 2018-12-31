package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /** Inbound domain associated with this webhook. Required when protocol is “SMTP”. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** ESME address binding associated with this webhook  yes, when protocol is “SMPP”. SparkPost Enterprise API only. */
  var esme_address: js.UndefOr[java.lang.String] = js.undefined
  /** Inbound messaging protocol associated with this webhook. Defaults to “SMTP” */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}


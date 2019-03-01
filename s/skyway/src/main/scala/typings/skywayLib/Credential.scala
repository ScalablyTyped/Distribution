package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  var authToken: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object Credential {
  @scala.inline
  def apply(
    authToken: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    ttl: scala.Int | scala.Double = null
  ): Credential = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
}


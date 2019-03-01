package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedIpRange extends js.Object {
  var allowedIpRange: js.UndefOr[java.lang.String] = js.undefined
  var secretToken: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AllowedIpRange {
  @scala.inline
  def apply(allowedIpRange: java.lang.String = null, secretToken: java.lang.String = null): Anon_AllowedIpRange = {
    val __obj = js.Dynamic.literal()
    if (allowedIpRange != null) __obj.updateDynamic("allowedIpRange")(allowedIpRange)
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken)
    __obj.asInstanceOf[Anon_AllowedIpRange]
  }
}


package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedIpRange extends js.Object {
  var allowedIpRange: js.UndefOr[String] = js.undefined
  var secretToken: js.UndefOr[String] = js.undefined
}

object Anon_AllowedIpRange {
  @scala.inline
  def apply(allowedIpRange: String = null, secretToken: String = null): Anon_AllowedIpRange = {
    val __obj = js.Dynamic.literal()
    if (allowedIpRange != null) __obj.updateDynamic("allowedIpRange")(allowedIpRange)
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken)
    __obj.asInstanceOf[Anon_AllowedIpRange]
  }
}


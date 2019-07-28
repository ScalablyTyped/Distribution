package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuditGeneral extends js.Object {
  var audit: js.UndefOr[Input[Boolean]] = js.undefined
  var general: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_AuditGeneral {
  @scala.inline
  def apply(audit: Input[Boolean] = null, general: Input[Boolean] = null): Anon_AuditGeneral = {
    val __obj = js.Dynamic.literal()
    if (audit != null) __obj.updateDynamic("audit")(audit.asInstanceOf[js.Any])
    if (general != null) __obj.updateDynamic("general")(general.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuditGeneral]
  }
}


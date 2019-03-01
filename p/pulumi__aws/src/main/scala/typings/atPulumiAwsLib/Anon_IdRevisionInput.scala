package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdRevisionInput extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var revision: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_IdRevisionInput {
  @scala.inline
  def apply(
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    revision: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_IdRevisionInput = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdRevisionInput]
  }
}


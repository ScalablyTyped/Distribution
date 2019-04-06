package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColdStorageAfterDeleteAfter extends js.Object {
  var coldStorageAfter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var deleteAfter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_ColdStorageAfterDeleteAfter {
  @scala.inline
  def apply(
    coldStorageAfter: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    deleteAfter: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_ColdStorageAfterDeleteAfter = {
    val __obj = js.Dynamic.literal()
    if (coldStorageAfter != null) __obj.updateDynamic("coldStorageAfter")(coldStorageAfter.asInstanceOf[js.Any])
    if (deleteAfter != null) __obj.updateDynamic("deleteAfter")(deleteAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColdStorageAfterDeleteAfter]
  }
}


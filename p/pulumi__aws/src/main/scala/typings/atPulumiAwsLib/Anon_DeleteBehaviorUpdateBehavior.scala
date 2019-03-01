package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteBehaviorUpdateBehavior extends js.Object {
  var deleteBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var updateBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeleteBehaviorUpdateBehavior {
  @scala.inline
  def apply(
    deleteBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    updateBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DeleteBehaviorUpdateBehavior = {
    val __obj = js.Dynamic.literal()
    if (deleteBehavior != null) __obj.updateDynamic("deleteBehavior")(deleteBehavior.asInstanceOf[js.Any])
    if (updateBehavior != null) __obj.updateDynamic("updateBehavior")(updateBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteBehaviorUpdateBehavior]
  }
}


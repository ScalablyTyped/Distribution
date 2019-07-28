package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteBehaviorUpdateBehavior extends js.Object {
  var deleteBehavior: js.UndefOr[Input[String]] = js.undefined
  var updateBehavior: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeleteBehaviorUpdateBehavior {
  @scala.inline
  def apply(deleteBehavior: Input[String] = null, updateBehavior: Input[String] = null): Anon_DeleteBehaviorUpdateBehavior = {
    val __obj = js.Dynamic.literal()
    if (deleteBehavior != null) __obj.updateDynamic("deleteBehavior")(deleteBehavior.asInstanceOf[js.Any])
    if (updateBehavior != null) __obj.updateDynamic("updateBehavior")(updateBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteBehaviorUpdateBehavior]
  }
}


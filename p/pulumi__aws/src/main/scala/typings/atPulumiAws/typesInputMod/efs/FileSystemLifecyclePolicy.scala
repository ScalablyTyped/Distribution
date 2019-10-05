package typings.atPulumiAws.typesInputMod.efs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemLifecyclePolicy extends js.Object {
  /**
    * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
    */
  var transitionToIa: js.UndefOr[Input[String]] = js.undefined
}

object FileSystemLifecyclePolicy {
  @scala.inline
  def apply(transitionToIa: Input[String] = null): FileSystemLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (transitionToIa != null) __obj.updateDynamic("transitionToIa")(transitionToIa.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemLifecyclePolicy]
  }
}


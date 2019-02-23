package typings
package atPulumiAwsLib.ssmPatchGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchGroupState extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}


package typings.pulumiAws.getPatchBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineArgs extends js.Object {
  /**
    * Filters the results against the baselines defaultBaseline field.
    */
  val defaultBaseline: js.UndefOr[Boolean] = js.native
  /**
    * Filter results by the baseline name prefix.
    */
  val namePrefix: js.UndefOr[String] = js.native
  /**
    * The specified OS for the baseline.
    */
  val operatingSystem: js.UndefOr[String] = js.native
  /**
    * The owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
    */
  val owner: String = js.native
}

object GetPatchBaselineArgs {
  @scala.inline
  def apply(
    owner: String,
    defaultBaseline: js.UndefOr[Boolean] = js.undefined,
    namePrefix: String = null,
    operatingSystem: String = null
  ): GetPatchBaselineArgs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultBaseline)) __obj.updateDynamic("defaultBaseline")(defaultBaseline.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineArgs]
  }
}


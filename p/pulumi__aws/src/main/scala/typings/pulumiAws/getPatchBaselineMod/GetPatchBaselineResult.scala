package typings.pulumiAws.getPatchBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineResult extends js.Object {
  val defaultBaseline: js.UndefOr[Boolean] = js.native
  /**
    * The description of the baseline.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the baseline.
    */
  val name: String = js.native
  val namePrefix: js.UndefOr[String] = js.native
  val operatingSystem: js.UndefOr[String] = js.native
  val owner: String = js.native
}

object GetPatchBaselineResult {
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    owner: String,
    defaultBaseline: js.UndefOr[Boolean] = js.undefined,
    namePrefix: String = null,
    operatingSystem: String = null
  ): GetPatchBaselineResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultBaseline)) __obj.updateDynamic("defaultBaseline")(defaultBaseline.get.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineResult]
  }
}


package typings.pulumiAws.planMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.backup.PlanRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanState extends js.Object {
  /**
    * The ARN of the backup plan.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The display name of a backup plan.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A rule object that specifies a scheduled task that is used to back up a selection of resources.
    */
  val rules: js.UndefOr[Input[js.Array[Input[PlanRule]]]] = js.native
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object PlanState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    rules: Input[js.Array[Input[PlanRule]]] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): PlanState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanState]
  }
}


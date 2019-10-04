package typings.atPulumiAws.backupPlanMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.backupNs.PlanRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanArgs extends js.Object {
  /**
    * The display name of a backup plan.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A rule object that specifies a scheduled task that is used to back up a selection of resources.
    */
  val rules: Input[js.Array[Input[PlanRule]]]
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object PlanArgs {
  @scala.inline
  def apply(
    rules: Input[js.Array[Input[PlanRule]]],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): PlanArgs = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanArgs]
  }
}


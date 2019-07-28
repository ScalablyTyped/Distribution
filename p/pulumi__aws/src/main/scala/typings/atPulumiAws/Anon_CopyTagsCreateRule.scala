package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyTagsCreateRule extends js.Object {
  var copyTags: js.UndefOr[Input[Boolean]] = js.undefined
  var createRule: Input[Anon_IntervalIntervalUnitTimes]
  var name: Input[String]
  var retainRule: Input[Anon_CountInput]
  var tagsToAdd: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object Anon_CopyTagsCreateRule {
  @scala.inline
  def apply(
    createRule: Input[Anon_IntervalIntervalUnitTimes],
    name: Input[String],
    retainRule: Input[Anon_CountInput],
    copyTags: Input[Boolean] = null,
    tagsToAdd: Input[StringDictionary[_]] = null
  ): Anon_CopyTagsCreateRule = {
    val __obj = js.Dynamic.literal(createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
    if (copyTags != null) __obj.updateDynamic("copyTags")(copyTags.asInstanceOf[js.Any])
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CopyTagsCreateRule]
  }
}


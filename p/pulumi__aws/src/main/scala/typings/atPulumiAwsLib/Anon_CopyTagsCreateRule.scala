package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyTagsCreateRule extends js.Object {
  var copyTags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var createRule: atPulumiPulumiLib.outputMod.Input[Anon_IntervalIntervalUnitTimes]
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var retainRule: atPulumiPulumiLib.outputMod.Input[Anon_CountInput]
  var tagsToAdd: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object Anon_CopyTagsCreateRule {
  @scala.inline
  def apply(
    createRule: atPulumiPulumiLib.outputMod.Input[Anon_IntervalIntervalUnitTimes],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    retainRule: atPulumiPulumiLib.outputMod.Input[Anon_CountInput],
    copyTags: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    tagsToAdd: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Anon_CopyTagsCreateRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createRule")(createRule.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("retainRule")(retainRule.asInstanceOf[js.Any])
    if (copyTags != null) __obj.updateDynamic("copyTags")(copyTags.asInstanceOf[js.Any])
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CopyTagsCreateRule]
  }
}


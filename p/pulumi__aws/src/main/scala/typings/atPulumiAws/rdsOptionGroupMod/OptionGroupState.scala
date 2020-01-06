package typings.atPulumiAws.rdsOptionGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.rds.OptionGroupOption
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupState extends js.Object {
  /**
    * The ARN of the db option group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Name of the setting.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the option group. Defaults to "Managed by Pulumi".
    */
  val optionGroupDescription: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Options to apply.
    */
  val options: js.UndefOr[Input[js.Array[Input[OptionGroupOption]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object OptionGroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    engineName: Input[String] = null,
    majorEngineVersion: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    optionGroupDescription: Input[String] = null,
    options: Input[js.Array[Input[OptionGroupOption]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): OptionGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (engineName != null) __obj.updateDynamic("engineName")(engineName.asInstanceOf[js.Any])
    if (majorEngineVersion != null) __obj.updateDynamic("majorEngineVersion")(majorEngineVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (optionGroupDescription != null) __obj.updateDynamic("optionGroupDescription")(optionGroupDescription.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupState]
  }
}


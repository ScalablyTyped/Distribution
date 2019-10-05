package typings.atPulumiAws.rdsOptionGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.rds.OptionGroupOption
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupArgs extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: Input[String]
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: Input[String]
  /**
    * The Name of the setting.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the option group. Defaults to "Managed by Pulumi".
    */
  val optionGroupDescription: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of Options to apply.
    */
  val options: js.UndefOr[Input[js.Array[Input[OptionGroupOption]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object OptionGroupArgs {
  @scala.inline
  def apply(
    engineName: Input[String],
    majorEngineVersion: Input[String],
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    optionGroupDescription: Input[String] = null,
    options: Input[js.Array[Input[OptionGroupOption]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): OptionGroupArgs = {
    val __obj = js.Dynamic.literal(engineName = engineName.asInstanceOf[js.Any], majorEngineVersion = majorEngineVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (optionGroupDescription != null) __obj.updateDynamic("optionGroupDescription")(optionGroupDescription.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupArgs]
  }
}


package typings.atPulumiAws.redshiftParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValue
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupArgs extends js.Object {
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The family of the Redshift parameter group.
    */
  val family: Input[String]
  /**
    * The name of the Redshift parameter.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of Redshift parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[Anon_NameValue]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ParameterGroupArgs {
  @scala.inline
  def apply(
    family: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[js.Array[Input[Anon_NameValue]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ParameterGroupArgs = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupArgs]
  }
}


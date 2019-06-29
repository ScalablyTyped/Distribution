package typings
package atPulumiAwsLib.appsyncFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionArgs extends js.Object {
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Function DataSource name.
    */
  val dataSource: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Function description.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version of the request mapping template. Currently the supported value is `2018-05-29`.
    */
  val functionVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Function name. The function name does not have to be unique.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  val requestMappingTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object FunctionArgs {
  @scala.inline
  def apply(
    apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dataSource: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    requestMappingTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    responseMappingTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    functionVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): FunctionArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], responseMappingTemplate = responseMappingTemplate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionArgs]
  }
}


package typings.atPulumiAws.appsyncFunctionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionArgs extends js.Object {
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: Input[String]
  /**
    * The Function DataSource name.
    */
  val dataSource: Input[String]
  /**
    * The Function description.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The version of the request mapping template. Currently the supported value is `2018-05-29`.
    */
  val functionVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Function name. The function name does not have to be unique.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  val requestMappingTemplate: Input[String]
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: Input[String]
}

object FunctionArgs {
  @scala.inline
  def apply(
    apiId: Input[String],
    dataSource: Input[String],
    requestMappingTemplate: Input[String],
    responseMappingTemplate: Input[String],
    description: Input[String] = null,
    functionVersion: Input[String] = null,
    name: Input[String] = null
  ): FunctionArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], responseMappingTemplate = responseMappingTemplate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionArgs]
  }
}


package typings.pulumiAws.functionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionState extends js.Object {
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the Function object.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Function DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.native
  /**
    * The Function description.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A unique ID representing the Function object.
    */
  val functionId: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the request mapping template. Currently the supported value is `2018-05-29`.
    */
  val functionVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Function name. The function name does not have to be unique.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  val requestMappingTemplate: js.UndefOr[Input[String]] = js.native
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: js.UndefOr[Input[String]] = js.native
}

object FunctionState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    arn: Input[String] = null,
    dataSource: Input[String] = null,
    description: Input[String] = null,
    functionId: Input[String] = null,
    functionVersion: Input[String] = null,
    name: Input[String] = null,
    requestMappingTemplate: Input[String] = null,
    responseMappingTemplate: Input[String] = null
  ): FunctionState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (functionId != null) __obj.updateDynamic("functionId")(functionId.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (requestMappingTemplate != null) __obj.updateDynamic("requestMappingTemplate")(requestMappingTemplate.asInstanceOf[js.Any])
    if (responseMappingTemplate != null) __obj.updateDynamic("responseMappingTemplate")(responseMappingTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionState]
  }
}


package typings.atPulumiAws.apigatewayModelMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArgs extends js.Object {
  /**
    * The content type of the model
    */
  val contentType: Input[String]
  /**
    * The description of the model
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the model
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[RestApi]
  /**
    * The schema of the model in a JSON form
    */
  val schema: js.UndefOr[Input[String]] = js.undefined
}

object ModelArgs {
  @scala.inline
  def apply(
    contentType: Input[String],
    restApi: Input[RestApi],
    description: Input[String] = null,
    name: Input[String] = null,
    schema: Input[String] = null
  ): ModelArgs = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArgs]
  }
}


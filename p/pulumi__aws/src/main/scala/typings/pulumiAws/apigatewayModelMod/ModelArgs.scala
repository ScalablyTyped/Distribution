package typings.pulumiAws.apigatewayModelMod

import typings.pulumiAws.restApiMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelArgs extends js.Object {
  /**
    * The content type of the model
    */
  val contentType: Input[String] = js.native
  /**
    * The description of the model
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the model
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The schema of the model in a JSON form
    */
  val schema: js.UndefOr[Input[String]] = js.native
}

object ModelArgs {
  @scala.inline
  def apply(
    contentType: Input[String],
    restApi: Input[String | RestApi],
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


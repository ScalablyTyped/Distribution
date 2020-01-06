package typings.atPulumiAws.apigatewayModelMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelState extends js.Object {
  /**
    * The content type of the model
    */
  val contentType: js.UndefOr[Input[String]] = js.native
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
  val restApi: js.UndefOr[Input[RestApi]] = js.native
  /**
    * The schema of the model in a JSON form
    */
  val schema: js.UndefOr[Input[String]] = js.native
}

object ModelState {
  @scala.inline
  def apply(
    contentType: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    restApi: Input[RestApi] = null,
    schema: Input[String] = null
  ): ModelState = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelState]
  }
}


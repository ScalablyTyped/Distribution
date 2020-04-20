package typings.pulumiAws.modelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelArgs extends js.Object {
  /**
    * The API identifier.
    */
  val apiId: Input[String] = js.native
  /**
    * The content-type for the model, for example, `application/json`.
    */
  val contentType: Input[String] = js.native
  /**
    * The description of the model.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the model. Must be alphanumeric.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model.
    */
  val schema: Input[String] = js.native
}

object ModelArgs {
  @scala.inline
  def apply(
    apiId: Input[String],
    contentType: Input[String],
    schema: Input[String],
    description: Input[String] = null,
    name: Input[String] = null
  ): ModelArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArgs]
  }
}


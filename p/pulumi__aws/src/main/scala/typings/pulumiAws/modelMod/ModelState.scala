package typings.pulumiAws.modelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelState extends js.Object {
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The content-type for the model, for example, `application/json`.
    */
  val contentType: js.UndefOr[Input[String]] = js.native
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
  val schema: js.UndefOr[Input[String]] = js.native
}

object ModelState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    contentType: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    schema: Input[String] = null
  ): ModelState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelState]
  }
}


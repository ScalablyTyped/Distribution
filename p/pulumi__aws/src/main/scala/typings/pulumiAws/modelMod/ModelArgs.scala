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
  def apply(apiId: Input[String], contentType: Input[String], schema: Input[String]): ModelArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArgs]
  }
  @scala.inline
  implicit class ModelArgsOps[Self <: ModelArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: Input[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: Input[String]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


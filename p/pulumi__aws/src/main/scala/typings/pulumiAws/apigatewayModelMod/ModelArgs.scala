package typings.pulumiAws.apigatewayModelMod

import typings.pulumiAws.apigatewayMod.RestApi
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
  def apply(contentType: Input[String], restApi: Input[String | RestApi]): ModelArgs = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
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
    def setContentType(value: Input[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSchema(value: Input[String]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}


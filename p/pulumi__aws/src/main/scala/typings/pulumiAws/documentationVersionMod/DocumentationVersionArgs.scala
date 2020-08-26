package typings.pulumiAws.documentationVersionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationVersionArgs extends js.Object {
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: Input[String] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: Input[String] = js.native
}

object DocumentationVersionArgs {
  @scala.inline
  def apply(restApiId: Input[String], version: Input[String]): DocumentationVersionArgs = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersionArgs]
  }
  @scala.inline
  implicit class DocumentationVersionArgsOps[Self <: DocumentationVersionArgs] (val x: Self) extends AnyVal {
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
    def setRestApiId(value: Input[String]): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}


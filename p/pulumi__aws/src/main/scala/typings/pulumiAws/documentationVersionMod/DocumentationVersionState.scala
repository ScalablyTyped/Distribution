package typings.pulumiAws.documentationVersionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationVersionState extends js.Object {
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: js.UndefOr[Input[String]] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object DocumentationVersionState {
  @scala.inline
  def apply(description: Input[String] = null, restApiId: Input[String] = null, version: Input[String] = null): DocumentationVersionState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationVersionState]
  }
}


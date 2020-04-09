package typings.pulumiAws.inputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPrimaryContainer extends js.Object {
  /**
    * The DNS host name for the container.
    */
  var containerHostname: js.UndefOr[Input[String]] = js.native
  /**
    * Environment variables for the Docker container.
    * A list of key value pairs.
    */
  var environment: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The registry path where the inference code image is stored in Amazon ECR.
    */
  var image: Input[String] = js.native
  /**
    * The URL for the S3 location where model artifacts are stored.
    */
  var modelDataUrl: js.UndefOr[Input[String]] = js.native
}

object ModelPrimaryContainer {
  @scala.inline
  def apply(
    image: Input[String],
    containerHostname: Input[String] = null,
    environment: Input[StringDictionary[_]] = null,
    modelDataUrl: Input[String] = null
  ): ModelPrimaryContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPrimaryContainer]
  }
}


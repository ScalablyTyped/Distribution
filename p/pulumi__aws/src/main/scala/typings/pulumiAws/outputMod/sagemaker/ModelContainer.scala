package typings.pulumiAws.outputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelContainer extends js.Object {
  /**
    * The DNS host name for the container.
    */
  var containerHostname: js.UndefOr[String] = js.native
  /**
    * Environment variables for the Docker container.
    * A list of key value pairs.
    */
  var environment: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The registry path where the inference code image is stored in Amazon ECR.
    */
  var image: String = js.native
  /**
    * The URL for the S3 location where model artifacts are stored.
    */
  var modelDataUrl: js.UndefOr[String] = js.native
}

object ModelContainer {
  @scala.inline
  def apply(
    image: String,
    containerHostname: String = null,
    environment: StringDictionary[js.Any] = null,
    modelDataUrl: String = null
  ): ModelContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelContainer]
  }
}


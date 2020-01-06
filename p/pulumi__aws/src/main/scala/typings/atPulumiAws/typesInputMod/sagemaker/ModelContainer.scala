package typings.atPulumiAws.typesInputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelContainer extends js.Object {
  var containerHostname: js.UndefOr[Input[String]] = js.native
  var environment: js.UndefOr[Input[StringDictionary[_]]] = js.native
  var image: Input[String] = js.native
  var modelDataUrl: js.UndefOr[Input[String]] = js.native
}

object ModelContainer {
  @scala.inline
  def apply(
    image: Input[String],
    containerHostname: Input[String] = null,
    environment: Input[StringDictionary[_]] = null,
    modelDataUrl: Input[String] = null
  ): ModelContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelContainer]
  }
}


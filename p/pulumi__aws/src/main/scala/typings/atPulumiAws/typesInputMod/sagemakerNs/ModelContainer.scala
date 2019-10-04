package typings.atPulumiAws.typesInputMod.sagemakerNs

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelContainer extends js.Object {
  var containerHostname: js.UndefOr[Input[String]] = js.undefined
  var environment: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var image: Input[String]
  var modelDataUrl: js.UndefOr[Input[String]] = js.undefined
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


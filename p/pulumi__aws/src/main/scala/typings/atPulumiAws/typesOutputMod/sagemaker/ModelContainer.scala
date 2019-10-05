package typings.atPulumiAws.typesOutputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelContainer extends js.Object {
  var containerHostname: js.UndefOr[String] = js.undefined
  var environment: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var image: String
  var modelDataUrl: js.UndefOr[String] = js.undefined
}

object ModelContainer {
  @scala.inline
  def apply(
    image: String,
    containerHostname: String = null,
    environment: StringDictionary[js.Any] = null,
    modelDataUrl: String = null
  ): ModelContainer = {
    val __obj = js.Dynamic.literal(image = image)
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl)
    __obj.asInstanceOf[ModelContainer]
  }
}


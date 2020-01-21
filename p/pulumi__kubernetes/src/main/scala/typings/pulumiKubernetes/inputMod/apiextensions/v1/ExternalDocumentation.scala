package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
trait ExternalDocumentation extends js.Object {
  var description: js.UndefOr[Input[String]] = js.undefined
  var url: js.UndefOr[Input[String]] = js.undefined
}

object ExternalDocumentation {
  @scala.inline
  def apply(description: Input[String] = null, url: Input[String] = null): ExternalDocumentation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentation]
  }
}


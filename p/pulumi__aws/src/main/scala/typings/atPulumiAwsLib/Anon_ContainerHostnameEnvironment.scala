package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerHostnameEnvironment extends js.Object {
  var containerHostname: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var environment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var image: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var modelDataUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ContainerHostnameEnvironment {
  @scala.inline
  def apply(
    image: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    containerHostname: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    environment: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    modelDataUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ContainerHostnameEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerHostnameEnvironment]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerHostname extends js.Object {
  var containerHostname: js.UndefOr[java.lang.String] = js.undefined
  var environment: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var image: java.lang.String
  var modelDataUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContainerHostname {
  @scala.inline
  def apply(
    image: java.lang.String,
    containerHostname: java.lang.String = null,
    environment: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    modelDataUrl: java.lang.String = null
  ): Anon_ContainerHostname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image)
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl)
    __obj.asInstanceOf[Anon_ContainerHostname]
  }
}


package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    apiVersion: java.lang.String = null,
    endpoint: java.lang.String = null,
    headers: js.Any = null,
    origin: java.lang.String = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[ConstructorOptions]
  }
}


package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NSOptionsWithoutNamespaces extends NSOptions {
  @JSName("additionalNamespaces")
  var additionalNamespaces_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("resolvePrefix")
  var resolvePrefix_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("xmlns")
  var xmlns_NSOptionsWithoutNamespaces: js.UndefOr[`false`] = js.undefined
}

object NSOptionsWithoutNamespaces {
  @scala.inline
  def apply(
    additionalNamespaces: js.UndefOr[scala.Nothing] = js.undefined,
    resolvePrefix: js.UndefOr[scala.Nothing] = js.undefined,
    xmlns: `false` = null
  ): NSOptionsWithoutNamespaces = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalNamespaces)) __obj.updateDynamic("additionalNamespaces")(additionalNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(resolvePrefix)) __obj.updateDynamic("resolvePrefix")(resolvePrefix.asInstanceOf[js.Any])
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptionsWithoutNamespaces]
  }
}


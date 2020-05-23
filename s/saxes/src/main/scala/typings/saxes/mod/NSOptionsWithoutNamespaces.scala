package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import typings.std.Record
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
    additionalNamespaces: Record[String, String] = null,
    resolvePrefix: /* prefix */ String => js.UndefOr[String] = null,
    xmlns: `false` = null
  ): NSOptionsWithoutNamespaces = {
    val __obj = js.Dynamic.literal()
    if (additionalNamespaces != null) __obj.updateDynamic("additionalNamespaces")(additionalNamespaces.asInstanceOf[js.Any])
    if (resolvePrefix != null) __obj.updateDynamic("resolvePrefix")(js.Any.fromFunction1(resolvePrefix))
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptionsWithoutNamespaces]
  }
}


package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NSOptionsWithNamespaces extends NSOptions {
  @JSName("xmlns")
  var xmlns_NSOptionsWithNamespaces: `true`
}

object NSOptionsWithNamespaces {
  @scala.inline
  def apply(
    xmlns: `true`,
    additionalNamespaces: Record[String, String] = null,
    resolvePrefix: /* prefix */ String => js.UndefOr[String] = null
  ): NSOptionsWithNamespaces = {
    val __obj = js.Dynamic.literal(xmlns = xmlns.asInstanceOf[js.Any])
    if (additionalNamespaces != null) __obj.updateDynamic("additionalNamespaces")(additionalNamespaces.asInstanceOf[js.Any])
    if (resolvePrefix != null) __obj.updateDynamic("resolvePrefix")(js.Any.fromFunction1(resolvePrefix))
    __obj.asInstanceOf[NSOptionsWithNamespaces]
  }
}


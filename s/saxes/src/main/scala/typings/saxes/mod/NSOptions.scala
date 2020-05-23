package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NSOptions extends js.Object {
  /**
    * A plain object whose key, value pairs define namespaces known before
    * parsing the XML file. It is not legal to pass bindings for the namespaces
    * ``"xml"`` or ``"xmlns"``.
    */
  var additionalNamespaces: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * A function that will be used if the parser cannot resolve a namespace
    * prefix on its own.
    */
  var resolvePrefix: js.UndefOr[ResolvePrefix] = js.undefined
  /** Whether to track namespaces. Unset means ``false``. */
  var xmlns: js.UndefOr[Boolean] = js.undefined
}

object NSOptions {
  @scala.inline
  def apply(
    additionalNamespaces: Record[String, String] = null,
    resolvePrefix: /* prefix */ String => js.UndefOr[String] = null,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): NSOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalNamespaces != null) __obj.updateDynamic("additionalNamespaces")(additionalNamespaces.asInstanceOf[js.Any])
    if (resolvePrefix != null) __obj.updateDynamic("resolvePrefix")(js.Any.fromFunction1(resolvePrefix))
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptions]
  }
}


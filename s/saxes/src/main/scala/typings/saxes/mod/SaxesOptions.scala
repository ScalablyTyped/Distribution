package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesOptions extends js.Object {
  var additionalNamespaces: js.UndefOr[Record[String, String]] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var fragment: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[Boolean] = js.undefined
  var xmlns: js.UndefOr[Boolean] = js.undefined
}

object SaxesOptions {
  @scala.inline
  def apply(
    additionalNamespaces: Record[String, String] = null,
    fileName: String = null,
    fragment: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): SaxesOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalNamespaces != null) __obj.updateDynamic("additionalNamespaces")(additionalNamespaces.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(fragment)) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesOptions]
  }
}


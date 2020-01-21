package typings.reactabularTable.mod

import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var columns: js.Array[Column]
  var renderers: js.UndefOr[Renderers] = js.undefined
  var style: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    className: String = null,
    renderers: Renderers = null,
    style: Partial[CSSStyleDeclaration] = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
}


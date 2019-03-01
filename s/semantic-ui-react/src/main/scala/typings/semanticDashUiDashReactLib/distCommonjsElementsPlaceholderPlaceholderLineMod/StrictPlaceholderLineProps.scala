package typings
package semanticDashUiDashReactLib.distCommonjsElementsPlaceholderPlaceholderLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPlaceholderLineProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A line can specify how long its contents should appear. */
  var length: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.full | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very long`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.long | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.medium | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.short | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very short`)
  ] = js.undefined
}

object StrictPlaceholderLineProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    className: java.lang.String = null,
    length: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.full | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very long`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.long | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.medium | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.short | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very short`) = null
  ): StrictPlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPlaceholderLineProps]
  }
}


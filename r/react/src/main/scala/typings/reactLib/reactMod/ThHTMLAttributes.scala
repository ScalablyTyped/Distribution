package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThHTMLAttributes[T] extends HTMLAttributes[T] {
  var align: js.UndefOr[
    reactLib.reactLibStrings.left | reactLib.reactLibStrings.center | reactLib.reactLibStrings.right | reactLib.reactLibStrings.justify | reactLib.reactLibStrings.char
  ] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[java.lang.String] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object ThHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    align: reactLib.reactLibStrings.left | reactLib.reactLibStrings.center | reactLib.reactLibStrings.right | reactLib.reactLibStrings.justify | reactLib.reactLibStrings.char = null,
    colSpan: scala.Int | scala.Double = null,
    headers: java.lang.String = null,
    rowSpan: scala.Int | scala.Double = null,
    scope: java.lang.String = null
  ): ThHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ThHTMLAttributes[T]]
  }
}


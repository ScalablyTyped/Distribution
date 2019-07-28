package typings.react.reactMod

import typings.react.reactStrings.center
import typings.react.reactStrings.char
import typings.react.reactStrings.justify
import typings.react.reactStrings.left
import typings.react.reactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThHTMLAttributes[T] extends HTMLAttributes[T] {
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object ThHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    align: left | center | right | justify | char = null,
    colSpan: Int | Double = null,
    headers: String = null,
    rowSpan: Int | Double = null,
    scope: String = null
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


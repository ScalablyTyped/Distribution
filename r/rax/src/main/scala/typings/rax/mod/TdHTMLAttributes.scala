package typings.rax.mod

import typings.rax.raxStrings.center
import typings.rax.raxStrings.char
import typings.rax.raxStrings.justify
import typings.rax.raxStrings.left
import typings.rax.raxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TdHTMLAttributes[T] extends HTMLAttributes[T] {
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object TdHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    align: left | center | right | justify | char = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    headers: String = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    scope: String = null
  ): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
}


package typings.rax.mod

import typings.rax.raxStrings.A
import typings.rax.raxStrings.I
import typings.rax.raxStrings.`1`
import typings.rax.raxStrings.a_
import typings.rax.raxStrings.i_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlHTMLAttributes[T] extends HTMLAttributes[T] {
  var reversed: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I] = js.undefined
}

object OlHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    `type`: `1` | a_ | A | i_ | I = null
  ): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
}


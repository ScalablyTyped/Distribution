package typings.react.reactMod

import typings.react.reactStrings.A
import typings.react.reactStrings.I
import typings.react.reactStrings.`1`
import typings.react.reactStrings.a
import typings.react.reactStrings.i
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlHTMLAttributes[T] extends HTMLAttributes[T] {
  var reversed: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[`1` | a | A | i | I] = js.undefined
}

object OlHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    `type`: `1` | a | A | i | I = null
  ): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
}


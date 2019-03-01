package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlHTMLAttributes[T] extends HTMLAttributes[T] {
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[
    reactLib.reactLibStrings.`1` | reactLib.reactLibStrings.a | reactLib.reactLibStrings.A | reactLib.reactLibStrings.i | reactLib.reactLibStrings.I
  ] = js.undefined
}

object OlHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    `type`: reactLib.reactLibStrings.`1` | reactLib.reactLibStrings.a | reactLib.reactLibStrings.A | reactLib.reactLibStrings.i | reactLib.reactLibStrings.I = null
  ): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
}


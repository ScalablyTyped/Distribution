package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteHTMLAttributes[T] extends HTMLAttributes[T] {
  var cite: js.UndefOr[String] = js.undefined
}

object BlockquoteHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, cite: String = null): BlockquoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cite != null) __obj.updateDynamic("cite")(cite)
    __obj.asInstanceOf[BlockquoteHTMLAttributes[T]]
  }
}


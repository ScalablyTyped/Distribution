package typings.rax.mod

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
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteHTMLAttributes[T]]
  }
}


package typings.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions extends js.Object {
  /**
    * The function to be called after processing the CSS.
    */
  def post(): Unit
  /**
    * The function to be called before processing the CSS.
    */
  def pre(): Unit
}

object HookOptions {
  @scala.inline
  def apply(post: () => Unit, pre: () => Unit): HookOptions = {
    val __obj = js.Dynamic.literal(post = js.Any.fromFunction0(post), pre = js.Any.fromFunction0(pre))
    __obj.asInstanceOf[HookOptions]
  }
}


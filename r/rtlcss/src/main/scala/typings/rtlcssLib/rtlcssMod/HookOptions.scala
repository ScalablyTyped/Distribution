package typings
package rtlcssLib.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions extends js.Object {
  /**
    * The function to be called after processing the CSS.
    */
  def post(): scala.Unit
  /**
    * The function to be called before processing the CSS.
    */
  def pre(): scala.Unit
}

object HookOptions {
  @scala.inline
  def apply(post: () => scala.Unit, pre: () => scala.Unit): HookOptions = {
    val __obj = js.Dynamic.literal(post = js.Any.fromFunction0(post), pre = js.Any.fromFunction0(pre))
  
    __obj.asInstanceOf[HookOptions]
  }
}


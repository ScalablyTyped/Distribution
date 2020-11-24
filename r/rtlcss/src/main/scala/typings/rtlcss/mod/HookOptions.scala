package typings.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookOptions extends js.Object {
  
  /**
    * The function to be called after processing the CSS.
    */
  def post(): Unit = js.native
  
  /**
    * The function to be called before processing the CSS.
    */
  def pre(): Unit = js.native
}
object HookOptions {
  
  @scala.inline
  def apply(post: () => Unit, pre: () => Unit): HookOptions = {
    val __obj = js.Dynamic.literal(post = js.Any.fromFunction0(post), pre = js.Any.fromFunction0(pre))
    __obj.asInstanceOf[HookOptions]
  }
  
  @scala.inline
  implicit class HookOptionsOps[Self <: HookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPost(value: () => Unit): Self = this.set("post", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPre(value: () => Unit): Self = this.set("pre", js.Any.fromFunction0(value))
  }
}

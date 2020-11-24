package typings.setLink.anon

import typings.express.mod.Response_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attach extends js.Object {
  
  def attach(res: Response_[_]): Unit = js.native
}
object Attach {
  
  @scala.inline
  def apply(attach: Response_[_] => Unit): Attach = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
    __obj.asInstanceOf[Attach]
  }
  
  @scala.inline
  implicit class AttachOps[Self <: Attach] (val x: Self) extends AnyVal {
    
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
    def setAttach(value: Response_[_] => Unit): Self = this.set("attach", js.Any.fromFunction1(value))
  }
}

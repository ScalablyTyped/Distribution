package typings.reactEmailEditor.mod

import typings.reactEmailEditor.anon.Rows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Design extends js.Object {
  
  val body: Rows = js.native
  
  val counters: js.UndefOr[js.Object] = js.native
}
object Design {
  
  @scala.inline
  def apply(body: Rows): Design = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  
  @scala.inline
  implicit class DesignOps[Self <: Design] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Rows): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounters(value: js.Object): Self = this.set("counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounters: Self = this.set("counters", js.undefined)
  }
}

package typings.streamingIterables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamish extends js.Object {
  
  var once: js.Any = js.native
  
  var read: js.Any = js.native
}
object ReadableStreamish {
  
  @scala.inline
  def apply(once: js.Any, read: js.Any): ReadableStreamish = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamish]
  }
  
  @scala.inline
  implicit class ReadableStreamishOps[Self <: ReadableStreamish] (val x: Self) extends AnyVal {
    
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
    def setOnce(value: js.Any): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
  }
}

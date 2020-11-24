package typings.streamingIterables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableStreamish extends js.Object {
  
  var once: js.Any = js.native
  
  var removeListener: js.Any = js.native
  
  var write: js.Any = js.native
}
object WritableStreamish {
  
  @scala.inline
  def apply(once: js.Any, removeListener: js.Any, write: js.Any): WritableStreamish = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritableStreamish]
  }
  
  @scala.inline
  implicit class WritableStreamishOps[Self <: WritableStreamish] (val x: Self) extends AnyVal {
    
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
    def setRemoveListener(value: js.Any): Self = this.set("removeListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: js.Any): Self = this.set("write", value.asInstanceOf[js.Any])
  }
}

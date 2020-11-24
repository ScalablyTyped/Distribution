package typings.reactSimpleCodeEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offset extends js.Object {
  
  var offset: Double = js.native
  
  var stack: js.Array[SelectionEnd] = js.native
}
object Offset {
  
  @scala.inline
  def apply(offset: Double, stack: js.Array[SelectionEnd]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetOps[Self <: Offset] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: SelectionEnd*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[SelectionEnd]): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
}

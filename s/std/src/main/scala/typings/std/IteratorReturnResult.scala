package typings.std

import typings.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorReturnResult[TReturn]
  extends IteratorResult[js.Any, TReturn] {
  
  var done: `true` = js.native
  
  var value: TReturn = js.native
}
object IteratorReturnResult {
  
  @scala.inline
  def apply[TReturn](done: `true`, value: TReturn): IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  implicit class IteratorReturnResultOps[Self <: IteratorReturnResult[_], TReturn] (val x: Self with IteratorReturnResult[TReturn]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDone(value: `true`): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TReturn): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

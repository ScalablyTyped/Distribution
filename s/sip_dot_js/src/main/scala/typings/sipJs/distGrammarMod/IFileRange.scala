package typings.sipJs.distGrammarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileRange extends js.Object {
  
  var end: IFilePosition = js.native
  
  var start: IFilePosition = js.native
}
object IFileRange {
  
  @scala.inline
  def apply(end: IFilePosition, start: IFilePosition): IFileRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRange]
  }
  
  @scala.inline
  implicit class IFileRangeOps[Self <: IFileRange] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: IFilePosition): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: IFilePosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}

package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait MoveCursor
  extends IAction
     with IHasTarget {
  
  var by: js.UndefOr[js.Any] = js.native
  
  var to: js.UndefOr[js.Any] = js.native
}
object MoveCursor {
  
  @scala.inline
  def apply(): MoveCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveCursor]
  }
  
  @scala.inline
  implicit class MoveCursorOps[Self <: MoveCursor] (val x: Self) extends AnyVal {
    
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
    def setBy(value: js.Any): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}

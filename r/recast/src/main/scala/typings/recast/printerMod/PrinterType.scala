package typings.recast.printerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterType extends js.Object {
  
  def print(ast: js.Any): PrintResultType = js.native
  
  def printGenerically(ast: js.Any): PrintResultType = js.native
}
object PrinterType {
  
  @scala.inline
  def apply(print: js.Any => PrintResultType, printGenerically: js.Any => PrintResultType): PrinterType = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction1(print), printGenerically = js.Any.fromFunction1(printGenerically))
    __obj.asInstanceOf[PrinterType]
  }
  
  @scala.inline
  implicit class PrinterTypeOps[Self <: PrinterType] (val x: Self) extends AnyVal {
    
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
    def setPrint(value: js.Any => PrintResultType): Self = this.set("print", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrintGenerically(value: js.Any => PrintResultType): Self = this.set("printGenerically", js.Any.fromFunction1(value))
  }
}

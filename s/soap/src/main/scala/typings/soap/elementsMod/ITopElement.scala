package typings.soap.elementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITopElement extends js.Object {
  
  var methodName: String = js.native
  
  var outputName: String = js.native
}
object ITopElement {
  
  @scala.inline
  def apply(methodName: String, outputName: String): ITopElement = {
    val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopElement]
  }
  
  @scala.inline
  implicit class ITopElementOps[Self <: ITopElement] (val x: Self) extends AnyVal {
    
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
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputName(value: String): Self = this.set("outputName", value.asInstanceOf[js.Any])
  }
}

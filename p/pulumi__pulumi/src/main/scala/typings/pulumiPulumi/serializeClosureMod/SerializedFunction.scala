package typings.pulumiPulumi.serializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializedFunction extends js.Object {
  
  /**
    * The name of the exported module member.
    */
  var exportName: String = js.native
  
  /**
    * The text of a JavaScript module which exports a single name bound to an appropriate value.
    * In the case of a normal function, this value will just be serialized function.  In the case
    * of a factory function this value will be the result of invoking the factory function.
    */
  var text: String = js.native
}
object SerializedFunction {
  
  @scala.inline
  def apply(exportName: String, text: String): SerializedFunction = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedFunction]
  }
  
  @scala.inline
  implicit class SerializedFunctionOps[Self <: SerializedFunction] (val x: Self) extends AnyVal {
    
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
    def setExportName(value: String): Self = this.set("exportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}

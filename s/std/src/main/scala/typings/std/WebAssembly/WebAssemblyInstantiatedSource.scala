package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAssemblyInstantiatedSource extends js.Object {
  
  var instance: Instance = js.native
  
  var module: Module = js.native
}
object WebAssemblyInstantiatedSource {
  
  @scala.inline
  def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAssemblyInstantiatedSource]
  }
  
  @scala.inline
  implicit class WebAssemblyInstantiatedSourceOps[Self <: WebAssemblyInstantiatedSource] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: Instance): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: Module): Self = this.set("module", value.asInstanceOf[js.Any])
  }
}

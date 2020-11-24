package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSResourceReference[TModule] extends js.Object {
  
  def getModuleId(): String = js.native
  
  def getModuleIfRequired(): TModule | Null = js.native
  
  def load(): js.Promise[TModule] = js.native
}
object JSResourceReference {
  
  @scala.inline
  def apply[TModule](
    getModuleId: () => String,
    getModuleIfRequired: () => TModule | Null,
    load: () => js.Promise[TModule]
  ): JSResourceReference[TModule] = {
    val __obj = js.Dynamic.literal(getModuleId = js.Any.fromFunction0(getModuleId), getModuleIfRequired = js.Any.fromFunction0(getModuleIfRequired), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[JSResourceReference[TModule]]
  }
  
  @scala.inline
  implicit class JSResourceReferenceOps[Self <: JSResourceReference[_], TModule] (val x: Self with JSResourceReference[TModule]) extends AnyVal {
    
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
    def setGetModuleId(value: () => String): Self = this.set("getModuleId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModuleIfRequired(value: () => TModule | Null): Self = this.set("getModuleIfRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: () => js.Promise[TModule]): Self = this.set("load", js.Any.fromFunction0(value))
  }
}

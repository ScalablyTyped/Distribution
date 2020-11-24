package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistorState extends js.Object {
  
  var bootstrapped: Boolean = js.native
  
  var registry: js.Array[String] = js.native
}
object PersistorState {
  
  @scala.inline
  def apply(bootstrapped: Boolean, registry: js.Array[String]): PersistorState = {
    val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorState]
  }
  
  @scala.inline
  implicit class PersistorStateOps[Self <: PersistorState] (val x: Self) extends AnyVal {
    
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
    def setBootstrapped(value: Boolean): Self = this.set("bootstrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryVarargs(value: String*): Self = this.set("registry", js.Array(value :_*))
    
    @scala.inline
    def setRegistry(value: js.Array[String]): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
}

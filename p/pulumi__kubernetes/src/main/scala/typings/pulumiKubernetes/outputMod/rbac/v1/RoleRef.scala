package typings.pulumiKubernetes.outputMod.rbac.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RoleRef contains information that points to the role being used
  */
@js.native
trait RoleRef extends js.Object {
  
  /**
    * APIGroup is the group for the resource being referenced
    */
  var apiGroup: String = js.native
  
  /**
    * Kind is the type of resource being referenced
    */
  var kind: String = js.native
  
  /**
    * Name is the name of resource being referenced
    */
  var name: String = js.native
}
object RoleRef {
  
  @scala.inline
  def apply(apiGroup: String, kind: String, name: String): RoleRef = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleRef]
  }
  
  @scala.inline
  implicit class RoleRefOps[Self <: RoleRef] (val x: Self) extends AnyVal {
    
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
    def setApiGroup(value: String): Self = this.set("apiGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}

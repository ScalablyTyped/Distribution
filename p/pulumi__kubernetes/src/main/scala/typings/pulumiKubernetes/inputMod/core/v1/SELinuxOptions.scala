package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxOptions are the labels to be applied to the container
  */
@js.native
trait SELinuxOptions extends js.Object {
  
  /**
    * Level is SELinux level label that applies to the container.
    */
  var level: js.UndefOr[Input[String]] = js.native
  
  /**
    * Role is a SELinux role label that applies to the container.
    */
  var role: js.UndefOr[Input[String]] = js.native
  
  /**
    * Type is a SELinux type label that applies to the container.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
  
  /**
    * User is a SELinux user label that applies to the container.
    */
  var user: js.UndefOr[Input[String]] = js.native
}
object SELinuxOptions {
  
  @scala.inline
  def apply(): SELinuxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SELinuxOptions]
  }
  
  @scala.inline
  implicit class SELinuxOptionsOps[Self <: SELinuxOptions] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: Input[String]): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setRole(value: Input[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}

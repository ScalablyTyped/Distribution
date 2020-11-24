package typings.pulumiAws.organizationalUnitMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationalUnitArgs extends js.Object {
  
  /**
    * The name for the organizational unit
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: Input[String] = js.native
}
object OrganizationalUnitArgs {
  
  @scala.inline
  def apply(parentId: Input[String]): OrganizationalUnitArgs = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationalUnitArgs]
  }
  
  @scala.inline
  implicit class OrganizationalUnitArgsOps[Self <: OrganizationalUnitArgs] (val x: Self) extends AnyVal {
    
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
    def setParentId(value: Input[String]): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

package typings.pulumiAws.getOrganizationalUnitsMod

import typings.pulumiAws.outputMod.organizations.GetOrganizationalUnitsChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationalUnitsResult extends js.Object {
  
  /**
    * List of child organizational units, which have the following attributes:
    */
  val childrens: js.Array[GetOrganizationalUnitsChildren] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val parentId: String = js.native
}
object GetOrganizationalUnitsResult {
  
  @scala.inline
  def apply(childrens: js.Array[GetOrganizationalUnitsChildren], id: String, parentId: String): GetOrganizationalUnitsResult = {
    val __obj = js.Dynamic.literal(childrens = childrens.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationalUnitsResult]
  }
  
  @scala.inline
  implicit class GetOrganizationalUnitsResultOps[Self <: GetOrganizationalUnitsResult] (val x: Self) extends AnyVal {
    
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
    def setChildrensVarargs(value: GetOrganizationalUnitsChildren*): Self = this.set("childrens", js.Array(value :_*))
    
    @scala.inline
    def setChildrens(value: js.Array[GetOrganizationalUnitsChildren]): Self = this.set("childrens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
}

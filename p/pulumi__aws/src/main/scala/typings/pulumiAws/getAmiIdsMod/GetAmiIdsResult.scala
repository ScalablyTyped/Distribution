package typings.pulumiAws.getAmiIdsMod

import typings.pulumiAws.outputMod.GetAmiIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAmiIdsResult extends js.Object {
  
  val executableUsers: js.UndefOr[js.Array[String]] = js.native
  
  val filters: js.UndefOr[js.Array[GetAmiIdsFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val ids: js.Array[String] = js.native
  
  val nameRegex: js.UndefOr[String] = js.native
  
  val owners: js.Array[String] = js.native
  
  val sortAscending: js.UndefOr[Boolean] = js.native
}
object GetAmiIdsResult {
  
  @scala.inline
  def apply(id: String, ids: js.Array[String], owners: js.Array[String]): GetAmiIdsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiIdsResult]
  }
  
  @scala.inline
  implicit class GetAmiIdsResultOps[Self <: GetAmiIdsResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableUsersVarargs(value: String*): Self = this.set("executableUsers", js.Array(value :_*))
    
    @scala.inline
    def setExecutableUsers(value: js.Array[String]): Self = this.set("executableUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableUsers: Self = this.set("executableUsers", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: GetAmiIdsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetAmiIdsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setNameRegex(value: String): Self = this.set("nameRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameRegex: Self = this.set("nameRegex", js.undefined)
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
  }
}

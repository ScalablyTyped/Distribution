package typings.pulumiAws.getPrefixListMod

import typings.pulumiAws.outputMod.GetPrefixListFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPrefixListResult extends js.Object {
  
  /**
    * The list of CIDR blocks for the AWS service associated with the prefix list.
    */
  val cidrBlocks: js.Array[String] = js.native
  
  val filters: js.UndefOr[js.Array[GetPrefixListFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The name of the selected prefix list.
    */
  val name: String = js.native
  
  val prefixListId: js.UndefOr[String] = js.native
}
object GetPrefixListResult {
  
  @scala.inline
  def apply(cidrBlocks: js.Array[String], id: String, name: String): GetPrefixListResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrefixListResult]
  }
  
  @scala.inline
  implicit class GetPrefixListResultOps[Self <: GetPrefixListResult] (val x: Self) extends AnyVal {
    
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
    def setCidrBlocksVarargs(value: String*): Self = this.set("cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlocks(value: js.Array[String]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetPrefixListFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetPrefixListFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: String): Self = this.set("prefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListId: Self = this.set("prefixListId", js.undefined)
  }
}

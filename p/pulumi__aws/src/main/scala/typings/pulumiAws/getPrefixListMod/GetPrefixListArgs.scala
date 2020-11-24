package typings.pulumiAws.getPrefixListMod

import typings.pulumiAws.inputMod.GetPrefixListFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPrefixListArgs extends js.Object {
  
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetPrefixListFilter]] = js.native
  
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the prefix list to select.
    */
  val prefixListId: js.UndefOr[String] = js.native
}
object GetPrefixListArgs {
  
  @scala.inline
  def apply(): GetPrefixListArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPrefixListArgs]
  }
  
  @scala.inline
  implicit class GetPrefixListArgsOps[Self <: GetPrefixListArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetPrefixListFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetPrefixListFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: String): Self = this.set("prefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListId: Self = this.set("prefixListId", js.undefined)
  }
}

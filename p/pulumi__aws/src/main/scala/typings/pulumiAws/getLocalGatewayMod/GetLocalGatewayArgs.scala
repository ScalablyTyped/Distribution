package typings.pulumiAws.getLocalGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayArgs extends js.Object {
  
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetLocalGatewayFilter]] = js.native
  
  /**
    * The id of the specific Local Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The current state of the desired Local Gateway.
    * Can be either `"pending"` or `"available"`.
    */
  val state: js.UndefOr[String] = js.native
  
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Local Gateway.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetLocalGatewayArgs {
  
  @scala.inline
  def apply(): GetLocalGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocalGatewayArgs]
  }
  
  @scala.inline
  implicit class GetLocalGatewayArgsOps[Self <: GetLocalGatewayArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetLocalGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

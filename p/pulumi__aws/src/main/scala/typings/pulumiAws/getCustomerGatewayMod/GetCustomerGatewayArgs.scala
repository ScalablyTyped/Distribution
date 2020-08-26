package typings.pulumiAws.getCustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCustomerGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayArgs extends js.Object {
  /**
    * One or more [name-value pairs][dcg-filters] to filter by.
    */
  val filters: js.UndefOr[js.Array[GetCustomerGatewayFilter]] = js.native
  /**
    * The ID of the gateway.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Map of key-value pairs assigned to the gateway.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetCustomerGatewayArgs {
  @scala.inline
  def apply(): GetCustomerGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerGatewayArgs]
  }
  @scala.inline
  implicit class GetCustomerGatewayArgsOps[Self <: GetCustomerGatewayArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetCustomerGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetCustomerGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


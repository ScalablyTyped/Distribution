package typings.pulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.GetElasticIpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetElasticIpArgs extends js.Object {
  
  /**
    * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
    */
  val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.native
  
  /**
    * The allocation id of the specific VPC EIP to retrieve. If a classic EIP is required, do NOT set `id`, only set `publicIp`
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The public IP of the specific EIP to retrieve.
    */
  val publicIp: js.UndefOr[String] = js.native
  
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired Elastic IP
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetElasticIpArgs {
  
  @scala.inline
  def apply(): GetElasticIpArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetElasticIpArgs]
  }
  
  @scala.inline
  implicit class GetElasticIpArgsOps[Self <: GetElasticIpArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetElasticIpFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetElasticIpFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

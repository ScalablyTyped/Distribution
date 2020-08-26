package typings.pulumiAws.getInstancesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetInstancesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[String] = js.native
  val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
  val instanceTags: StringDictionary[String] = js.native
  /**
    * Private IP addresses of instances found through the filter
    */
  val privateIps: js.Array[String] = js.native
  /**
    * Public IP addresses of instances found through the filter
    */
  val publicIps: js.Array[String] = js.native
}

object GetInstancesResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    instanceTags: StringDictionary[String],
    privateIps: js.Array[String],
    publicIps: js.Array[String]
  ): GetInstancesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], publicIps = publicIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesResult]
  }
  @scala.inline
  implicit class GetInstancesResultOps[Self <: GetInstancesResult] (val x: Self) extends AnyVal {
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
    def setInstanceTags(value: StringDictionary[String]): Self = this.set("instanceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIpsVarargs(value: String*): Self = this.set("privateIps", js.Array(value :_*))
    @scala.inline
    def setPrivateIps(value: js.Array[String]): Self = this.set("privateIps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicIpsVarargs(value: String*): Self = this.set("publicIps", js.Array(value :_*))
    @scala.inline
    def setPublicIps(value: js.Array[String]): Self = this.set("publicIps", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetInstancesFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInstancesFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setInstanceStateNamesVarargs(value: String*): Self = this.set("instanceStateNames", js.Array(value :_*))
    @scala.inline
    def setInstanceStateNames(value: js.Array[String]): Self = this.set("instanceStateNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceStateNames: Self = this.set("instanceStateNames", js.undefined)
  }
  
}


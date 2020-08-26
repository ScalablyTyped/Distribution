package typings.pulumiAws.getEbsVolumesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEbsVolumesResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetEbsVolumesFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A set of all the EBS Volume IDs found. This data source will fail if
    * no volumes match the provided criteria.
    */
  val ids: js.Array[String] = js.native
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetEbsVolumesResult {
  @scala.inline
  def apply(id: String, ids: js.Array[String]): GetEbsVolumesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEbsVolumesResult]
  }
  @scala.inline
  implicit class GetEbsVolumesResultOps[Self <: GetEbsVolumesResult] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetEbsVolumesFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetEbsVolumesFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


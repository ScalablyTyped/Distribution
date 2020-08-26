package typings.pulumiAws.getEbsVolumesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetEbsVolumesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEbsVolumesArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetEbsVolumesFilter]] = js.native
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired volumes.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetEbsVolumesArgs {
  @scala.inline
  def apply(): GetEbsVolumesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEbsVolumesArgs]
  }
  @scala.inline
  implicit class GetEbsVolumesArgsOps[Self <: GetEbsVolumesArgs] (val x: Self) extends AnyVal {
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


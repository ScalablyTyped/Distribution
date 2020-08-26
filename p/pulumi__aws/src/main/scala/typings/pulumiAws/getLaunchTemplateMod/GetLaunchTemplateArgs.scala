package typings.pulumiAws.getLaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLaunchTemplateFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateArgs extends js.Object {
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetLaunchTemplateFilter]] = js.native
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
    */
  val name: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetLaunchTemplateArgs {
  @scala.inline
  def apply(): GetLaunchTemplateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchTemplateArgs]
  }
  @scala.inline
  implicit class GetLaunchTemplateArgsOps[Self <: GetLaunchTemplateArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetLaunchTemplateFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetLaunchTemplateFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


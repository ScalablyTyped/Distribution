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
    * A mapping of tags, each pair of which must exactly match a pair on the desired Launch Template.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetLaunchTemplateArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetLaunchTemplateFilter] = null,
    name: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetLaunchTemplateArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateArgs]
  }
}


package typings.atPulumiAws.ec2GetLaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateArgs extends js.Object {
  /**
    * The name of the launch template.
    */
  val name: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetLaunchTemplateArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetLaunchTemplateArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateArgs]
  }
}


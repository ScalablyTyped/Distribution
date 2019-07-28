package typings.atPulumiAws.ec2GetLaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateArgs extends js.Object {
  /**
    * The name of the launch template.
    */
  val name: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetLaunchTemplateArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetLaunchTemplateArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetLaunchTemplateArgs]
  }
}


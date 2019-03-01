package typings
package atPulumiAwsLib.ec2GetLaunchTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateArgs extends js.Object {
  /**
    * The name of the launch template.
    */
  val name: java.lang.String
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetLaunchTemplateArgs {
  @scala.inline
  def apply(name: java.lang.String, tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null): GetLaunchTemplateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetLaunchTemplateArgs]
  }
}


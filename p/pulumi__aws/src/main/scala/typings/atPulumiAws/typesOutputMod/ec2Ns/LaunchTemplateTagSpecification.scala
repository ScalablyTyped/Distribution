package typings.atPulumiAws.typesOutputMod.ec2Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateTagSpecification extends js.Object {
  var resourceType: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags to assign to the launch template.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object LaunchTemplateTagSpecification {
  @scala.inline
  def apply(resourceType: String = null, tags: StringDictionary[js.Any] = null): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
}


package typings.atPulumiAws.typesInputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateTagSpecification extends js.Object {
  var resourceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the launch template.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object LaunchTemplateTagSpecification {
  @scala.inline
  def apply(resourceType: Input[String] = null, tags: Input[StringDictionary[_]] = null): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
}


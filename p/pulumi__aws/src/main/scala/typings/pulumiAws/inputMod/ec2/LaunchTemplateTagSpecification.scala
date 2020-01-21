package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateTagSpecification extends js.Object {
  var resourceType: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the launch template.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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


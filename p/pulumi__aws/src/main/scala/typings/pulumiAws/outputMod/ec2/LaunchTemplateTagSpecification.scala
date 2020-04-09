package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateTagSpecification extends js.Object {
  /**
    * The type of resource to tag. Valid values are `instance` and `volume`.
    */
  var resourceType: js.UndefOr[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object LaunchTemplateTagSpecification {
  @scala.inline
  def apply(resourceType: String = null, tags: StringDictionary[js.Any] = null): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
}


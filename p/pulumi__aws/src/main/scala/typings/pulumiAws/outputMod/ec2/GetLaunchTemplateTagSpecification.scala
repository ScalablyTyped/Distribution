package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateTagSpecification extends js.Object {
  var resourceType: String = js.native
  /**
    * (Optional) A mapping of tags to assign to the launch template.
    */
  var tags: StringDictionary[js.Any] = js.native
}

object GetLaunchTemplateTagSpecification {
  @scala.inline
  def apply(resourceType: String, tags: StringDictionary[js.Any]): GetLaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateTagSpecification]
  }
}


package typings.atPulumiAws.typesOutputMod.ec2Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateTagSpecification extends js.Object {
  var resourceType: String
  /**
    * (Optional) A mapping of tags to assign to the launch template.
    */
  var tags: StringDictionary[js.Any]
}

object GetLaunchTemplateTagSpecification {
  @scala.inline
  def apply(resourceType: String, tags: StringDictionary[js.Any]): GetLaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal(resourceType = resourceType, tags = tags)
  
    __obj.asInstanceOf[GetLaunchTemplateTagSpecification]
  }
}


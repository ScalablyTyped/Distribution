package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateTagSpecification extends js.Object {
  var resourceType: String = js.native
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
    */
  var tags: StringDictionary[String] = js.native
}

object GetLaunchTemplateTagSpecification {
  @scala.inline
  def apply(resourceType: String, tags: StringDictionary[String]): GetLaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateTagSpecification]
  }
  @scala.inline
  implicit class GetLaunchTemplateTagSpecificationOps[Self <: GetLaunchTemplateTagSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}


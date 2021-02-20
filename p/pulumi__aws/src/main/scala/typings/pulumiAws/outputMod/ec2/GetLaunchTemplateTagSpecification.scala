package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateTagSpecification extends StObject {
  
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
  implicit class GetLaunchTemplateTagSpecificationMutableBuilder[Self <: GetLaunchTemplateTagSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}

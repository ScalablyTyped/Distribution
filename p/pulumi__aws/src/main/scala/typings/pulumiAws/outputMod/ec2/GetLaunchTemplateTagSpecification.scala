package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateTagSpecification extends StObject {
  
  var resourceType: String
  
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
    */
  var tags: StringDictionary[String]
}
object GetLaunchTemplateTagSpecification {
  
  inline def apply(resourceType: String, tags: StringDictionary[String]): GetLaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateTagSpecification]
  }
  
  extension [Self <: GetLaunchTemplateTagSpecification](x: Self) {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}

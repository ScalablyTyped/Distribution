package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateTagSpecification extends StObject {
  
  /**
    * The type of resource to tag. Valid values are `instance`, `volume`, `elastic-gpu` and `spot-instances-request`.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object LaunchTemplateTagSpecification {
  
  inline def apply(): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
  
  extension [Self <: LaunchTemplateTagSpecification](x: Self) {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

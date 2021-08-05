package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateTagSpecification extends StObject {
  
  /**
    * The type of resource to tag. Valid values are `instance`, `volume`, `elastic-gpu` and `spot-instances-request`.
    */
  var resourceType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}
object LaunchTemplateTagSpecification {
  
  inline def apply(): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
  
  extension [Self <: LaunchTemplateTagSpecification](x: Self) {
    
    inline def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

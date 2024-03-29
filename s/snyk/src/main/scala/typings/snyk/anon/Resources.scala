package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TerraformPlanReferencedResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var resources: js.Array[TerraformPlanReferencedResource]
}
object Resources {
  
  inline def apply(resources: js.Array[TerraformPlanReferencedResource]): Resources = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    inline def setResources(value: js.Array[TerraformPlanReferencedResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: TerraformPlanReferencedResource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}

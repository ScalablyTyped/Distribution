package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectAttributes extends StObject {
  
  var criticality: js.UndefOr[js.Array[PROJECT_CRITICALITY]] = js.undefined
  
  var environment: js.UndefOr[js.Array[PROJECT_ENVIRONMENT]] = js.undefined
  
  var lifecycle: js.UndefOr[js.Array[PROJECT_LIFECYCLE]] = js.undefined
}
object ProjectAttributes {
  
  inline def apply(): ProjectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectAttributes] (val x: Self) extends AnyVal {
    
    inline def setCriticality(value: js.Array[PROJECT_CRITICALITY]): Self = StObject.set(x, "criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "criticality", js.undefined)
    
    inline def setCriticalityVarargs(value: PROJECT_CRITICALITY*): Self = StObject.set(x, "criticality", js.Array(value*))
    
    inline def setEnvironment(value: js.Array[PROJECT_ENVIRONMENT]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: PROJECT_ENVIRONMENT*): Self = StObject.set(x, "environment", js.Array(value*))
    
    inline def setLifecycle(value: js.Array[PROJECT_LIFECYCLE]): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setLifecycleVarargs(value: PROJECT_LIFECYCLE*): Self = StObject.set(x, "lifecycle", js.Array(value*))
  }
}

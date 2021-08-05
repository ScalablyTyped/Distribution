package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptune {
  
  trait ClusterParameterGroupParameter extends StObject {
    
    /**
      * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the neptune parameter.
      */
    var name: String
    
    /**
      * The value of the neptune parameter.
      */
    var value: String
  }
  object ClusterParameterGroupParameter {
    
    inline def apply(name: String, value: String): ClusterParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupParameter]
    }
    
    extension [Self <: ClusterParameterGroupParameter](x: Self) {
      
      inline def setApplyMethod(value: String): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      inline def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the Neptune parameter.
      */
    var name: String
    
    /**
      * The value of the Neptune parameter.
      */
    var value: String
  }
  object ParameterGroupParameter {
    
    inline def apply(name: String, value: String): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    extension [Self <: ParameterGroupParameter](x: Self) {
      
      inline def setApplyMethod(value: String): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      inline def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

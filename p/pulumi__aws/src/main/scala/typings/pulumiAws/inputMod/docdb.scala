package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docdb {
  
  trait ClusterParameterGroupParameter extends StObject {
    
    /**
      * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the documentDB parameter.
      */
    var name: Input[String]
    
    /**
      * The value of the documentDB parameter.
      */
    var value: Input[String]
  }
  object ClusterParameterGroupParameter {
    
    inline def apply(name: Input[String], value: Input[String]): ClusterParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupParameter]
    }
    
    extension [Self <: ClusterParameterGroupParameter](x: Self) {
      
      inline def setApplyMethod(value: Input[String]): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      inline def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

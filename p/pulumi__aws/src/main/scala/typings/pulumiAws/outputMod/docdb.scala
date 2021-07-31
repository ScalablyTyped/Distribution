package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docdb {
  
  trait ClusterParameterGroupParameter extends StObject {
    
    /**
      * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the documentDB parameter.
      */
    var name: String
    
    /**
      * The value of the documentDB parameter.
      */
    var value: String
  }
  object ClusterParameterGroupParameter {
    
    @scala.inline
    def apply(name: String, value: String): ClusterParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupParameterMutableBuilder[Self <: ClusterParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyMethod(value: String): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

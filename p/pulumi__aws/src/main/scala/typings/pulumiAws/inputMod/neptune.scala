package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptune {
  
  @js.native
  trait ClusterParameterGroupParameter extends StObject {
    
    /**
      * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the neptune parameter.
      */
    var name: Input[String] = js.native
    
    /**
      * The value of the neptune parameter.
      */
    var value: Input[String] = js.native
  }
  object ClusterParameterGroupParameter {
    
    @scala.inline
    def apply(name: Input[String], value: Input[String]): ClusterParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupParameterMutableBuilder[Self <: ClusterParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyMethod(value: Input[String]): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParameterGroupParameter extends StObject {
    
    /**
      * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Neptune parameter.
      */
    var name: Input[String] = js.native
    
    /**
      * The value of the Neptune parameter.
      */
    var value: Input[String] = js.native
  }
  object ParameterGroupParameter {
    
    @scala.inline
    def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ParameterGroupParameterMutableBuilder[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyMethod(value: Input[String]): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

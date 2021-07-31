package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
  */
trait ScopedResourceSelectorRequirement extends StObject {
  
  /**
    * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
    */
  var operator: Input[String]
  
  /**
    * The name of the scope that the selector applies to.
    */
  var scopeName: Input[String]
  
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object ScopedResourceSelectorRequirement {
  
  @scala.inline
  def apply(operator: Input[String], scopeName: Input[String]): ScopedResourceSelectorRequirement = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedResourceSelectorRequirement]
  }
  
  @scala.inline
  implicit class ScopedResourceSelectorRequirementMutableBuilder[Self <: ScopedResourceSelectorRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: Input[String]): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

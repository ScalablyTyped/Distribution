package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
  */
@js.native
trait TopologySelectorLabelRequirement extends StObject {
  
  /**
    * The label key that the selector applies to.
    */
  var key: Input[String] = js.native
  
  /**
    * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}
object TopologySelectorLabelRequirement {
  
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): TopologySelectorLabelRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorLabelRequirement]
  }
  
  @scala.inline
  implicit class TopologySelectorLabelRequirementMutableBuilder[Self <: TopologySelectorLabelRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
  */
trait TopologySelectorLabelRequirement extends StObject {
  
  /**
    * The label key that the selector applies to.
    */
  var key: String
  
  /**
    * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
    */
  var values: js.Array[String]
}
object TopologySelectorLabelRequirement {
  
  inline def apply(key: String, values: js.Array[String]): TopologySelectorLabelRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorLabelRequirement]
  }
  
  extension [Self <: TopologySelectorLabelRequirement](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

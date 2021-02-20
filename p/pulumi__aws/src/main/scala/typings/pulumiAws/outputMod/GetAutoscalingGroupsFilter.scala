package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAutoscalingGroupsFilter extends StObject {
  
  /**
    * The name of the filter. The valid values are: `auto-scaling-group`, `key`, `value`, and `propagate-at-launch`.
    */
  var name: String = js.native
  
  /**
    * The value of the filter.
    */
  var values: js.Array[String] = js.native
}
object GetAutoscalingGroupsFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAutoscalingGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoscalingGroupsFilter]
  }
  
  @scala.inline
  implicit class GetAutoscalingGroupsFilterMutableBuilder[Self <: GetAutoscalingGroupsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSpotPriceFilter extends StObject {
  
  /**
    * Name of the filter.
    */
  var name: String = js.native
  
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String] = js.native
}
object GetSpotPriceFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSpotPriceFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpotPriceFilter]
  }
  
  @scala.inline
  implicit class GetSpotPriceFilterMutableBuilder[Self <: GetSpotPriceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

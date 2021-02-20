package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAmiFilter extends StObject {
  
  /**
    * The name of the AMI that was provided during image creation.
    */
  var name: String = js.native
  
  var values: js.Array[String] = js.native
}
object GetAmiFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAmiFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiFilter]
  }
  
  @scala.inline
  implicit class GetAmiFilterMutableBuilder[Self <: GetAmiFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

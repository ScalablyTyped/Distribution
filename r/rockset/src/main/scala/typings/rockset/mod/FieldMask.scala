package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldMask extends StObject {
  
  var input_path: js.Array[String] = js.native
  
  var mask: js.UndefOr[FieldMaskMask] = js.native
}
object FieldMask {
  
  @scala.inline
  def apply(input_path: js.Array[String]): FieldMask = {
    val __obj = js.Dynamic.literal(input_path = input_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMask]
  }
  
  @scala.inline
  implicit class FieldMaskMutableBuilder[Self <: FieldMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput_path(value: js.Array[String]): Self = StObject.set(x, "input_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_pathVarargs(value: String*): Self = StObject.set(x, "input_path", js.Array(value :_*))
    
    @scala.inline
    def setMask(value: FieldMaskMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}

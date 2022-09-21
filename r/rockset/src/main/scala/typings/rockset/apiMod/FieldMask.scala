package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldMask extends StObject {
  
  /**
    *
    * @type {Array<string>}
    * @memberof FieldMask
    */
  var input_path: js.Array[String]
  
  /**
    *
    * @type {FieldMaskMask}
    * @memberof FieldMask
    */
  var mask: js.UndefOr[FieldMaskMask] = js.undefined
}
object FieldMask {
  
  inline def apply(input_path: js.Array[String]): FieldMask = {
    val __obj = js.Dynamic.literal(input_path = input_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMask]
  }
  
  extension [Self <: FieldMask](x: Self) {
    
    inline def setInput_path(value: js.Array[String]): Self = StObject.set(x, "input_path", value.asInstanceOf[js.Any])
    
    inline def setInput_pathVarargs(value: String*): Self = StObject.set(x, "input_path", js.Array(value*))
    
    inline def setMask(value: FieldMaskMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}

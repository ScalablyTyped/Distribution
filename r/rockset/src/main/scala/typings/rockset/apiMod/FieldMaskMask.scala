package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldMaskMask extends StObject {
  
  /**
    *
    * @type {any}
    * @memberof FieldMaskMask
    */
  var args: js.UndefOr[Any] = js.undefined
  
  /**
    *
    * @type {string}
    * @memberof FieldMaskMask
    */
  var name: String
}
object FieldMaskMask {
  
  inline def apply(name: String): FieldMaskMask = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMaskMask]
  }
  
  extension [Self <: FieldMaskMask](x: Self) {
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

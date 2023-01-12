package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWrapper extends StObject {
  
  /** From object converter */
  var fromObject: js.UndefOr[WrapperFromObjectConverter] = js.undefined
  
  /** To object converter */
  var toObject: js.UndefOr[WrapperToObjectConverter] = js.undefined
}
object IWrapper {
  
  inline def apply(): IWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWrapper] (val x: Self) extends AnyVal {
    
    inline def setFromObject(value: WrapperFromObjectConverter): Self = StObject.set(x, "fromObject", value.asInstanceOf[js.Any])
    
    inline def setFromObjectUndefined: Self = StObject.set(x, "fromObject", js.undefined)
    
    inline def setToObject(value: WrapperToObjectConverter): Self = StObject.set(x, "toObject", value.asInstanceOf[js.Any])
    
    inline def setToObjectUndefined: Self = StObject.set(x, "toObject", js.undefined)
  }
}

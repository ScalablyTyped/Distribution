package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWrapper extends StObject {
  
  /** From object converter */
  var fromObject: js.UndefOr[WrapperFromObjectConverter] = js.native
  
  /** To object converter */
  var toObject: js.UndefOr[WrapperToObjectConverter] = js.native
}
object IWrapper {
  
  @scala.inline
  def apply(): IWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapper]
  }
  
  @scala.inline
  implicit class IWrapperMutableBuilder[Self <: IWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromObject(value: WrapperFromObjectConverter): Self = StObject.set(x, "fromObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromObjectUndefined: Self = StObject.set(x, "fromObject", js.undefined)
    
    @scala.inline
    def setToObject(value: WrapperToObjectConverter): Self = StObject.set(x, "toObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToObjectUndefined: Self = StObject.set(x, "toObject", js.undefined)
  }
}

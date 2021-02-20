package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.stellarSdkStrings.asc
import typings.stellarSdk.stellarSdkStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionTemplateOptions extends StObject {
  
  var cursor: js.UndefOr[String | Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var order: js.UndefOr[asc | desc] = js.native
}
object CallFunctionTemplateOptions {
  
  @scala.inline
  def apply(): CallFunctionTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallFunctionTemplateOptions]
  }
  
  @scala.inline
  implicit class CallFunctionTemplateOptionsMutableBuilder[Self <: CallFunctionTemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String | Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}

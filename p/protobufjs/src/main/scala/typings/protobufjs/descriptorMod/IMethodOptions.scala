package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMethodOptions extends StObject {
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
}
object IMethodOptions {
  
  @scala.inline
  def apply(): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodOptions]
  }
  
  @scala.inline
  implicit class IMethodOptionsMutableBuilder[Self <: IMethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
  }
}

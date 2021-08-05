package typings.storybookClientApi.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBBaseType extends StObject {
  
  var raw: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object SBBaseType {
  
  inline def apply(): SBBaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SBBaseType]
  }
  
  extension [Self <: SBBaseType](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}

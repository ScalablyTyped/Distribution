package typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModulesCsstypeIndexMod`.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property[TLength, TTime] extends StObject {
  
  var inherits: js.UndefOr[Inherits] = js.undefined
  
  var initialValue: js.UndefOr[String] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
}
object Property {
  
  inline def apply[TLength, TTime](): Property[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property[TLength, TTime]]
  }
  
  extension [Self <: Property[?, ?], TLength, TTime](x: Self & (Property[TLength, TTime])) {
    
    inline def setInherits(value: Inherits): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}

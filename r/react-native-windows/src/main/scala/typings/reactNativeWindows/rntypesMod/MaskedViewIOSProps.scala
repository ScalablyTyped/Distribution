package typings.reactNativeWindows.rntypesMod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedViewIOSProps
  extends StObject
     with ViewProps {
  
  var maskElement: ReactElement
}
object MaskedViewIOSProps {
  
  inline def apply(maskElement: ReactElement): MaskedViewIOSProps = {
    val __obj = js.Dynamic.literal(maskElement = maskElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedViewIOSProps]
  }
  
  extension [Self <: MaskedViewIOSProps](x: Self) {
    
    inline def setMaskElement(value: ReactElement): Self = StObject.set(x, "maskElement", value.asInstanceOf[js.Any])
  }
}

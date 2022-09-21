package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseDark extends StObject {
  
  var useDark: Boolean
}
object UseDark {
  
  inline def apply(useDark: Boolean): UseDark = {
    val __obj = js.Dynamic.literal(useDark = useDark.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDark]
  }
  
  extension [Self <: UseDark](x: Self) {
    
    inline def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
  }
}

package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modifier extends StObject {
  
  var modifier: js.UndefOr[String] = js.undefined
}
object Modifier {
  
  inline def apply(): Modifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifier]
  }
  
  extension [Self <: Modifier](x: Self) {
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}

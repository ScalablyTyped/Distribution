package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementsOptions extends StObject {
  
  var code: js.UndefOr[js.Function1[/* props */ CodeElementProps, String]] = js.undefined
  
  var line: js.UndefOr[js.Function1[/* props */ LineElementProps, String]] = js.undefined
  
  var pre: js.UndefOr[js.Function1[/* props */ PreElementProps, String]] = js.undefined
  
  var token: js.UndefOr[js.Function1[/* props */ TokenElementProps, String]] = js.undefined
}
object ElementsOptions {
  
  inline def apply(): ElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementsOptions]
  }
  
  extension [Self <: ElementsOptions](x: Self) {
    
    inline def setCode(value: /* props */ CodeElementProps => String): Self = StObject.set(x, "code", js.Any.fromFunction1(value))
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setLine(value: /* props */ LineElementProps => String): Self = StObject.set(x, "line", js.Any.fromFunction1(value))
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPre(value: /* props */ PreElementProps => String): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setToken(value: /* props */ TokenElementProps => String): Self = StObject.set(x, "token", js.Any.fromFunction1(value))
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}

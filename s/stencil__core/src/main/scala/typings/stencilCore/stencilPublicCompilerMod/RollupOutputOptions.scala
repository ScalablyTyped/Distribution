package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupOutputOptions extends StObject {
  
  var globals: js.UndefOr[StringDictionary[String] | (js.Function1[/* name */ String, String])] = js.undefined
}
object RollupOutputOptions {
  
  inline def apply(): RollupOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupOutputOptions]
  }
  
  extension [Self <: RollupOutputOptions](x: Self) {
    
    inline def setGlobals(value: StringDictionary[String] | (js.Function1[/* name */ String, String])): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsFunction1(value: /* name */ String => String): Self = StObject.set(x, "globals", js.Any.fromFunction1(value))
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
  }
}

package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundlingConfig extends StObject {
  
  var namedExports: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}
object BundlingConfig {
  
  inline def apply(): BundlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundlingConfig]
  }
  
  extension [Self <: BundlingConfig](x: Self) {
    
    inline def setNamedExports(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
    
    inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
  }
}

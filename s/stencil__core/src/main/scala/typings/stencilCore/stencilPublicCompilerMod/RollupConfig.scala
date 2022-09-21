package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupConfig extends StObject {
  
  var inputOptions: js.UndefOr[RollupInputOptions] = js.undefined
  
  var outputOptions: js.UndefOr[RollupOutputOptions] = js.undefined
}
object RollupConfig {
  
  inline def apply(): RollupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupConfig]
  }
  
  extension [Self <: RollupConfig](x: Self) {
    
    inline def setInputOptions(value: RollupInputOptions): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    inline def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    inline def setOutputOptions(value: RollupOutputOptions): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
  }
}

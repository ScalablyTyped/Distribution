package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryApiFallback extends StObject {
  
  var disableDotRule: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
}
object HistoryApiFallback {
  
  inline def apply(): HistoryApiFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryApiFallback]
  }
  
  extension [Self <: HistoryApiFallback](x: Self) {
    
    inline def setDisableDotRule(value: Boolean): Self = StObject.set(x, "disableDotRule", value.asInstanceOf[js.Any])
    
    inline def setDisableDotRuleUndefined: Self = StObject.set(x, "disableDotRule", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}

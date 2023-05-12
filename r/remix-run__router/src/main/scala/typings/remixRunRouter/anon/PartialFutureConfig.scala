package typings.remixRunRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@remix-run/router.@remix-run/router/dist/router.FutureConfig> */
trait PartialFutureConfig extends StObject {
  
  var v7_normalizeFormMethod: js.UndefOr[Boolean] = js.undefined
  
  var v7_prependBasename: js.UndefOr[Boolean] = js.undefined
}
object PartialFutureConfig {
  
  inline def apply(): PartialFutureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFutureConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFutureConfig] (val x: Self) extends AnyVal {
    
    inline def setV7_normalizeFormMethod(value: Boolean): Self = StObject.set(x, "v7_normalizeFormMethod", value.asInstanceOf[js.Any])
    
    inline def setV7_normalizeFormMethodUndefined: Self = StObject.set(x, "v7_normalizeFormMethod", js.undefined)
    
    inline def setV7_prependBasename(value: Boolean): Self = StObject.set(x, "v7_prependBasename", value.asInstanceOf[js.Any])
    
    inline def setV7_prependBasenameUndefined: Self = StObject.set(x, "v7_prependBasename", js.undefined)
  }
}

package typings.remixRunRouter.distRouterMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FutureConfig extends StObject {
  
  var v7_normalizeFormMethod: Boolean
  
  var v7_prependBasename: Boolean
}
object FutureConfig {
  
  inline def apply(v7_normalizeFormMethod: Boolean, v7_prependBasename: Boolean): FutureConfig = {
    val __obj = js.Dynamic.literal(v7_normalizeFormMethod = v7_normalizeFormMethod.asInstanceOf[js.Any], v7_prependBasename = v7_prependBasename.asInstanceOf[js.Any])
    __obj.asInstanceOf[FutureConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FutureConfig] (val x: Self) extends AnyVal {
    
    inline def setV7_normalizeFormMethod(value: Boolean): Self = StObject.set(x, "v7_normalizeFormMethod", value.asInstanceOf[js.Any])
    
    inline def setV7_prependBasename(value: Boolean): Self = StObject.set(x, "v7_prependBasename", value.asInstanceOf[js.Any])
  }
}

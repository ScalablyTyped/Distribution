package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraPoolOptions
  extends StObject
     with PoolOptions {
  
  var maxSockets: js.UndefOr[Double] = js.undefined
}
object ExtraPoolOptions {
  
  inline def apply(): ExtraPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraPoolOptions]
  }
  
  extension [Self <: ExtraPoolOptions](x: Self) {
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
  }
}

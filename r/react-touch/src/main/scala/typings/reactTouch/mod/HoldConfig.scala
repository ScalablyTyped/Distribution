package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoldConfig extends StObject {
  
  /** @default 1000 */
  var holdFor: js.UndefOr[Double] = js.undefined
  
  /** @default 250 */
  var updateEvery: js.UndefOr[Double] = js.undefined
}
object HoldConfig {
  
  inline def apply(): HoldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoldConfig] (val x: Self) extends AnyVal {
    
    inline def setHoldFor(value: Double): Self = StObject.set(x, "holdFor", value.asInstanceOf[js.Any])
    
    inline def setHoldForUndefined: Self = StObject.set(x, "holdFor", js.undefined)
    
    inline def setUpdateEvery(value: Double): Self = StObject.set(x, "updateEvery", value.asInstanceOf[js.Any])
    
    inline def setUpdateEveryUndefined: Self = StObject.set(x, "updateEvery", js.undefined)
  }
}

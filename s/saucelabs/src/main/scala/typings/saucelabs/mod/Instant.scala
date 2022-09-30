package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instant
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var epochSecond: js.UndefOr[Double] = js.undefined
  
  var nano: js.UndefOr[Double] = js.undefined
}
object Instant {
  
  inline def apply(): Instant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instant]
  }
  
  extension [Self <: Instant](x: Self) {
    
    inline def setEpochSecond(value: Double): Self = StObject.set(x, "epochSecond", value.asInstanceOf[js.Any])
    
    inline def setEpochSecondUndefined: Self = StObject.set(x, "epochSecond", js.undefined)
    
    inline def setNano(value: Double): Self = StObject.set(x, "nano", value.asInstanceOf[js.Any])
    
    inline def setNanoUndefined: Self = StObject.set(x, "nano", js.undefined)
  }
}

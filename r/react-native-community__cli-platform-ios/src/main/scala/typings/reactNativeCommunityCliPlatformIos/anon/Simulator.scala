package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Simulator extends StObject {
  
  var simulator: js.UndefOr[String] = js.undefined
  
  var udid: js.UndefOr[String] = js.undefined
}
object Simulator {
  
  inline def apply(): Simulator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Simulator]
  }
  
  extension [Self <: Simulator](x: Self) {
    
    inline def setSimulator(value: String): Self = StObject.set(x, "simulator", value.asInstanceOf[js.Any])
    
    inline def setSimulatorUndefined: Self = StObject.set(x, "simulator", js.undefined)
    
    inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
  }
}

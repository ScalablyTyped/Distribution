package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryConfig extends StObject {
  
  @JSName("telemetry.stencil")
  var telemetryDotstencil: js.UndefOr[Boolean] = js.undefined
  
  @JSName("tokens.telemetry")
  var tokensDottelemetry: js.UndefOr[String] = js.undefined
}
object TelemetryConfig {
  
  inline def apply(): TelemetryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelemetryConfig]
  }
  
  extension [Self <: TelemetryConfig](x: Self) {
    
    inline def setTelemetryDotstencil(value: Boolean): Self = StObject.set(x, "telemetry.stencil", value.asInstanceOf[js.Any])
    
    inline def setTelemetryDotstencilUndefined: Self = StObject.set(x, "telemetry.stencil", js.undefined)
    
    inline def setTokensDottelemetry(value: String): Self = StObject.set(x, "tokens.telemetry", value.asInstanceOf[js.Any])
    
    inline def setTokensDottelemetryUndefined: Self = StObject.set(x, "tokens.telemetry", js.undefined)
  }
}

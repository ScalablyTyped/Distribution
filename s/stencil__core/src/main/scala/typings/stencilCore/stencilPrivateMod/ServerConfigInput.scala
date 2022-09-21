package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfigInput extends StObject {
  
  var app: ExpressApp
  
  var configPath: js.UndefOr[String] = js.undefined
}
object ServerConfigInput {
  
  inline def apply(app: ExpressApp): ServerConfigInput = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfigInput]
  }
  
  extension [Self <: ServerConfigInput](x: Self) {
    
    inline def setApp(value: ExpressApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
  }
}

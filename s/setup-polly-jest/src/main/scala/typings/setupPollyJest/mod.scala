package typings.setupPollyJest

import typings.pollyjsCore.mod.Polly
import typings.pollyjsCore.mod.PollyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("setup-polly-jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupPolly(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPolly")().asInstanceOf[Context]
  inline def setupPolly(config: PollyConfig): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPolly")(config.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  trait Context extends StObject {
    
    val polly: Polly
  }
  object Context {
    
    inline def apply(polly: Polly): Context = {
      val __obj = js.Dynamic.literal(polly = polly.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setPolly(value: Polly): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    }
  }
}

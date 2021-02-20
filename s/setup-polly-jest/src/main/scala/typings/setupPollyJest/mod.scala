package typings.setupPollyJest

import typings.pollyjsCore.mod.Polly
import typings.pollyjsCore.mod.PollyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("setup-polly-jest", "setupPolly")
  @js.native
  def setupPolly(): Context = js.native
  @JSImport("setup-polly-jest", "setupPolly")
  @js.native
  def setupPolly(config: PollyConfig): Context = js.native
  
  @js.native
  trait Context extends StObject {
    
    val polly: Polly = js.native
  }
  object Context {
    
    @scala.inline
    def apply(polly: Polly): Context = {
      val __obj = js.Dynamic.literal(polly = polly.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolly(value: Polly): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    }
  }
}

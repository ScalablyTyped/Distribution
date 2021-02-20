package typings.signalExit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signal-exit", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function2[/* code */ Double | Null, /* signal */ Signal | Null, Unit]): js.Function0[Unit] = js.native
  @JSImport("signal-exit", JSImport.Namespace)
  @js.native
  def apply(
    callback: js.Function2[/* code */ Double | Null, /* signal */ Signal | Null, Unit],
    options: Options
  ): js.Function0[Unit] = js.native
  
  @JSImport("signal-exit", "load")
  @js.native
  def load(): Unit = js.native
  
  @JSImport("signal-exit", "signals")
  @js.native
  def signals(): js.Array[Signal] = js.native
  
  @JSImport("signal-exit", "unload")
  @js.native
  def unload(): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var alwaysLast: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysLast(value: Boolean): Self = StObject.set(x, "alwaysLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysLastUndefined: Self = StObject.set(x, "alwaysLast", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.signalExit.signalExitStrings.SIGABRT
    - typings.signalExit.signalExitStrings.SIGALRM
    - typings.signalExit.signalExitStrings.SIGHUP
    - typings.signalExit.signalExitStrings.SIGINT
    - typings.signalExit.signalExitStrings.SIGTERM
    - java.lang.String
  */
  type Signal = _Signal | String
  
  trait _Signal extends StObject
}

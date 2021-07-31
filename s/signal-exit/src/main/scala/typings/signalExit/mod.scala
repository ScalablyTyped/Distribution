package typings.signalExit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(callback: js.Function2[/* code */ Double | Null, /* signal */ Signal | Null, Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def apply(
    callback: js.Function2[/* code */ Double | Null, /* signal */ Signal | Null, Unit],
    options: Options
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("signal-exit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
  
  @scala.inline
  def signals(): js.Array[Signal] = ^.asInstanceOf[js.Dynamic].applyDynamic("signals")().asInstanceOf[js.Array[Signal]]
  
  @scala.inline
  def unload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")().asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var alwaysLast: js.UndefOr[Boolean] = js.undefined
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

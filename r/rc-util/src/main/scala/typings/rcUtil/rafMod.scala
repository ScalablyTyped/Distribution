package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rafMod {
  
  object default {
    
    inline def apply(callback: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(callback: js.Function0[Unit], times: Double): Double = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("rc-util/lib/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-util/lib/raf", "default.cancel")
    @js.native
    def cancel: js.Function1[/* id */ Double, Unit] = js.native
    inline def cancel_=(x: js.Function1[/* id */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
  }
}

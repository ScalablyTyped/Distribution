package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRafMod {
  
  object default {
    
    inline def apply(callback: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(callback: js.Function0[Unit], times: Double): Double = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("rc-util/es/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def cancel(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

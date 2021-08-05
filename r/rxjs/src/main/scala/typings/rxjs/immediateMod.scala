package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immediateMod {
  
  object Immediate {
    
    @JSImport("rxjs/internal/util/Immediate", "Immediate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearImmediate(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setImmediate(cb: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(cb.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object TestTools {
    
    @JSImport("rxjs/internal/util/Immediate", "TestTools")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pending(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pending")().asInstanceOf[Double]
  }
}

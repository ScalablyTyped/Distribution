package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immediateMod {
  
  object Immediate {
    
    @JSImport("rxjs/internal/util/Immediate", "Immediate.clearImmediate")
    @js.native
    def clearImmediate(handle: Double): Unit = js.native
    
    @JSImport("rxjs/internal/util/Immediate", "Immediate.setImmediate")
    @js.native
    def setImmediate(cb: js.Function0[Unit]): Double = js.native
  }
  
  object TestTools {
    
    @JSImport("rxjs/internal/util/Immediate", "TestTools.pending")
    @js.native
    def pending(): Double = js.native
  }
}

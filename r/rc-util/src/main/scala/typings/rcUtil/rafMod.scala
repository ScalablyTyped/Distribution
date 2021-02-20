package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rafMod {
  
  object default {
    
    @JSImport("rc-util/lib/raf", JSImport.Default)
    @js.native
    def apply(callback: js.Function0[Unit]): Double = js.native
    @JSImport("rc-util/lib/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-util/lib/raf", "default.cancel")
    @js.native
    def cancel: js.Function1[/* num */ Double, Unit] = js.native
    @scala.inline
    def cancel_=(x: js.Function1[/* num */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
  }
}

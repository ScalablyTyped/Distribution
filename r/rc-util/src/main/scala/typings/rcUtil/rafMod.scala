package typings.rcUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-util/lib/raf", JSImport.Namespace)
@js.native
object rafMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(callback: js.Function0[Unit]): Double = js.native
    
    var cancel: js.Function1[/* num */ Double, Unit] = js.native
  }
}

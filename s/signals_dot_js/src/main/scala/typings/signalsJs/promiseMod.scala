package typings.signalsJs

import typings.signalsJs.onceSignalMod.OnceSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signals.js/lib/org/osflash/signals/Promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  
  @js.native
  class Promise () extends OnceSignal {
    
    var isDispatched: js.Any = js.native
    
    var valueObjects: js.Any = js.native
  }
}

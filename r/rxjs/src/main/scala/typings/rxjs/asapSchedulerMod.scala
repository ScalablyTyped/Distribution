package typings.rxjs

import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduler/AsapScheduler", JSImport.Namespace)
@js.native
object asapSchedulerMod extends js.Object {
  
  @js.native
  class AsapScheduler () extends AsyncScheduler {
    
    def flush(): Unit = js.native
  }
}

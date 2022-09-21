package typings.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskQueueMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/TaskQueue", "TaskQueue")
  @js.native
  open class TaskQueue () extends StObject {
    
    def postTask[T](task: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}

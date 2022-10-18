package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonTaskQueueMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/TaskQueue", "TaskQueue")
  @js.native
  open class TaskQueue () extends StObject {
    
    def postTask[T](task: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}

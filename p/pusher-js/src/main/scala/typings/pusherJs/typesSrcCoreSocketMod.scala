package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreSocketMod {
  
  @js.native
  trait Socket extends StObject {
    
    def close(): Any = js.native
    def close(code: Any): Any = js.native
    def close(code: Any, reason: Any): Any = js.native
    def close(code: Unit, reason: Any): Any = js.native
    
    var onactivity: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onclose: js.UndefOr[js.Function1[/* closeEvent */ Any, Unit]] = js.native
    
    var onerror: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.native
    
    var onmessage: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.native
    
    var onopen: js.UndefOr[js.Function1[/* evt */ js.UndefOr[Any], Unit]] = js.native
    
    var ping: js.UndefOr[js.Function0[Unit]] = js.native
    
    def send(payload: Any): Unit = js.native
    
    var sendRaw: js.UndefOr[js.Function1[/* payload */ Any, Boolean]] = js.native
  }
}

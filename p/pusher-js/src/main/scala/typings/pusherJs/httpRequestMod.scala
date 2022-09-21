package typings.pusherJs

import typings.pusherJs.ajaxMod.Ajax
import typings.pusherJs.requestHooksMod.RequestHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestMod {
  
  @JSImport("pusher-js/types/src/core/http/http_request", JSImport.Default)
  @js.native
  open class default protected () extends HTTPRequest {
    def this(hooks: RequestHooks, method: String, url: String) = this()
  }
  
  @js.native
  trait HTTPRequest
    extends typings.pusherJs.dispatcherMod.default {
    
    /* private */ var advanceBuffer: Any = js.native
    
    def close(): Unit = js.native
    
    var hooks: RequestHooks = js.native
    
    /* private */ var isBufferTooLong: Any = js.native
    
    var method: String = js.native
    
    def onChunk(status: Double, data: Any): Unit = js.native
    
    var position: Double = js.native
    
    def start(): Unit = js.native
    def start(payload: Any): Unit = js.native
    
    var unloader: js.Function = js.native
    
    var url: String = js.native
    
    var xhr: Ajax = js.native
  }
}

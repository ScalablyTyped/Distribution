package typings.pusherJs

import typings.pusherJs.configMod.AuthTransport
import typings.pusherJs.configMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pusherJsStrings {
  
  @js.native
  sealed trait ajax
    extends StObject
       with AuthTransport
  inline def ajax: ajax = "ajax".asInstanceOf[ajax]
  
  @js.native
  sealed trait jsonp
    extends StObject
       with AuthTransport
  inline def jsonp: jsonp = "jsonp".asInstanceOf[jsonp]
  
  @js.native
  sealed trait sockjs
    extends StObject
       with Transport
  inline def sockjs: sockjs = "sockjs".asInstanceOf[sockjs]
  
  @js.native
  sealed trait ws
    extends StObject
       with Transport
  inline def ws: ws = "ws".asInstanceOf[ws]
  
  @js.native
  sealed trait wss
    extends StObject
       with Transport
  inline def wss: wss = "wss".asInstanceOf[wss]
  
  @js.native
  sealed trait xhr_polling
    extends StObject
       with Transport
  inline def xhr_polling: xhr_polling = "xhr_polling".asInstanceOf[xhr_polling]
  
  @js.native
  sealed trait xhr_streaming
    extends StObject
       with Transport
  inline def xhr_streaming: xhr_streaming = "xhr_streaming".asInstanceOf[xhr_streaming]
}

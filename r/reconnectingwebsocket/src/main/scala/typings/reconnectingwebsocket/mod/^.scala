package typings.reconnectingwebsocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This behaves like a `WebSocket` in every way, except if it fails to connect,
  * or it gets disconnected, it will repeatedly poll until it successfully connects
  * again.
  *
  * It is API compatible, so when you have:
  * ```ts
  * ws = new WebSocket('ws://....');
  * ```
  * you can replace with:
  * ```ts
  * ws = new ReconnectingWebSocket('ws://....');
  * ```
  *
  * The event stream will typically look like:
  * - `onconnecting`
  * - `onopen`
  * - `onmessage`
  * - `onmessage`
  * - `onclose` // lost connection
  * - `onconnecting`
  * - `onopen`  // sometime later...
  * - `onmessage`
  * - `onmessage`
  * - etc...
  *
  * It is API compatible with the standard WebSocket API, apart from the following members:
  * - `bufferedAmount`
  * - `extensions`
  * - `binaryType`
  */
@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
class ^ protected () extends ReconnectingWebSocket {
  /**
    * @param url The url you are connecting to.
    * @param protocols Optional string or array of protocols.
    * @param options See `ReconnectingWebSocket.Options`
    */
  def this(url: String) = this()
  def this(url: String, protocols: String) = this()
  def this(url: String, protocols: js.Array[String]) = this()
  def this(url: String, protocols: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(url: String, protocols: String, options: Options) = this()
  def this(url: String, protocols: js.Array[String], options: Options) = this()
}
@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var CLOSED: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CLOSED'] */ js.Any = js.native
  
  var CLOSING: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CLOSING'] */ js.Any = js.native
  
  var CONNECTING: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['CONNECTING'] */ js.Any = js.native
  
  var OPEN: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.WebSocket * / any['OPEN'] */ js.Any = js.native
  
  /**
    * Whether all instances of ReconnectingWebSocket should log debug messages.
    * Setting this to true is the equivalent of setting all instances of ReconnectingWebSocket.debug to true.
    */
  var debugAll: Boolean = js.native
}

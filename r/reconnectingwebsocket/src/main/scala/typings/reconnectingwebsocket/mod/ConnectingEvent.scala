package typings.reconnectingwebsocket.mod

import typings.reconnectingwebsocket.reconnectingwebsocketStrings.connecting
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectingEvent
  extends CustomEvent[js.UndefOr[scala.Nothing]] {
  
  var code: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CloseEvent * / any['code'] */ js.Any = js.native
  
  var reason: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CloseEvent * / any['reason'] */ js.Any = js.native
  
  @JSName("type")
  var type_ConnectingEvent: connecting = js.native
  
  var wasClean: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CloseEvent * / any['wasClean'] */ js.Any = js.native
}

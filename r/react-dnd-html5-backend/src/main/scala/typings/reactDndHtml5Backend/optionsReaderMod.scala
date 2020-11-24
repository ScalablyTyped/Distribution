package typings.reactDndHtml5Backend

import typings.reactDndHtml5Backend.html5backendimplMod.global.Window
import typings.reactDndHtml5Backend.typesMod.HTML5BackendContext
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-html5-backend/lib/OptionsReader", JSImport.Namespace)
@js.native
object optionsReaderMod extends js.Object {
  
  @js.native
  class OptionsReader protected () extends js.Object {
    def this(globalContext: HTML5BackendContext) = this()
    
    def document: js.UndefOr[Document] = js.native
    
    var globalContext: js.Any = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}

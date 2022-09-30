package typings.reactDndHtml5Backend

import typings.reactDndHtml5Backend.browserDetectorMod.global.Window
import typings.reactDndHtml5Backend.typesMod.HTML5BackendContext
import typings.reactDndHtml5Backend.typesMod.HTML5BackendOptions
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsReaderMod {
  
  @JSImport("react-dnd-html5-backend/dist/OptionsReader", "OptionsReader")
  @js.native
  open class OptionsReader protected () extends StObject {
    def this(globalContext: HTML5BackendContext) = this()
    def this(globalContext: HTML5BackendContext, options: HTML5BackendOptions) = this()
    
    def document: js.UndefOr[Document] = js.native
    
    /* private */ var globalContext: Any = js.native
    
    /* private */ var optionsArgs: Any = js.native
    
    var ownerDocument: Document | Null = js.native
    
    def rootElement: js.UndefOr[Node] = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}

package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.BackendFactory
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-html5-backend", "HTML5Backend")
  @js.native
  val HTML5Backend: BackendFactory = js.native
  
  object NativeTypes {
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.FILE")
    @js.native
    val FILE: /* "__NATIVE_FILE__" */ String = js.native
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.TEXT")
    @js.native
    val TEXT: /* "__NATIVE_TEXT__" */ String = js.native
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.URL")
    @js.native
    val URL: /* "__NATIVE_URL__" */ String = js.native
  }
  
  @JSImport("react-dnd-html5-backend", "getEmptyImage")
  @js.native
  def getEmptyImage(): HTMLImageElement = js.native
}

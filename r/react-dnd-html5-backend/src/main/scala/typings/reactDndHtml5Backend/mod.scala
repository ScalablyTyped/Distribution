package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.BackendFactory
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: BackendFactory = js.native
  def getEmptyImage(): HTMLImageElement = js.native
  @js.native
  object NativeTypes extends js.Object {
    val FILE: /* "__NATIVE_FILE__" */ String = js.native
    val TEXT: /* "__NATIVE_TEXT__" */ String = js.native
    val URL: /* "__NATIVE_URL__" */ String = js.native
  }
  
}


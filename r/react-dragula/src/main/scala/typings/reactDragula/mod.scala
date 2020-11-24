package typings.reactDragula

import typings.dragula.mod.DragulaOptions
import typings.dragula.mod.Drake
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dragula", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(containers: js.Array[HTMLElement]): Drake = js.native
  def apply(containers: js.Array[HTMLElement], options: DragulaOptions): Drake = js.native
}

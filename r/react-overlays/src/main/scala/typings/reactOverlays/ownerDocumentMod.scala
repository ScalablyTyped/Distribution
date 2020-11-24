package typings.reactOverlays

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/cjs/ownerDocument", JSImport.Namespace)
@js.native
object ownerDocumentMod extends js.Object {
  
  def default(): Document = js.native
  def default(componentOrElement: ComponentClass[js.Object, ComponentState]): Document = js.native
  def default(componentOrElement: Element): Document = js.native
}

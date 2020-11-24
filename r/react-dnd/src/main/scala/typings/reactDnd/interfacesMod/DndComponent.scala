package typings.reactDnd.interfacesMod

import typings.dndCore.interfacesMod.Identifier
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DndComponent[Props]
  extends Component[Props, js.Object, js.Any] {
  
  def getDecoratedComponentInstance(): (Component[Props, js.Object, _]) | Null = js.native
  
  def getHandlerId(): Identifier = js.native
}

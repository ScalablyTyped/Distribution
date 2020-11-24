package typings.reactDnd.createTargetFactoryMod

import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DropTargetSpec
import typings.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd/lib/decorators/createTargetFactory", "createTargetFactory")
@js.native
object createTargetFactory extends js.Object {
  
  def apply[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ RefObject[_], Target] = js.native
}

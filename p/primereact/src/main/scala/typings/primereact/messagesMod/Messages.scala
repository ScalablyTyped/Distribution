package typings.primereact.messagesMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/components/messages/Messages", "Messages")
@js.native
class Messages ()
  extends Component[MessagesProps, js.Any, js.Any] {
  
  def clear(): Unit = js.native
  
  def replace(message: js.Array[Message]): Unit = js.native
  def replace(message: Message): Unit = js.native
  
  def show(message: js.Array[Message]): Unit = js.native
  def show(message: Message): Unit = js.native
}

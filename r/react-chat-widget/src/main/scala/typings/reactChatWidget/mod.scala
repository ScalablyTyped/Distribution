package typings.reactChatWidget

import typings.react.mod.Component
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-chat-widget", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Widget ()
    extends Component[AnonAutofocus, js.Object, js.Any]
  
  def addLinkSnippet(link: String): Unit = js.native
  def addResponseMessage(input: String): Unit = js.native
  def addUserMessage(input: String): Unit = js.native
  def dropMessages(): Unit = js.native
  def isWidgetOpened(): Boolean = js.native
  def renderCustomComponent[P](component: ComponentType[P], props: P, showAvatar: Boolean): Unit = js.native
  def setQuickButtons(input: js.Array[AnonLabel]): Unit = js.native
  def toggleInputDisabled(): Unit = js.native
  def toggleMsgLoader(): Unit = js.native
  def toggleWidget(): Unit = js.native
}


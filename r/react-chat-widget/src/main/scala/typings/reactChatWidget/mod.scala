package typings.reactChatWidget

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactChatWidget.anon.Autofocus
import typings.reactChatWidget.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-chat-widget", "Widget")
  @js.native
  class Widget protected ()
    extends Component[Autofocus, js.Object, js.Any] {
    def this(props: Autofocus) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Autofocus, context: js.Any) = this()
  }
  
  @JSImport("react-chat-widget", "addLinkSnippet")
  @js.native
  def addLinkSnippet(link: String): Unit = js.native
  
  @JSImport("react-chat-widget", "addResponseMessage")
  @js.native
  def addResponseMessage(input: String): Unit = js.native
  
  @JSImport("react-chat-widget", "addUserMessage")
  @js.native
  def addUserMessage(input: String): Unit = js.native
  
  @JSImport("react-chat-widget", "dropMessages")
  @js.native
  def dropMessages(): Unit = js.native
  
  @JSImport("react-chat-widget", "isWidgetOpened")
  @js.native
  def isWidgetOpened(): Boolean = js.native
  
  @JSImport("react-chat-widget", "renderCustomComponent")
  @js.native
  def renderCustomComponent[P](component: ComponentType[P], props: P, showAvatar: Boolean): Unit = js.native
  
  @JSImport("react-chat-widget", "setQuickButtons")
  @js.native
  def setQuickButtons(input: js.Array[Label]): Unit = js.native
  
  @JSImport("react-chat-widget", "toggleInputDisabled")
  @js.native
  def toggleInputDisabled(): Unit = js.native
  
  @JSImport("react-chat-widget", "toggleMsgLoader")
  @js.native
  def toggleMsgLoader(): Unit = js.native
  
  @JSImport("react-chat-widget", "toggleWidget")
  @js.native
  def toggleWidget(): Unit = js.native
}

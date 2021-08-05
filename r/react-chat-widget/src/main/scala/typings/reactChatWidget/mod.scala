package typings.reactChatWidget

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactChatWidget.anon.Autofocus
import typings.reactChatWidget.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-chat-widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def addLinkSnippet(link: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLinkSnippet")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addResponseMessage(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addResponseMessage")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addUserMessage(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUserMessage")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dropMessages(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropMessages")().asInstanceOf[Unit]
  
  inline def isWidgetOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWidgetOpened")().asInstanceOf[Boolean]
  
  inline def renderCustomComponent[P](component: ComponentType[P], props: P, showAvatar: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCustomComponent")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], showAvatar.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setQuickButtons(input: js.Array[Label]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQuickButtons")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggleInputDisabled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleInputDisabled")().asInstanceOf[Unit]
  
  inline def toggleMsgLoader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMsgLoader")().asInstanceOf[Unit]
  
  inline def toggleWidget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleWidget")().asInstanceOf[Unit]
}

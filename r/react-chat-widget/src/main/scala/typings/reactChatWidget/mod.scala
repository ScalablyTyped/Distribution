package typings.reactChatWidget

import typings.react.mod.ElementType
import typings.reactChatWidget.anon.Label
import typings.reactChatWidget.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-chat-widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLinkSnippet(link: Link): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLinkSnippet")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addLinkSnippet(link: Link, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLinkSnippet")(link.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addResponseMessage(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addResponseMessage")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addResponseMessage(text: String, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addResponseMessage")(text.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addUserMessage(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUserMessage")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addUserMessage(text: String, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUserMessage")(text.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteMessages(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteMessages")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def deleteMessages(count: Double, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMessages")(count.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dropMessages(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropMessages")().asInstanceOf[Unit]
  
  inline def isWidgetOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWidgetOpened")().asInstanceOf[Boolean]
  
  inline def markAllAsRead(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAllAsRead")().asInstanceOf[Unit]
  
  inline def renderCustomComponent(component: ElementType[Any], props: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCustomComponent")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderCustomComponent(component: ElementType[Any], props: Any, showAvatar: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCustomComponent")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], showAvatar.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderCustomComponent(component: ElementType[Any], props: Any, showAvatar: Boolean, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCustomComponent")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], showAvatar.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeCount(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeCount")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setQuickButtons(buttons: js.Array[Label]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQuickButtons")(buttons.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggleInputDisabled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleInputDisabled")().asInstanceOf[Unit]
  
  inline def toggleMsgLoader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMsgLoader")().asInstanceOf[Unit]
  
  inline def toggleWidget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleWidget")().asInstanceOf[Unit]
}

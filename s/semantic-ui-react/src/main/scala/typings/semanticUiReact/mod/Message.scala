package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.messageMessageMod.MessageComponent
import typings.semanticUiReact.messageMessageMod.MessageProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Message")
@js.native
class Message protected ()
  extends Component[MessageProps, ComponentState, js.Any] {
  def this(props: MessageProps) = this()
  def this(props: MessageProps, context: js.Any) = this()
}
object Message {
  
  inline def apply: MessageComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Message").asInstanceOf[MessageComponent]
}

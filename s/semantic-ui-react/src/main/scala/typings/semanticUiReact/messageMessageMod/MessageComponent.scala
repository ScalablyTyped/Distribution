package typings.semanticUiReact.messageMessageMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.messageContentMod.MessageContentProps
import typings.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typings.semanticUiReact.messageItemMod.MessageItemProps
import typings.semanticUiReact.messageListMod.MessageListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageComponent extends ComponentClass[MessageProps, ComponentState] {
  var Content: StatelessComponent[MessageContentProps] = js.native
  var Header: StatelessComponent[MessageHeaderProps] = js.native
  var Item: StatelessComponent[MessageItemProps] = js.native
  var List: StatelessComponent[MessageListProps] = js.native
}


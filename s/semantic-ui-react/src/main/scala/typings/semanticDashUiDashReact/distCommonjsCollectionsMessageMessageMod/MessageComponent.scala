package typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageContentMod.MessageContentProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps
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


package typings.semanticDashUiDashReact.distCommonjsElementsListListMod

import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsElementsListListContentMod.ListContentProps
import typings.semanticDashUiDashReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typings.semanticDashUiDashReact.distCommonjsElementsListListIconMod.ListIconProps
import typings.semanticDashUiDashReact.distCommonjsElementsListListItemMod.ListItemProps
import typings.semanticDashUiDashReact.distCommonjsElementsListListListMod.ListListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponent extends FunctionComponent[ListProps] {
  var Content: StatelessComponent[ListContentProps] = js.native
  var Description: StatelessComponent[ListDescriptionProps] = js.native
  var Header: StatelessComponent[ListHeaderProps] = js.native
  var Icon: StatelessComponent[ListIconProps] = js.native
  var Item: StatelessComponent[ListItemProps] = js.native
  var List: StatelessComponent[ListListProps] = js.native
}


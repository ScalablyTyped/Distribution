package typings.semanticUiReact.listListMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.listContentMod.ListContentProps
import typings.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typings.semanticUiReact.listHeaderMod.ListHeaderProps
import typings.semanticUiReact.listIconMod.ListIconProps
import typings.semanticUiReact.listItemMod.ListItemProps
import typings.semanticUiReact.listListListMod.ListListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComponent extends FunctionComponent[ListProps] {
  var Content: StatelessComponent[ListContentProps] = js.native
  var Description: StatelessComponent[ListDescriptionProps] = js.native
  var Header: StatelessComponent[ListHeaderProps] = js.native
  var Icon: StatelessComponent[ListIconProps] = js.native
  var Item: StatelessComponent[ListItemProps] = js.native
  var List: StatelessComponent[ListListProps] = js.native
}


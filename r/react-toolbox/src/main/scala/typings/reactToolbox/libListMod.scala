package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.libListListMod.ListProps
import typings.reactToolbox.listListCheckboxMod.ListCheckboxProps
import typings.reactToolbox.listListDividerMod.ListDividerProps
import typings.reactToolbox.listListItemActionMod.ListItemActionProps
import typings.reactToolbox.listListItemActionsMod.ListItemActionsProps
import typings.reactToolbox.listListItemContentMod.ListItemContentProps
import typings.reactToolbox.listListItemLayoutMod.ListItemLayoutProps
import typings.reactToolbox.listListItemMod.ListItemProps
import typings.reactToolbox.listListItemTextMod.ListItemTextProps
import typings.reactToolbox.listListSubHeaderMod.ListSubHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/list", JSImport.Namespace)
@js.native
object libListMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListCheckbox ()
    extends Component[ListCheckboxProps, js.Object, js.Any]
  
  @js.native
  class ListDivider ()
    extends Component[ListDividerProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps with ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemAction ()
    extends Component[ListItemActionProps, js.Object, js.Any]
  
  @js.native
  class ListItemActions ()
    extends Component[ListItemActionsProps, js.Object, js.Any]
  
  @js.native
  class ListItemContent ()
    extends Component[ListItemContentProps, js.Object, js.Any]
  
  @js.native
  class ListItemLayout ()
    extends Component[ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemText ()
    extends Component[ListItemTextProps, js.Object, js.Any]
  
  @js.native
  class ListSubHeader ()
    extends Component[ListSubHeaderProps, js.Object, js.Any]
  
}


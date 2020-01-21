package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.listCheckboxMod.ListCheckboxProps
import typings.reactToolbox.listDividerMod.ListDividerProps
import typings.reactToolbox.listItemActionMod.ListItemActionProps
import typings.reactToolbox.listItemActionsMod.ListItemActionsProps
import typings.reactToolbox.listItemContentMod.ListItemContentProps
import typings.reactToolbox.listItemLayoutMod.ListItemLayoutProps
import typings.reactToolbox.listItemMod.ListItemProps
import typings.reactToolbox.listItemTextMod.ListItemTextProps
import typings.reactToolbox.listListMod.ListProps
import typings.reactToolbox.listSubHeaderMod.ListSubHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
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


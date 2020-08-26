package typings.reactMdList

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/list/types/SimpleListItem", JSImport.Namespace)
@js.native
object simpleListItemMod extends js.Object {
  /**
    * The `SimpleListItem` component is used to create a non-clickable item within
    * a `List`. This is really just useful since it allows for the `ListItem`
    * styling behavior of left and right icons, avatars, and media.
    *
    * Note: Even though this component exists, it is recommended to use the
    * `ListItemChildren` component instead if you want the "addon" styling/behavior
    * since screen readers read `li` items within lists differently.
    */
  val default: ForwardRefExoticComponent[SimpleListItemProps with RefAttributes[HTMLLIElement]] = js.native
}


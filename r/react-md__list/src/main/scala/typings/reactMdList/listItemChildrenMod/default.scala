package typings.reactMdList.listItemChildrenMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/list/types/ListItemChildren", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * The `ListItemChildren` component is used to create a styled list item that
    * can have optional addons to the left or right of the children in the form of
    * icons, avatars, or media. The `children` can be replaced by the `primaryText`
    * and `secondaryText` props to create stacked text spanning two or more lines
    * with the default behavior of using `line-clamp` at three lines.
    *
    * Note: This will return a `React.Fragment` of the children and does not wrap
    * in a DOM node for styling. The parent component should normally have
    * `display: flex` for the styling to work.
    */
  def apply(
    hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapChildren: ListItemChildrenProps
  ): ReactElement = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var forceAddonWrap: js.Any = js.native
    var leftAddon: js.Any = js.native
    var leftAddonPosition: js.Any = js.native
    var leftAddonType: js.Any = js.native
    var primaryText: js.Any = js.native
    var rightAddon: js.Any = js.native
    var rightAddonPosition: js.Any = js.native
    var rightAddonType: js.Any = js.native
    var secondaryText: js.Any = js.native
    var secondaryTextClassName: js.Any = js.native
    var textChildren: js.Any = js.native
    var textClassName: js.Any = js.native
  }
  
}


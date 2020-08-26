package typings.reactMdList

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.getListItemHeightMod.ListItemHeight
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.reactMdList.listItemAddonMod.ListItemAddonProps
import typings.reactMdList.listItemChildrenMod.ListItemChildrenProps
import typings.reactMdList.listItemLinkMod.ListItemLinkProps
import typings.reactMdList.listItemLinkMod.ListItemLinkWithComponentProps
import typings.reactMdList.listItemMod.ListItemProps
import typings.reactMdList.listItemTextMod.ListItemTextProps
import typings.reactMdList.listMod.ListElement
import typings.reactMdList.listMod.ListProps
import typings.reactMdList.listSubheaderMod.ListSubheaderProps
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The `List` component creates an unstyled ordered or unordered list that
    * should be used with the `ListItem`, `ListItemLink`, and `SimpleListItem`
    * components.
    */
  val List: ForwardRefExoticComponent[ListProps with RefAttributes[ListElement]] = js.native
  /**
    * The `ListItem` creates a clickable and focusable `<li>` within a `List` that
    * can optionally render addons to the left and right of the `children` or text.
    */
  val ListItem: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLLIElement]] = js.native
  /**
    * This component is a really bad attempt at creating a `Link` within a `List`
    * that has the main `ListItem` styles. It will probably be better to just use
    * the `ListItemChildren` within your `Link` component instead.
    */
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (ListItemLinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  /**
    * This is a simple component that will render a `<li>` with the subheader
    * typography styles. It also supports an `inset` variant that adds some spacing
    * to the left of the text to align with other `ListItem` that have left addons.
    */
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps with RefAttributes[HTMLLIElement]] = js.native
  /**
    * The `SimpleListItem` component is used to create a non-clickable item within
    * a `List`. This is really just useful since it allows for the `ListItem`
    * styling behavior of left and right icons, avatars, and media.
    *
    * Note: Even though this component exists, it is recommended to use the
    * `ListItemChildren` component instead if you want the "addon" styling/behavior
    * since screen readers read `li` items within lists differently.
    */
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps with RefAttributes[HTMLLIElement]] = js.native
  def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = js.native
  @js.native
  object ListItemAddon extends js.Object {
    /**
      * The `ListItemAddon` is used to create an addon to the left or right of the
      * text/children of a `ListItem`.
      */
    def apply(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): ReactElement = js.native
    @js.native
    object propTypes extends js.Object {
      var addon: js.Any = js.native
      var addonAfter: js.Any = js.native
      var children: js.Any = js.native
      var className: js.Any = js.native
      var forceAddonWrap: js.Any = js.native
      var position: js.Any = js.native
      var `type`: js.Any = js.native
    }
    
  }
  
  @js.native
  object ListItemChildren extends js.Object {
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
  
  @js.native
  object ListItemText extends js.Object {
    /**
      * This component us used to create the one to three lines of text within a
      * `ListItem` or `SimpleListItem`.
      */
    def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = js.native
    @js.native
    object propTypes extends js.Object {
      var children: js.Any = js.native
      var className: js.Any = js.native
      var secondaryText: js.Any = js.native
      var secondaryTextClassName: js.Any = js.native
    }
    
  }
  
}


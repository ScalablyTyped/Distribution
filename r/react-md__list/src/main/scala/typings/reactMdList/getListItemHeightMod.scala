package typings.reactMdList

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactMdList.listItemAddonMod.ListItemAddonPosition
import typings.reactMdList.listItemAddonMod.ListItemAddonType
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getListItemHeightMod {
  
  @JSImport("@react-md/list/types/getListItemHeight", "getListItemHeight")
  @js.native
  def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdList.reactMdListStrings.auto
    - typings.reactMdList.reactMdListStrings.normal
    - typings.reactMdList.reactMdListStrings.medium
    - typings.reactMdList.reactMdListStrings.large
    - typings.reactMdList.reactMdListStrings.`extra-large`
  */
  trait ListItemHeight extends StObject
  object ListItemHeight {
    
    @scala.inline
    def auto: typings.reactMdList.reactMdListStrings.auto = "auto".asInstanceOf[typings.reactMdList.reactMdListStrings.auto]
    
    @scala.inline
    def `extra-large`: typings.reactMdList.reactMdListStrings.`extra-large` = "extra-large".asInstanceOf[typings.reactMdList.reactMdListStrings.`extra-large`]
    
    @scala.inline
    def large: typings.reactMdList.reactMdListStrings.large = "large".asInstanceOf[typings.reactMdList.reactMdListStrings.large]
    
    @scala.inline
    def medium: typings.reactMdList.reactMdListStrings.medium = "medium".asInstanceOf[typings.reactMdList.reactMdListStrings.medium]
    
    @scala.inline
    def normal: typings.reactMdList.reactMdListStrings.normal = "normal".asInstanceOf[typings.reactMdList.reactMdListStrings.normal]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdList.listItemChildrenMod.ListItemChildrenProps because var conflicts: children. Inlined textClassName, secondaryTextClassName, textChildren, primaryText, secondaryText, leftAddon, leftAddonType, leftAddonPosition, rightAddon, rightAddonType, rightAddonPosition, forceAddonWrap */ @js.native
  trait SimpleListItemProps extends HTMLAttributes[HTMLLIElement] {
    
    /**
      * Boolean if the list item should be updated to use the clickable styles to
      * the item. This is really just a pass-down value for the main `ListItem`
      * component and shouldn't really be used unless you are implementing your own
      * clickable `ListItem` component.
      */
    var clickable: js.UndefOr[Boolean] = js.native
    
    /**
      * This prop shouldn't really be used other than a pass-down value from the
      * ListItem component.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the list item should apply an opacity value while disabled
      * instead of overriding the primary and secondary text colors. Enabling this
      * will allow for the list item addons to also be dimmed.
      *
      * This is configured by the `$rmd-list-item-disabled-opacity` variable.
      *
      * Note: This does nothing if the `disabled` prop is not enabled.
      */
    var disabledOpacity: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the left and/or right addons should be "forcefully" wrapped in a
      * `<span>` with the spacing class names applied instead of attempting to
      * clone it into the provided icon element.
      */
    var forceAddonWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * The height to apply to the list item.
      *
      * Conversions:
      *
      * - height !== "auto" -> height
      * - secondaryText or left/right addon is media/media-large  -> "extra-large"
      * - left/right addon is avatar -> "large"
      * - left/right addon is icon -> "medium"
      * - no addons and no secondary text -> "normal"
      */
    var height: js.UndefOr[ListItemHeight] = js.native
    
    /**
      * An optional addon to display to the left of the `primaryText` or
      * `children` and should be used with the `leftAddonType` prop to adjust
      * spacing.
      */
    var leftAddon: js.UndefOr[ReactNode] = js.native
    
    /**
      * The vertical position the left icon, avatar, media, or large media
      * should be placed.
      */
    var leftAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
    
    /**
      * The type of the addon that appears to the left of the `primaryText` or
      * `children`.
      */
    var leftAddonType: js.UndefOr[ListItemAddonType] = js.native
    
    /**
      * An optional element that should be rendered as the `primaryText` within the
      * list item. It is most likely easier to use the `children` prop instead, but
      * this allows you to create more complex components with the `ListItem` since
      * you can provided `children` and have the styles for the `primaryText` still
      * applied. By default, this will only allow one line of text and add ellipsis
      * for any text overflow.
      */
    var primaryText: js.UndefOr[ReactNode] = js.native
    
    /**
      * An optional addon to display to the right of the `primaryText` or
      * `children` and should be used with the `rightAddonType` prop to adjust
      * spacing.
      */
    var rightAddon: js.UndefOr[ReactNode] = js.native
    
    /**
      * The vertical position the right icon, avatar, media, or large media
      * should be placed.
      */
    var rightAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
    
    /**
      * The type of the addon that appears to the right of the `primaryText` or
      * `children`.
      */
    var rightAddonType: js.UndefOr[ListItemAddonType] = js.native
    
    /**
      * An optional element that should be rendered as the `secondaryText` within
      * the list item. By default, this will only span one line and add ellipsis
      * for overflow.
      */
    var secondaryText: js.UndefOr[ReactNode] = js.native
    
    /**
      * An optional className to apply to the `<span>` that surrounds the
      * `secondaryText` within the list item.
      */
    var secondaryTextClassName: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the children should be treated as the `primaryText` prop. This
      * will wrap them in an additional class so that they have ellipsis for text
      * overflow.
      *
      * If you want to have more "freedom" within the `ListItem`, you can disable
      * this prop so that the height will grow depending on content.
      *
      * NOTE: If the `secondaryText` prop is provided, this will always be
      * considered `true`.
      */
    var textChildren: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional className to apply to the `<span>` that surrounds the
      * `primaryText` and optionally `secondaryText` within the list item.
      */
    var textClassName: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the list item should be considered "three-lines" in height. This
      * will update the `secondaryText` to span 2 lines instead of one, but it will
      * not correctly applied the trailing ellipsis overflow due to browser
      * compatibility of `line-clamp`. If you would still like the ellipsis to
      * show, it is recommended to use javascript to add them yourself.
      */
    var threeLines: js.UndefOr[Boolean] = js.native
  }
  object SimpleListItemProps {
    
    @scala.inline
    def apply(): SimpleListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleListItemProps]
    }
    
    @scala.inline
    implicit class SimpleListItemPropsMutableBuilder[Self <: SimpleListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledOpacity(value: Boolean): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      @scala.inline
      def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeftAddon(value: ReactNode): Self = StObject.set(x, "leftAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "leftAddonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonPositionUndefined: Self = StObject.set(x, "leftAddonPosition", js.undefined)
      
      @scala.inline
      def setLeftAddonType(value: ListItemAddonType): Self = StObject.set(x, "leftAddonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftAddonTypeUndefined: Self = StObject.set(x, "leftAddonType", js.undefined)
      
      @scala.inline
      def setLeftAddonUndefined: Self = StObject.set(x, "leftAddon", js.undefined)
      
      @scala.inline
      def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      @scala.inline
      def setRightAddon(value: ReactNode): Self = StObject.set(x, "rightAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "rightAddonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonPositionUndefined: Self = StObject.set(x, "rightAddonPosition", js.undefined)
      
      @scala.inline
      def setRightAddonType(value: ListItemAddonType): Self = StObject.set(x, "rightAddonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightAddonTypeUndefined: Self = StObject.set(x, "rightAddonType", js.undefined)
      
      @scala.inline
      def setRightAddonUndefined: Self = StObject.set(x, "rightAddon", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      @scala.inline
      def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      @scala.inline
      def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      @scala.inline
      def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
    }
  }
}

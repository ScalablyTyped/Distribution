package typings.reactMdList

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdList.listItemAddonMod.ListItemAddonPosition
import typings.reactMdList.listItemAddonMod.ListItemAddonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemChildrenMod {
  
  object ListItemChildren {
    
    @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren")
    @js.native
    def apply(
      hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapChildren: ListItemChildrenProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.forceAddonWrap")
      @js.native
      def forceAddonWrap: js.Any = js.native
      @scala.inline
      def forceAddonWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceAddonWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.leftAddon")
      @js.native
      def leftAddon: js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.leftAddonPosition")
      @js.native
      def leftAddonPosition: js.Any = js.native
      @scala.inline
      def leftAddonPosition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftAddonPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.leftAddonType")
      @js.native
      def leftAddonType: js.Any = js.native
      @scala.inline
      def leftAddonType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftAddonType")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def leftAddon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftAddon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.primaryText")
      @js.native
      def primaryText: js.Any = js.native
      @scala.inline
      def primaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.rightAddon")
      @js.native
      def rightAddon: js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.rightAddonPosition")
      @js.native
      def rightAddonPosition: js.Any = js.native
      @scala.inline
      def rightAddonPosition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightAddonPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.rightAddonType")
      @js.native
      def rightAddonType: js.Any = js.native
      @scala.inline
      def rightAddonType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightAddonType")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def rightAddon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightAddon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.secondaryText")
      @js.native
      def secondaryText: js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.secondaryTextClassName")
      @js.native
      def secondaryTextClassName: js.Any = js.native
      @scala.inline
      def secondaryTextClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextClassName")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.textChildren")
      @js.native
      def textChildren: js.Any = js.native
      @scala.inline
      def textChildren_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textChildren")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemChildren", "ListItemChildren.propTypes.textClassName")
      @js.native
      def textClassName: js.Any = js.native
      @scala.inline
      def textClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textClassName")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListItemChildrenProps extends StObject {
    
    /**
      * The main content to display. When the `textChildren` prop is enabled and
      * there is child content, it will be treated as primary text and update the
      * styles automatically.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Boolean if the left and/or right addons should be "forcefully" wrapped in a
      * `<span>` with the spacing class names applied instead of attempting to
      * clone it into the provided icon element.
      */
    var forceAddonWrap: js.UndefOr[Boolean] = js.native
    
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
  }
  object ListItemChildrenProps {
    
    @scala.inline
    def apply(): ListItemChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemChildrenProps]
    }
    
    @scala.inline
    implicit class ListItemChildrenPropsMutableBuilder[Self <: ListItemChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
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
    }
  }
}

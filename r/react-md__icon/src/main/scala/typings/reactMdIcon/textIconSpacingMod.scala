package typings.reactMdIcon

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textIconSpacingMod {
  
  object TextIconSpacing {
    
    @scala.inline
    def apply(
      hasClassNamePropIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasClassNamePropIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.aboveClassName")
      @js.native
      def aboveClassName: js.Any = js.native
      @scala.inline
      def aboveClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aboveClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.afterClassName")
      @js.native
      def afterClassName: js.Any = js.native
      @scala.inline
      def afterClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.beforeClassName")
      @js.native
      def beforeClassName: js.Any = js.native
      @scala.inline
      def beforeClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.belowClassName")
      @js.native
      def belowClassName: js.Any = js.native
      @scala.inline
      def belowClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("belowClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.forceIconWrap")
      @js.native
      def forceIconWrap: js.Any = js.native
      @scala.inline
      def forceIconWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceIconWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.icon")
      @js.native
      def icon: js.Any = js.native
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.iconAfter")
      @js.native
      def iconAfter: js.Any = js.native
      @scala.inline
      def iconAfter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconAfter")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def icon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon/types/TextIconSpacing", "TextIconSpacing.propTypes.stacked")
      @js.native
      def stacked: js.Any = js.native
      @scala.inline
      def stacked_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stacked")(x.asInstanceOf[js.Any])
    }
  }
  
  trait TextIconSpacingProps extends StObject {
    
    /**
      * The class name to use for an icon that is placed before above the text.
      * This is used when the `stacked` prop is enabled and the `iconAfter` prop is
      * disabled or omitted.
      */
    var aboveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The class name to use for an icon that is placed after text.
      */
    var afterClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The class name to use for an icon that is placed before text.
      */
    var beforeClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The class name to use for an icon that is placed before above the text.
      * This is used when the `stacked` prop is enabled and the `iconAfter` prop is
      * enabled.
      */
    var belowClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The children to render before or after the provided icon. This is defaulted
      * to `null` so that providing a `null` icon will correctly render without
      * React crashing.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional className to apply to the surroudning `<span>` when the
      * `forceIconWrap` prop is enabled or the icon is not a valid React Element.
      * If the `forceIconWrap` prop is not enabled, it will be cloned into the icon
      * instead.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the icon should be forced into a `<span>` with the class names
      * applied instead of attempting to clone into the provided icon.
      */
    var forceIconWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional icon to display with a text button. This is invalid for icon
      * buttons. If this is a single element, a new class name will be cloned into
      * the element to get correct spacing so if you have a custom icon element,
      * you **must** also pass that class name down. If you are using one of the
      * react-md icon component packages, this is handled automatically.
      *
      * If this is not a valid react element, the icon will be wrapped in a
      * `<span>` instead with the class names applied.
      */
    var icon: js.UndefOr[ReactElement | ReactNode] = js.undefined
    
    /**
      * Boolean if the icon should appear after the text instead of before.
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the icon and text should be stacked instead of inline. Note:
      * You'll normally want to update the container element to have `display:
      * flex` and `flex-direction: column` for this to work.
      */
    var stacked: js.UndefOr[Boolean] = js.undefined
  }
  object TextIconSpacingProps {
    
    @scala.inline
    def apply(): TextIconSpacingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextIconSpacingProps]
    }
    
    @scala.inline
    implicit class TextIconSpacingPropsMutableBuilder[Self <: TextIconSpacingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAboveClassName(value: String): Self = StObject.set(x, "aboveClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboveClassNameUndefined: Self = StObject.set(x, "aboveClassName", js.undefined)
      
      @scala.inline
      def setAfterClassName(value: String): Self = StObject.set(x, "afterClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterClassNameUndefined: Self = StObject.set(x, "afterClassName", js.undefined)
      
      @scala.inline
      def setBeforeClassName(value: String): Self = StObject.set(x, "beforeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeClassNameUndefined: Self = StObject.set(x, "beforeClassName", js.undefined)
      
      @scala.inline
      def setBelowClassName(value: String): Self = StObject.set(x, "belowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBelowClassNameUndefined: Self = StObject.set(x, "belowClassName", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setForceIconWrap(value: Boolean): Self = StObject.set(x, "forceIconWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceIconWrapUndefined: Self = StObject.set(x, "forceIconWrap", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
}

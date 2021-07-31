package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdUtils.reactMdUtilsStrings.`max-content`
import typings.reactMdUtils.reactMdUtilsStrings.`min-content`
import typings.reactMdUtils.reactMdUtilsStrings.auto
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@react-md/utils/types/layout/Grid", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/Grid", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/Grid", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait GridProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the `children` should have the grid `style` and `className`
      * props cloned using `React.cloneElement`. This is useful if you just want to
      * use the grid styles without the additional wrapper `<div>`.
      *
      * Note: if this prop is provided, all of the `HTMLAttributes` props will be
      * ignored as well as the `clone` and `wrapOnly` props.
      *
      * @since 2.3.0
      */
    var cloneStyles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the `children` should be updated to be wrapped in the `GridCell`
      * component and clone the `className` into each child automatically. This is
      * really just a convenience prop so you don't always need to import both the
      * `Grid` and `GridCell` components to create a grid.
      */
    @JSName("clone")
    var clone_FGridProps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional number of columns to apply for all media types. Providing one
      * of the media-spcific column props will override this value for those
      * breakpoints still.
      */
    var columns: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional number of columns to display for desktop screens.
      */
    var desktopColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * This will override the default grid cell's gutter value (the space between
      * each cell). This **needs to be a number with a unit** since it is set to a
      * css variable. Examples:
      *
      * - `1rem`
      * - `16px`
      * - `1em`
      * - `5%`
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    /**
      * An optional number of columns to display for large desktop screens.
      */
    var largeDesktopColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * This prop allows you to generate your grid with a dynamic amount of columns
      * instead of a static size. This will update the grid to ignore all the
      * `columns` props and update the grid to show as many columns as possible by
      * updating the `grid-template-columns` style to be:
      *
      * ```scss
      * grid-template-columns: repeat(auto-fill, minmax($min-cell-width, 1fr));
      * ```
      *
      * This **needs to be a number with a unit**. Check out the documentation on
      * the `minmax` css function for some more info.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/minmax
      */
    var minCellWidth: js.UndefOr[`min-content` | `max-content` | auto | String] = js.undefined
    
    /**
      * This is really just a pass-through of the `style` prop that allows you to
      * quickly update the base padding for the grid.
      */
    var padding: js.UndefOr[Double | String] = js.undefined
    
    /**
      * An optional number of columns to display for phones.
      */
    var phoneColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional number of columns to display for tablets.
      */
    var tabletColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the `children` should be updated to be wrapped in the `GridCell`
      * component.  This is really just a convenience prop so you don't always need
      * to import both the `Grid` and `GridCell` components to create a grid/
      */
    var wrapOnly: js.UndefOr[Boolean] = js.undefined
  }
  object GridProps {
    
    @scala.inline
    def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloneStyles(value: Boolean): Self = StObject.set(x, "cloneStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneStylesUndefined: Self = StObject.set(x, "cloneStyles", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setDesktopColumns(value: Double): Self = StObject.set(x, "desktopColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopColumnsUndefined: Self = StObject.set(x, "desktopColumns", js.undefined)
      
      @scala.inline
      def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setLargeDesktopColumns(value: Double): Self = StObject.set(x, "largeDesktopColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeDesktopColumnsUndefined: Self = StObject.set(x, "largeDesktopColumns", js.undefined)
      
      @scala.inline
      def setMinCellWidth(value: `min-content` | `max-content` | auto | String): Self = StObject.set(x, "minCellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCellWidthUndefined: Self = StObject.set(x, "minCellWidth", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPhoneColumns(value: Double): Self = StObject.set(x, "phoneColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneColumnsUndefined: Self = StObject.set(x, "phoneColumns", js.undefined)
      
      @scala.inline
      def setTabletColumns(value: Double): Self = StObject.set(x, "tabletColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletColumnsUndefined: Self = StObject.set(x, "tabletColumns", js.undefined)
      
      @scala.inline
      def setWrapOnly(value: Boolean): Self = StObject.set(x, "wrapOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapOnlyUndefined: Self = StObject.set(x, "wrapOnly", js.undefined)
    }
  }
}

package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutGridCellMod {
  
  @JSImport("@react-md/utils/types/layout/GridCell", "GridCell")
  @js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait GridCSSProperties extends StObject {
    
    /**
      * The column that the cell should stop at. When this is `undefined`, it will
      * just appear in normal order within the grid and span only 1 column. If the
      * `colSpan` property was provided, this will be ignored.
      */
    var colEnd: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The number of columns that the cell should span. If this value is provided,
      * it will be used instead of the `colEnd` property.
      *
      * Note: If this value is larger than the number of columns allowed in the
      * current grid, it will shrink all the other columns.
      */
    var colSpan: js.UndefOr[Double] = js.undefined
    
    /**
      * The column that the cell should start at. When this is `undefined`, it will
      * just appear in normal order within the grid.
      */
    var colStart: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The row that the cell should end at. This is a nice way to be able to
      * reorder cells within your grid but will be ignored if the `rowSpan`
      * property is provided.
      */
    var rowEnd: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The number of rows that a cell should span. If this value is provided, it
      * will be used instead of the `rowEnd` property. When this is `undefined`, it
      * will span 1 row as normal.
      */
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    /**
      * The row that the cell should start at. This is a nice way to be able to
      * reorder cells within your grid.
      */
    var rowStart: js.UndefOr[Double | String] = js.undefined
  }
  object GridCSSProperties {
    
    inline def apply(): GridCSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridCSSProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridCSSProperties] (val x: Self) extends AnyVal {
      
      inline def setColEnd(value: Double | String): Self = StObject.set(x, "colEnd", value.asInstanceOf[js.Any])
      
      inline def setColEndUndefined: Self = StObject.set(x, "colEnd", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColStart(value: Double | String): Self = StObject.set(x, "colStart", value.asInstanceOf[js.Any])
      
      inline def setColStartUndefined: Self = StObject.set(x, "colStart", js.undefined)
      
      inline def setRowEnd(value: Double | String): Self = StObject.set(x, "rowEnd", value.asInstanceOf[js.Any])
      
      inline def setRowEndUndefined: Self = StObject.set(x, "rowEnd", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRowStart(value: Double | String): Self = StObject.set(x, "rowStart", value.asInstanceOf[js.Any])
      
      inline def setRowStartUndefined: Self = StObject.set(x, "rowStart", js.undefined)
    }
  }
  
  trait GridCellProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with GridCSSProperties {
    
    /**
      * Boolean if the className should be cloned into the child instead of
      * wrapping in another div. This will only work if the `children` is a single
      * ReactElement.
      */
    @JSName("clone")
    var clone_FGridCellProps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional Grid CSS Property overries that should be applied on desktop
      * screens.
      */
    var desktop: js.UndefOr[GridCSSProperties] = js.undefined
    
    /**
      * Optional Grid CSS Property overries that should be applied on large
      * desktops only.
      */
    var largeDesktop: js.UndefOr[GridCSSProperties] = js.undefined
    
    /**
      * Optional Grid CSS Property overries that should be applied on phones only.
      */
    var phone: js.UndefOr[GridCSSProperties] = js.undefined
    
    /**
      * Optional Grid CSS Property overries that should be applied on tablets and
      * above.
      */
    var tablet: js.UndefOr[GridCSSProperties] = js.undefined
  }
  object GridCellProps {
    
    inline def apply(): GridCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridCellProps] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setDesktop(value: GridCSSProperties): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setLargeDesktop(value: GridCSSProperties): Self = StObject.set(x, "largeDesktop", value.asInstanceOf[js.Any])
      
      inline def setLargeDesktopUndefined: Self = StObject.set(x, "largeDesktop", js.undefined)
      
      inline def setPhone(value: GridCSSProperties): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setTablet(value: GridCSSProperties): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    }
  }
}

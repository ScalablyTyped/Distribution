package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListCellMod {
  
  @JSImport("@react-md/utils/types/layout/GridListCell", "GridListCell")
  @js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait GridListCellProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the className should be cloned into the child instead of
      * wrapping in another div. This will only work if the `children` is a single
      * ReactElement.
      */
    @JSName("clone")
    var clone_FGridListCellProps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the cell should be square by also setting the current cell size
      * to the `height`.
      */
    var square: js.UndefOr[Boolean] = js.undefined
  }
  object GridListCellProps {
    
    @scala.inline
    def apply(): GridListCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListCellProps]
    }
    
    @scala.inline
    implicit class GridListCellPropsMutableBuilder[Self <: GridListCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
}

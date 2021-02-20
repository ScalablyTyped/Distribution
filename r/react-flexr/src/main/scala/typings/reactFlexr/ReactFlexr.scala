package typings.reactFlexr

import typings.react.mod.Component
import typings.react.mod.Props
import typings.reactFlexr.reactFlexrStrings.bottom
import typings.reactFlexr.reactFlexrStrings.center
import typings.reactFlexr.reactFlexrStrings.left
import typings.reactFlexr.reactFlexrStrings.right
import typings.reactFlexr.reactFlexrStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlexr {
  
  @js.native
  trait Cell
    extends Component[CellProps, js.Object, js.Any]
  
  @js.native
  trait CellProps extends Props[Cell] {
    
    /**
      * Vertical Align This Cell: top, center, bottom
      */
    var align: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * Like size, but only for desk devices.
      * Accepts 'hidden' as well.
      */
    var desk: js.UndefOr[String | Double] = js.native
    
    /**
      * Cell will be full height.
      */
    var flex: js.UndefOr[Boolean] = js.native
    
    /**
      * Override default gutter: '1em', '5%', '10px', etc.
      */
    var gutter: js.UndefOr[String] = js.native
    
    /**
      * Like size, but only for lap devices.
      * Accepts 'hidden' as well.
      */
    var lap: js.UndefOr[String | Double] = js.native
    
    /**
      * Like size, but only for palm devices.
      * Accepts 'hidden' as well.
      */
    var palm: js.UndefOr[String | Double] = js.native
    
    /**
      * Like size, but only for ( palm + lap ) devices.
      * Accepts 'hidden' as well.
      */
    var portable: js.UndefOr[String | Double] = js.native
    
    /**
      * Takes a fraction. e.g. 1/6
      */
    var size: js.UndefOr[String | Double] = js.native
  }
  object CellProps {
    
    @scala.inline
    def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setDesk(value: String | Double): Self = StObject.set(x, "desk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeskUndefined: Self = StObject.set(x, "desk", js.undefined)
      
      @scala.inline
      def setFlex(value: Boolean): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setLap(value: String | Double): Self = StObject.set(x, "lap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLapUndefined: Self = StObject.set(x, "lap", js.undefined)
      
      @scala.inline
      def setPalm(value: String | Double): Self = StObject.set(x, "palm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalmUndefined: Self = StObject.set(x, "palm", js.undefined)
      
      @scala.inline
      def setPortable(value: String | Double): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFlexr.reactFlexrStrings.palm
    - typings.reactFlexr.reactFlexrStrings.lap
    - typings.reactFlexr.reactFlexrStrings.portable
    - typings.reactFlexr.reactFlexrStrings.desk
  */
  trait ErgonomicType extends StObject
  object ErgonomicType {
    
    @scala.inline
    def desk: typings.reactFlexr.reactFlexrStrings.desk = "desk".asInstanceOf[typings.reactFlexr.reactFlexrStrings.desk]
    
    @scala.inline
    def lap: typings.reactFlexr.reactFlexrStrings.lap = "lap".asInstanceOf[typings.reactFlexr.reactFlexrStrings.lap]
    
    @scala.inline
    def palm: typings.reactFlexr.reactFlexrStrings.palm = "palm".asInstanceOf[typings.reactFlexr.reactFlexrStrings.palm]
    
    @scala.inline
    def portable: typings.reactFlexr.reactFlexrStrings.portable = "portable".asInstanceOf[typings.reactFlexr.reactFlexrStrings.portable]
  }
  
  @js.native
  trait Grid
    extends Component[GridProps, js.Object, js.Any]
  
  @js.native
  trait GridProps extends Props[Grid] {
    
    /**
      * Vertical Align Sub Cells: top, center, bottom
      */
    var align: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * All sub cells will be full height.
      */
    var flexCells: js.UndefOr[Boolean] = js.native
    
    /**
      * Override default gutter: '1em', '5%', '10px', etc.
      * Propagates downwards. Cells inside this Grid component
      * will use the same gutter.
      */
    var gutter: js.UndefOr[String] = js.native
    
    /**
      * Horizontal Align Sub Cells: left, center, right
      */
    var hAlign: js.UndefOr[left | center | right] = js.native
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
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setFlexCells(value: Boolean): Self = StObject.set(x, "flexCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexCellsUndefined: Self = StObject.set(x, "flexCells", js.undefined)
      
      @scala.inline
      def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setHAlign(value: left | center | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
    }
  }
  
  /**
    * Simple resize event throttler. Usefull for force updating when the
    * app have been resized. For best performance, use it in your main
    * app component in the componentDidMount life cycle.
    */
  @js.native
  trait OptimizedResize extends StObject {
    
    def init(callback: js.Function0[Unit]): Unit = js.native
  }
  object OptimizedResize {
    
    @scala.inline
    def apply(init: js.Function0[Unit] => Unit): OptimizedResize = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[OptimizedResize]
    }
    
    @scala.inline
    implicit class OptimizedResizeMutableBuilder[Self <: OptimizedResize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}

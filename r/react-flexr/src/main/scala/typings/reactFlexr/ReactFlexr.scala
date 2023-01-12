package typings.reactFlexr

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.reactFlexr.reactFlexrStrings.bottom
import typings.reactFlexr.reactFlexrStrings.center
import typings.reactFlexr.reactFlexrStrings.left
import typings.reactFlexr.reactFlexrStrings.right
import typings.reactFlexr.reactFlexrStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlexr {
  
  type Cell = Component[CellProps, js.Object, Any]
  
  trait CellProps extends StObject {
    
    /**
      * Vertical Align This Cell: top, center, bottom
      */
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Like size, but only for desk devices.
      * Accepts 'hidden' as well.
      */
    var desk: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Cell will be full height.
      */
    var flex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override default gutter: '1em', '5%', '10px', etc.
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    /**
      * Like size, but only for lap devices.
      * Accepts 'hidden' as well.
      */
    var lap: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Like size, but only for palm devices.
      * Accepts 'hidden' as well.
      */
    var palm: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Like size, but only for ( palm + lap ) devices.
      * Accepts 'hidden' as well.
      */
    var portable: js.UndefOr[String | Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Cell]] = js.undefined
    
    /**
      * Takes a fraction. e.g. 1/6
      */
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDesk(value: String | Double): Self = StObject.set(x, "desk", value.asInstanceOf[js.Any])
      
      inline def setDeskUndefined: Self = StObject.set(x, "desk", js.undefined)
      
      inline def setFlex(value: Boolean): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLap(value: String | Double): Self = StObject.set(x, "lap", value.asInstanceOf[js.Any])
      
      inline def setLapUndefined: Self = StObject.set(x, "lap", js.undefined)
      
      inline def setPalm(value: String | Double): Self = StObject.set(x, "palm", value.asInstanceOf[js.Any])
      
      inline def setPalmUndefined: Self = StObject.set(x, "palm", js.undefined)
      
      inline def setPortable(value: String | Double): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      inline def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      inline def setRef(value: LegacyRef[Cell]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Cell | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
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
    
    inline def desk: typings.reactFlexr.reactFlexrStrings.desk = "desk".asInstanceOf[typings.reactFlexr.reactFlexrStrings.desk]
    
    inline def lap: typings.reactFlexr.reactFlexrStrings.lap = "lap".asInstanceOf[typings.reactFlexr.reactFlexrStrings.lap]
    
    inline def palm: typings.reactFlexr.reactFlexrStrings.palm = "palm".asInstanceOf[typings.reactFlexr.reactFlexrStrings.palm]
    
    inline def portable: typings.reactFlexr.reactFlexrStrings.portable = "portable".asInstanceOf[typings.reactFlexr.reactFlexrStrings.portable]
  }
  
  type Grid = Component[GridProps, js.Object, Any]
  
  trait GridProps extends StObject {
    
    /**
      * Vertical Align Sub Cells: top, center, bottom
      */
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * All sub cells will be full height.
      */
    var flexCells: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override default gutter: '1em', '5%', '10px', etc.
      * Propagates downwards. Cells inside this Grid component
      * will use the same gutter.
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    /**
      * Horizontal Align Sub Cells: left, center, right
      */
    var hAlign: js.UndefOr[left | center | right] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Grid]] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFlexCells(value: Boolean): Self = StObject.set(x, "flexCells", value.asInstanceOf[js.Any])
      
      inline def setFlexCellsUndefined: Self = StObject.set(x, "flexCells", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHAlign(value: left | center | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setRef(value: LegacyRef[Grid]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Grid | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /**
    * Simple resize event throttler. Usefull for force updating when the
    * app have been resized. For best performance, use it in your main
    * app component in the componentDidMount life cycle.
    */
  trait OptimizedResize extends StObject {
    
    def init(callback: js.Function0[Unit]): Unit
  }
  object OptimizedResize {
    
    inline def apply(init: js.Function0[Unit] => Unit): OptimizedResize = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[OptimizedResize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptimizedResize] (val x: Self) extends AnyVal {
      
      inline def setInit(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}

package typings.reactCalendar

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.Count
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTileGroupMod {
  
  object default {
    
    inline def apply[T /* <: ElementType[Any] */](param0: TileGroupProps[T]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/TileGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.count")
      @js.native
      def count: Requireable[Double] = js.native
      inline def count_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.dateTransform")
      @js.native
      def dateTransform: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def dateTransform_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTransform")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.dateType")
      @js.native
      def dateType: Requireable[String] = js.native
      inline def dateType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateType")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.end")
      @js.native
      def end: Validator[Double] = js.native
      inline def end_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.hover")
      @js.native
      def hover: Requireable[js.Date] = js.native
      inline def hover_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.maxDate")
      @js.native
      def maxDate: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def maxDate_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.minDate")
      @js.native
      def minDate: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def minDate_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.offset")
      @js.native
      def offset: Requireable[Double] = js.native
      inline def offset_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.onMouseOver")
      @js.native
      def onMouseOver: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseOver_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.start")
      @js.native
      def start: Validator[Double] = js.native
      inline def start_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.step")
      @js.native
      def step: Requireable[Double] = js.native
      inline def step_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.tile")
      @js.native
      def tile: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.tileClassName")
      @js.native
      def tileClassName: Requireable[
            NonNullable[
              js.UndefOr[
                (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
              ]
            ]
          ] = js.native
      inline def tileClassName_=(
        x: Requireable[
              NonNullable[
                js.UndefOr[
                  (js.Function1[/* repeated */ Any, Any]) | (NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]) | Null
                ]
              ]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.tileContent")
      @js.native
      def tileContent: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def tileContent_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(x.asInstanceOf[js.Any])
      
      inline def tile_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tile")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]] = js.native
      
      @JSImport("react-calendar/dist/cjs/TileGroup", "default.propTypes.valueType")
      @js.native
      def valueType: Requireable[String] = js.native
      inline def valueType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueType")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[js.Date | (js.Array[js.UndefOr[js.Date | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  type TileGroupProps[T /* <: ElementType[Any] */] = Count[T] & ComponentProps[T]
}

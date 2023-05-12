package typings.reactCalendar

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.reactCalendarStrings.column
import typings.reactCalendar.reactCalendarStrings.row
import typings.std.HTMLDivElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsFlexMod {
  
  object default {
    
    inline def apply(param0: FlexProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/Flex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.count")
      @js.native
      def count: Validator[Double] = js.native
      inline def count_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.direction")
      @js.native
      def direction: Requireable[String] = js.native
      inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.offset")
      @js.native
      def offset: Requireable[Double] = js.native
      inline def offset_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.style")
      @js.native
      def style: Requireable[
            StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
          ] = js.native
      inline def style_=(
        x: Requireable[
              StringDictionary[js.UndefOr[(NonNullable[js.UndefOr[String | Double | Null]]) | Null]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Flex", "default.propTypes.wrap")
      @js.native
      def wrap: Requireable[Boolean] = js.native
      inline def wrap_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrap")(x.asInstanceOf[js.Any])
    }
  }
  
  trait FlexProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    @JSName("children")
    var children_FlexProps: js.Array[ReactElement]
    
    var count: Double
    
    var direction: js.UndefOr[row | column] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object FlexProps {
    
    inline def apply(children: js.Array[ReactElement], count: Double): FlexProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlexProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}

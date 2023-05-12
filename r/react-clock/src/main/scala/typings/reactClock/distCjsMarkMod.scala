package typings.reactClock

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactClock.distCjsSharedTypesMod.MarkLength
import typings.reactClock.distCjsSharedTypesMod.MarkWidth
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMarkMod {
  
  object default {
    
    inline def apply(param0: MarkProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-clock/dist/cjs/Mark", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-clock/dist/cjs/Mark", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-clock/dist/cjs/Mark", "default.propTypes.angle")
      @js.native
      def angle: Requireable[Double] = js.native
      inline def angle_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angle")(x.asInstanceOf[js.Any])
      
      inline def length(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Mark", "default.propTypes.name")
      @js.native
      def name: Validator[String] = js.native
      inline def name_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Mark", "default.propTypes.number")
      @js.native
      def number: Requireable[ReactNodeLike] = js.native
      inline def number_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/Mark", "default.propTypes.width")
      @js.native
      def width: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def width_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  trait MarkProps extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[MarkLength] = js.undefined
    
    var name: String
    
    var number: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[MarkWidth] = js.undefined
  }
  object MarkProps {
    
    inline def apply(name: String): MarkProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkProps] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setLength(value: MarkLength): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: ReactNode): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setWidth(value: MarkWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

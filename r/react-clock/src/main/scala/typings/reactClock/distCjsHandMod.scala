package typings.reactClock

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactClock.distCjsSharedTypesMod.HandLength
import typings.reactClock.distCjsSharedTypesMod.HandWidth
import typings.reactClock.distCjsSharedTypesMod.OppositeHandLength
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsHandMod {
  
  object default {
    
    inline def apply(param0: HandProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-clock/dist/cjs/Hand", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-clock/dist/cjs/Hand", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-clock/dist/cjs/Hand", "default.propTypes.angle")
      @js.native
      def angle: Requireable[Double] = js.native
      inline def angle_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angle")(x.asInstanceOf[js.Any])
      
      inline def length(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Hand", "default.propTypes.name")
      @js.native
      def name: Validator[String] = js.native
      inline def name_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def oppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("oppositeLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-clock/dist/cjs/Hand", "default.propTypes.width")
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
  
  trait HandProps extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[HandLength] = js.undefined
    
    var name: String
    
    var oppositeLength: js.UndefOr[OppositeHandLength] = js.undefined
    
    var width: js.UndefOr[HandWidth] = js.undefined
  }
  object HandProps {
    
    inline def apply(name: String): HandProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandProps] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setLength(value: HandLength): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOppositeLength(value: OppositeHandLength): Self = StObject.set(x, "oppositeLength", value.asInstanceOf[js.Any])
      
      inline def setOppositeLengthUndefined: Self = StObject.set(x, "oppositeLength", js.undefined)
      
      inline def setWidth(value: HandWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

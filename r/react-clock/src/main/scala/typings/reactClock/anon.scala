package typings.reactClock

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactClock.distCjsMarkMod.MarkProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Angle extends StObject {
    
    var angle: Requireable[Double]
    
    def length(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var name: Validator[String]
    
    var number: Requireable[ReactNodeLike]
  }
  object Angle {
    
    inline def apply(
      angle: Requireable[Double],
      length: (Record[String, Any], String, String) => js.Error | Null,
      name: Validator[String],
      number: Requireable[ReactNodeLike]
    ): Angle = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], length = js.Any.fromFunction3(length), name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Angle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Requireable[Double]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "length", js.Any.fromFunction3(value))
      
      inline def setName(value: Validator[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatHour extends StObject {
    
    var formatHour: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* hour */ Double, String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
  }
  object FormatHour {
    
    inline def apply(): FormatHour = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatHour]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatHour] (val x: Self) extends AnyVal {
      
      inline def setFormatHour(value: (/* locale */ js.UndefOr[String], /* hour */ Double) => String): Self = StObject.set(x, "formatHour", js.Any.fromFunction2(value))
      
      inline def setFormatHourUndefined: Self = StObject.set(x, "formatHour", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  @js.native
  trait TypeofMark extends StObject {
    
    def apply(param0: MarkProps): Element = js.native
    
    var propTypes: Angle = js.native
  }
}

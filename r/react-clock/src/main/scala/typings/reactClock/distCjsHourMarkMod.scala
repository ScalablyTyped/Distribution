package typings.reactClock

import typings.propTypes.mod.Requireable
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactClock.anon.FormatHour
import typings.reactClock.anon.TypeofMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsHourMarkMod {
  
  object default {
    
    inline def apply(param0: HourMarkProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-clock/dist/cjs/HourMark", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-clock/dist/cjs/HourMark", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-clock/dist/cjs/HourMark", "default.propTypes.formatHour")
      @js.native
      def formatHour: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatHour_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatHour")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/HourMark", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-clock/dist/cjs/HourMark", "default.propTypes.number")
      @js.native
      def number: Requireable[Double] = js.native
      inline def number_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    }
  }
  
  type HourMarkProps = ComponentProps[TypeofMark] & FormatHour
}

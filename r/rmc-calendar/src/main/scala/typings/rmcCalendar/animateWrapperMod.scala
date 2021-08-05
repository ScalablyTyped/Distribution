package typings.rmcCalendar

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateWrapperMod {
  
  @JSImport("rmc-calendar/lib/calendar/AnimateWrapper", JSImport.Default)
  @js.native
  class default () extends AnimateWrapper
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/calendar/AnimateWrapper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/calendar/AnimateWrapper", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AnimateWrapper
    extends PureComponent[PropsType, js.Object, js.Any]
  
  trait PropsType extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var displayType: js.UndefOr[String] = js.undefined
    
    var visible: Boolean
  }
  object PropsType {
    
    inline def apply(visible: Boolean): PropsType = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplayType(value: String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}

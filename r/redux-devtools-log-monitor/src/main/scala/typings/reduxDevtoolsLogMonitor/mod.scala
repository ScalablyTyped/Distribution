package typings.reduxDevtoolsLogMonitor

import typings.base16.mod.Base16Theme
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools-log-monitor", JSImport.Default)
  @js.native
  class default ()
    extends Component[ILogMonitorProps, js.Object, js.Any]
  
  trait ILogMonitorProps extends StObject {
    
    /**
      * When true, displays the action object expanded rather than collapsed.
      *
      * @default true
      */
    var expandActionRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, displays the state object expanded rather than collapsed.
      *
      * @default true
      */
    var expandStateRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, records the current scroll top every second so it
      * can be restored on refresh. This only has effect when used together
      * with persistState() enhancer from Redux DevTools.
      *
      * @default true
      */
    var preserveScrollTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that selects the slice of the state for DevTools to show.
      *
      * @example state => state.thePart.iCare.about.
      * @default state => state.
      */
    var select: js.UndefOr[js.Function1[/* state */ js.Any, js.Any]] = js.undefined
    
    /**
      * Either a string referring to one of the themes provided by
      * redux-devtools-themes or a custom object of the same format.
      *
      * @see https://github.com/gaearon/redux-devtools-themes
      */
    var theme: js.UndefOr[String | Base16Theme] = js.undefined
  }
  object ILogMonitorProps {
    
    inline def apply(): ILogMonitorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILogMonitorProps]
    }
    
    extension [Self <: ILogMonitorProps](x: Self) {
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRootUndefined: Self = StObject.set(x, "expandActionRoot", js.undefined)
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRootUndefined: Self = StObject.set(x, "expandStateRoot", js.undefined)
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTopUndefined: Self = StObject.set(x, "preserveScrollTop", js.undefined)
      
      inline def setSelect(value: /* state */ js.Any => js.Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTheme(value: String | Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type LogMonitor = Component[ILogMonitorProps, js.Object, js.Any]
}

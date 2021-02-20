package typings.reduxDevtoolsLogMonitor

import typings.base16.mod.Base16Theme
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools-log-monitor", JSImport.Default)
  @js.native
  class default ()
    extends Component[ILogMonitorProps, js.Object, js.Any]
  
  @js.native
  trait ILogMonitorProps extends StObject {
    
    /**
      * When true, displays the action object expanded rather than collapsed.
      *
      * @default true
      */
    var expandActionRoot: js.UndefOr[Boolean] = js.native
    
    /**
      * When true, displays the state object expanded rather than collapsed.
      *
      * @default true
      */
    var expandStateRoot: js.UndefOr[Boolean] = js.native
    
    /**
      * When true, records the current scroll top every second so it
      * can be restored on refresh. This only has effect when used together
      * with persistState() enhancer from Redux DevTools.
      *
      * @default true
      */
    var preserveScrollTop: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that selects the slice of the state for DevTools to show.
      *
      * @example state => state.thePart.iCare.about.
      * @default state => state.
      */
    var select: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
    
    /**
      * Either a string referring to one of the themes provided by
      * redux-devtools-themes or a custom object of the same format.
      *
      * @see https://github.com/gaearon/redux-devtools-themes
      */
    var theme: js.UndefOr[String | Base16Theme] = js.native
  }
  object ILogMonitorProps {
    
    @scala.inline
    def apply(): ILogMonitorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILogMonitorProps]
    }
    
    @scala.inline
    implicit class ILogMonitorPropsMutableBuilder[Self <: ILogMonitorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandActionRootUndefined: Self = StObject.set(x, "expandActionRoot", js.undefined)
      
      @scala.inline
      def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandStateRootUndefined: Self = StObject.set(x, "expandStateRoot", js.undefined)
      
      @scala.inline
      def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveScrollTopUndefined: Self = StObject.set(x, "preserveScrollTop", js.undefined)
      
      @scala.inline
      def setSelect(value: /* state */ js.Any => _): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setTheme(value: String | Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type LogMonitor = Component[ILogMonitorProps, js.Object, js.Any]
}

package typings.reduxDevtoolsLogMonitor

import typings.base16.mod.Base16Theme
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorButtonMod {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorButton", JSImport.Default)
  @js.native
  open class default () extends LogMonitorButton
  
  @js.native
  trait LogMonitorButton extends PureComponent[Props, State, Any] {
    
    def handleMouseDown(): Unit = js.native
    
    def handleMouseEnter(): Unit = js.native
    
    def handleMouseLeave(): Unit = js.native
    
    def handleMouseUp(): Unit = js.native
    
    def onClick(): Unit = js.native
  }
  
  trait Props extends StObject {
    
    var enabled: Boolean
    
    def onClick(): Unit
    
    var theme: Base16Theme
  }
  object Props {
    
    inline def apply(enabled: Boolean, onClick: () => Unit, theme: Base16Theme): Props = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setTheme(value: Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var active: Boolean
    
    var hovered: Boolean
  }
  object State {
    
    inline def apply(active: Boolean, hovered: Boolean): State = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    }
  }
}

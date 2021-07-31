package typings.reachAlert

import org.scalablytyped.runtime.Shortcut
import typings.reachAlert.reachAlertStrings.assertive
import typings.reachAlert.reachAlertStrings.polite
import typings.react.mod.FC
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@reach/alert", JSImport.Default)
  @js.native
  val default: FC[AlertProps] = js.native
  
  trait AlertProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    @JSName("type")
    var type_AlertProps: js.UndefOr[assertive | polite] = js.undefined
  }
  object AlertProps {
    
    @scala.inline
    def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    @scala.inline
    implicit class AlertPropsMutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: assertive | polite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FC[AlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[AlertProps] = default
}

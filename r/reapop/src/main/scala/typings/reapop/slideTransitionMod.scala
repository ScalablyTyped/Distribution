package typings.reapop

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideTransitionMod {
  
  @JSImport("reapop/dist/components/SlideTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
    var children: ReactNode
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var notification: Notification
  }
  object Props {
    
    inline def apply(notification: Notification): Props = {
      val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}

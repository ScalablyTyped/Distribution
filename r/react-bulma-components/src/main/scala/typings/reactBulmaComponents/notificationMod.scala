package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.Color
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/notification", JSImport.Default)
  @js.native
  val default: BulmaComponent[NotificationProps, div] = js.native
  
  trait NotificationProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    }
  }
  
  type _To = BulmaComponent[NotificationProps, div]
  
  /* This means you don't have to write `default`, but can instead just say `notificationMod.foo` */
  override def _to: BulmaComponent[NotificationProps, div] = default
}

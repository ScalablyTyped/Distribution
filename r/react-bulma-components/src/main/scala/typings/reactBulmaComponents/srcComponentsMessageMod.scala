package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Header
import typings.reactBulmaComponents.reactBulmaComponentsStrings.article
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsMessageMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/message", JSImport.Default)
  @js.native
  val default: (BulmaComponent[MessageProps, article]) & Header = js.native
  
  trait MessageProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object MessageProps {
    
    inline def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
    
    extension [Self <: MessageProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[MessageProps, article]) & Header
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsMessageMod.foo` */
  override def _to: (BulmaComponent[MessageProps, article]) & Header = default
}

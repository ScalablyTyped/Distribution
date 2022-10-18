package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Text
import typings.reactBulmaComponents.reactBulmaComponentsStrings.auto
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsIconMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/icon", JSImport.Default)
  @js.native
  val default: (BulmaComponent[IconProps, span]) & Text = js.native
  
  trait IconProps extends StObject {
    
    var align: js.UndefOr[left | right] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Size | auto] = js.undefined
    
    var text: js.UndefOr[Boolean] = js.undefined
  }
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSize(value: Size | auto): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[IconProps, span]) & Text
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsIconMod.foo` */
  override def _to: (BulmaComponent[IconProps, span]) & Text = default
}

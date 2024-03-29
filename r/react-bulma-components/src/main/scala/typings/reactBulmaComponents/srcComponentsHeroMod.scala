package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Footer
import typings.reactBulmaComponents.reactBulmaComponentsStrings.fullheight
import typings.reactBulmaComponents.reactBulmaComponentsStrings.halfheight
import typings.reactBulmaComponents.reactBulmaComponentsStrings.section
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsHeroMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/hero", JSImport.Default)
  @js.native
  val default: (BulmaComponent[HeroProps, section]) & Footer = js.native
  
  trait HeroProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var gradient: js.UndefOr[Boolean] = js.undefined
    
    var hasNavbar: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size | halfheight | fullheight] = js.undefined
  }
  object HeroProps {
    
    inline def apply(): HeroProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeroProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeroProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGradient(value: Boolean): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setHasNavbar(value: Boolean): Self = StObject.set(x, "hasNavbar", value.asInstanceOf[js.Any])
      
      inline def setHasNavbarUndefined: Self = StObject.set(x, "hasNavbar", js.undefined)
      
      inline def setSize(value: Size | halfheight | fullheight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[HeroProps, section]) & Footer
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsHeroMod.foo` */
  override def _to: (BulmaComponent[HeroProps, section]) & Footer = default
}

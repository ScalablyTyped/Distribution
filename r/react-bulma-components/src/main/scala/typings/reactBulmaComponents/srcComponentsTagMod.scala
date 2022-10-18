package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.GroupBulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.Size
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTagMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/tag", JSImport.Default)
  @js.native
  val default: (BulmaComponent[TagProps, span]) & GroupBulmaComponentWithoutRenderAs = js.native
  
  trait TagGroupProps extends StObject {
    
    /**
      * @deprecated This prop was renamed to hasAddons to match bulma specs
      */
    var gapless: js.UndefOr[Boolean] = js.undefined
    
    var hasAddons: js.UndefOr[Boolean] = js.undefined
  }
  object TagGroupProps {
    
    inline def apply(): TagGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagGroupProps]
    }
    
    extension [Self <: TagGroupProps](x: Self) {
      
      inline def setGapless(value: Boolean): Self = StObject.set(x, "gapless", value.asInstanceOf[js.Any])
      
      inline def setGaplessUndefined: Self = StObject.set(x, "gapless", js.undefined)
      
      inline def setHasAddons(value: Boolean): Self = StObject.set(x, "hasAddons", value.asInstanceOf[js.Any])
      
      inline def setHasAddonsUndefined: Self = StObject.set(x, "hasAddons", js.undefined)
    }
  }
  
  trait TagProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var remove: js.UndefOr[Boolean] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Exclude[Size, small]] = js.undefined
  }
  object TagProps {
    
    inline def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setSize(value: Exclude[Size, small]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[TagProps, span]) & GroupBulmaComponentWithoutRenderAs
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsTagMod.foo` */
  override def _to: (BulmaComponent[TagProps, span]) & GroupBulmaComponentWithoutRenderAs = default
}

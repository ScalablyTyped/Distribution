package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.reactBulmaComponentsInts.`1`
import typings.reactBulmaComponents.reactBulmaComponentsInts.`2`
import typings.reactBulmaComponents.reactBulmaComponentsInts.`3`
import typings.reactBulmaComponents.reactBulmaComponentsInts.`4`
import typings.reactBulmaComponents.reactBulmaComponentsInts.`5`
import typings.reactBulmaComponents.reactBulmaComponentsInts.`6`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.h1
import typings.reactBulmaComponents.reactBulmaComponentsStrings.light
import typings.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typings.reactBulmaComponents.reactBulmaComponentsStrings.semibold
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsHeadingMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/heading", JSImport.Default)
  @js.native
  val default: BulmaComponent[HeadingProps, h1] = js.native
  
  trait HeadingProps extends StObject {
    
    var heading: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var spaced: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[Boolean] = js.undefined
    
    var weight: js.UndefOr[light | normal | semibold | bold] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setHeading(value: Boolean): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setSize(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpaced(value: Boolean): Self = StObject.set(x, "spaced", value.asInstanceOf[js.Any])
      
      inline def setSpacedUndefined: Self = StObject.set(x, "spaced", js.undefined)
      
      inline def setSubtitle(value: Boolean): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setWeight(value: light | normal | semibold | bold): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type _To = BulmaComponent[HeadingProps, h1]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsHeadingMod.foo` */
  override def _to: BulmaComponent[HeadingProps, h1] = default
}

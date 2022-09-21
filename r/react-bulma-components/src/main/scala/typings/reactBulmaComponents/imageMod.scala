package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.componentsMod.BulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`128`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`16`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`24`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`32`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`48`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`64`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`96`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`16by9`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`1by1`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`1by2`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`1by3`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`2by1`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`2by3`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`3by1`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`3by2`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`3by4`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`3by5`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`4by3`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`4by5`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`5by3`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`5by4`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`9by16`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.figure
import typings.reactBulmaComponents.reactBulmaComponentsStrings.square
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/image", JSImport.Default)
  @js.native
  val default: BulmaComponentWithoutRenderAs[ImageProps, figure] = js.native
  
  trait ImageProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var fallback: js.UndefOr[String] = js.undefined
    
    var fullwidth: js.UndefOr[Boolean] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[
        `16` | `24` | `32` | `48` | `64` | `96` | `128` | square | `1by1` | `4by3` | `3by2` | `16by9` | `2by1` | `5by4` | `5by3` | `3by1` | `4by5` | `3by4` | `2by3` | `3by5` | `9by16` | `1by2` | `1by3` | String | Number
      ] = js.undefined
    
    var src: String
  }
  object ImageProps {
    
    inline def apply(src: String): ImageProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFullwidth(value: Boolean): Self = StObject.set(x, "fullwidth", value.asInstanceOf[js.Any])
      
      inline def setFullwidthUndefined: Self = StObject.set(x, "fullwidth", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setSize(
        value: `16` | `24` | `32` | `48` | `64` | `96` | `128` | square | `1by1` | `4by3` | `3by2` | `16by9` | `2by1` | `5by4` | `5by3` | `3by1` | `4by5` | `3by4` | `2by3` | `3by5` | `9by16` | `1by2` | `1by3` | String | Number
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = BulmaComponentWithoutRenderAs[ImageProps, figure]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: BulmaComponentWithoutRenderAs[ImageProps, figure] = default
}

package typings.storybookComponents

import org.scalablytyped.runtime.Shortcut
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod extends Shortcut {
  
  @JSImport("@storybook/components/dist/icon/svg", JSImport.Default)
  @js.native
  val default: StyledComponent[SVGProps[SVGSVGElement], SvgProps, Theme] = js.native
  
  trait SvgProps extends StObject {
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
  }
  object SvgProps {
    
    inline def apply(): SvgProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgProps]
    }
    
    extension [Self <: SvgProps](x: Self) {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    }
  }
  
  type _To = StyledComponent[SVGProps[SVGSVGElement], SvgProps, Theme]
  
  /* This means you don't have to write `default`, but can instead just say `svgMod.foo` */
  override def _to: StyledComponent[SVGProps[SVGSVGElement], SvgProps, Theme] = default
}

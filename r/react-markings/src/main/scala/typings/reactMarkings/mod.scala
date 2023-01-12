package typings.reactMarkings

import typings.react.mod.ReactElement
import typings.reactMarkings.anon.PartialRenderers
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(strings: (TemplateStringsArray | ReactElement)*): ReactElement = ^.asInstanceOf[js.Dynamic].apply(strings.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReactElement]
  
  @JSImport("react-markings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customize(opts: Options): Markings = ^.asInstanceOf[js.Dynamic].applyDynamic("customize")(opts.asInstanceOf[js.Any]).asInstanceOf[Markings]
  
  type CodeBlockProps = typings.commonmarkReactRenderer.mod.CodeBlockProps
  
  type CodeProps = typings.commonmarkReactRenderer.mod.CodeProps
  
  type CommonProps = typings.commonmarkReactRenderer.mod.CommonProps
  
  type HeadingProps = typings.commonmarkReactRenderer.mod.HeadingProps
  
  type HtmlInlineBlockProps = typings.commonmarkReactRenderer.mod.HtmlInlineBlockProps
  
  type ImageProps = typings.commonmarkReactRenderer.mod.ImageProps
  
  type LinkProps = typings.commonmarkReactRenderer.mod.LinkProps
  
  type ListProps = typings.commonmarkReactRenderer.mod.ListProps
  
  @js.native
  trait Markings extends StObject {
    
    def apply(strings: (TemplateStringsArray | ReactElement)*): ReactElement = js.native
  }
  
  trait Options extends StObject {
    
    var renderers: js.UndefOr[PartialRenderers] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setRenderers(value: PartialRenderers): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      inline def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
    }
  }
  
  type Renderers = typings.commonmarkReactRenderer.mod.Renderers
  
  type SoftBreakProps = typings.commonmarkReactRenderer.mod.SoftBreakProps
}

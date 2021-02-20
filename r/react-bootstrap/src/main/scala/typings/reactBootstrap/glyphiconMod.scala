package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glyphiconMod {
  
  @JSImport("react-bootstrap/lib/Glyphicon", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[GlyphiconProps, js.Object, js.Any]
  
  @js.native
  trait Glyphicon
    extends Component[GlyphiconProps, js.Object, js.Any]
  
  @js.native
  trait GlyphiconProps extends HTMLProps[Glyphicon] {
    
    // Optional
    var bsClass: js.UndefOr[String] = js.native
    
    // Required
    var glyph: String = js.native
  }
  object GlyphiconProps {
    
    @scala.inline
    def apply(glyph: String): GlyphiconProps = {
      val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphiconProps]
    }
    
    @scala.inline
    implicit class GlyphiconPropsMutableBuilder[Self <: GlyphiconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    }
  }
}

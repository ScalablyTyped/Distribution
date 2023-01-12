package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGlyphiconMod {
  
  @JSImport("react-bootstrap/lib/Glyphicon", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[GlyphiconProps, js.Object, Any]
  
  type Glyphicon = Component[GlyphiconProps, js.Object, Any]
  
  trait GlyphiconProps
    extends StObject
       with HTMLProps[Glyphicon] {
    
    // Optional
    var bsClass: js.UndefOr[String] = js.undefined
    
    // Required
    var glyph: String
  }
  object GlyphiconProps {
    
    inline def apply(glyph: String): GlyphiconProps = {
      val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphiconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlyphiconProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    }
  }
}

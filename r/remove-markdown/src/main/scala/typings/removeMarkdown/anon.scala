package typings.removeMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Gfm extends StObject {
    
    var gfm: js.UndefOr[Boolean] = js.undefined
    
    var listUnicodeChar: js.UndefOr[String] = js.undefined
    
    var stripListLeaders: js.UndefOr[Boolean] = js.undefined
    
    var useImgAltText: js.UndefOr[Boolean] = js.undefined
  }
  object Gfm {
    
    inline def apply(): Gfm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gfm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Gfm] (val x: Self) extends AnyVal {
      
      inline def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
      
      inline def setListUnicodeChar(value: String): Self = StObject.set(x, "listUnicodeChar", value.asInstanceOf[js.Any])
      
      inline def setListUnicodeCharUndefined: Self = StObject.set(x, "listUnicodeChar", js.undefined)
      
      inline def setStripListLeaders(value: Boolean): Self = StObject.set(x, "stripListLeaders", value.asInstanceOf[js.Any])
      
      inline def setStripListLeadersUndefined: Self = StObject.set(x, "stripListLeaders", js.undefined)
      
      inline def setUseImgAltText(value: Boolean): Self = StObject.set(x, "useImgAltText", value.asInstanceOf[js.Any])
      
      inline def setUseImgAltTextUndefined: Self = StObject.set(x, "useImgAltText", js.undefined)
    }
  }
}

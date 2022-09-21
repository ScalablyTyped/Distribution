package typings.stringTrimSpacesOnly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<string-trim-spaces-only.string-trim-spaces-only.Opts> */
  trait PartialOpts extends StObject {
    
    var classicTrim: js.UndefOr[Boolean] = js.undefined
    
    var cr: js.UndefOr[Boolean] = js.undefined
    
    var lf: js.UndefOr[Boolean] = js.undefined
    
    var nbsp: js.UndefOr[Boolean] = js.undefined
    
    var space: js.UndefOr[Boolean] = js.undefined
    
    var tab: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOpts {
    
    inline def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    extension [Self <: PartialOpts](x: Self) {
      
      inline def setClassicTrim(value: Boolean): Self = StObject.set(x, "classicTrim", value.asInstanceOf[js.Any])
      
      inline def setClassicTrimUndefined: Self = StObject.set(x, "classicTrim", js.undefined)
      
      inline def setCr(value: Boolean): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
      
      inline def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
      
      inline def setLf(value: Boolean): Self = StObject.set(x, "lf", value.asInstanceOf[js.Any])
      
      inline def setLfUndefined: Self = StObject.set(x, "lf", js.undefined)
      
      inline def setNbsp(value: Boolean): Self = StObject.set(x, "nbsp", value.asInstanceOf[js.Any])
      
      inline def setNbspUndefined: Self = StObject.set(x, "nbsp", js.undefined)
      
      inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setTab(value: Boolean): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
}

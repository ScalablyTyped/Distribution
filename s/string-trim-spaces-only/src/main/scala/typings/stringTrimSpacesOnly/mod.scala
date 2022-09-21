package typings.stringTrimSpacesOnly

import typings.stringTrimSpacesOnly.anon.PartialOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-trim-spaces-only", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("string-trim-spaces-only", "defaults")
  @js.native
  val defaults: Opts = js.native
  
  inline def trimSpaces(str: String): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("trimSpaces")(str.asInstanceOf[js.Any]).asInstanceOf[Res]
  inline def trimSpaces(str: String, opts: PartialOpts): Res = (^.asInstanceOf[js.Dynamic].applyDynamic("trimSpaces")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Res]
  
  @JSImport("string-trim-spaces-only", "version")
  @js.native
  val version: String = js.native
  
  trait Opts extends StObject {
    
    var classicTrim: Boolean
    
    var cr: Boolean
    
    var lf: Boolean
    
    var nbsp: Boolean
    
    var space: Boolean
    
    var tab: Boolean
  }
  object Opts {
    
    inline def apply(classicTrim: Boolean, cr: Boolean, lf: Boolean, nbsp: Boolean, space: Boolean, tab: Boolean): Opts = {
      val __obj = js.Dynamic.literal(classicTrim = classicTrim.asInstanceOf[js.Any], cr = cr.asInstanceOf[js.Any], lf = lf.asInstanceOf[js.Any], nbsp = nbsp.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setClassicTrim(value: Boolean): Self = StObject.set(x, "classicTrim", value.asInstanceOf[js.Any])
      
      inline def setCr(value: Boolean): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
      
      inline def setLf(value: Boolean): Self = StObject.set(x, "lf", value.asInstanceOf[js.Any])
      
      inline def setNbsp(value: Boolean): Self = StObject.set(x, "nbsp", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setTab(value: Boolean): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  type Range = (js.Tuple2[/* from */ Double, /* to */ Double]) | (js.Tuple3[/* from */ Double, /* to */ Double, /* whatToInsert */ js.UndefOr[String | Null]])
  
  type Ranges = js.Array[Range] | Null
  
  trait Res extends StObject {
    
    var ranges: Ranges
    
    var res: String
  }
  object Res {
    
    inline def apply(res: String): Res = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], ranges = null)
      __obj.asInstanceOf[Res]
    }
    
    extension [Self <: Res](x: Self) {
      
      inline def setRanges(value: Ranges): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesNull: Self = StObject.set(x, "ranges", null)
      
      inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}

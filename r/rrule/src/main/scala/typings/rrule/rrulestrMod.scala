package typings.rrule

import typings.rrule.anon.Dtstart
import typings.rrule.anon.PartialRRuleStrOptions
import typings.rrule.rruleMod.default
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rrulestrMod {
  
  @JSImport("rrule/dist/esm/src/rrulestr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseInput(s: String, options: PartialRRuleStrOptions): Dtstart = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInput")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dtstart]
  
  inline def rrulestr(s: String): default | typings.rrule.rrulesetMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any]).asInstanceOf[default | typings.rrule.rrulesetMod.default]
  inline def rrulestr(s: String, options: PartialRRuleStrOptions): default | typings.rrule.rrulesetMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[default | typings.rrule.rrulesetMod.default]
  
  trait RRuleStrOptions extends StObject {
    
    var cache: Boolean
    
    var compatible: Boolean
    
    var dtstart: Date | Null
    
    var forceset: Boolean
    
    var tzid: String | Null
    
    var unfold: Boolean
  }
  object RRuleStrOptions {
    
    inline def apply(cache: Boolean, compatible: Boolean, forceset: Boolean, unfold: Boolean): RRuleStrOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], compatible = compatible.asInstanceOf[js.Any], forceset = forceset.asInstanceOf[js.Any], unfold = unfold.asInstanceOf[js.Any], dtstart = null, tzid = null)
      __obj.asInstanceOf[RRuleStrOptions]
    }
    
    extension [Self <: RRuleStrOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
      
      inline def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      inline def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      inline def setForceset(value: Boolean): Self = StObject.set(x, "forceset", value.asInstanceOf[js.Any])
      
      inline def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      inline def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      inline def setUnfold(value: Boolean): Self = StObject.set(x, "unfold", value.asInstanceOf[js.Any])
    }
  }
}

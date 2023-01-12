package typings.rrule

import typings.rrule.anon.Dtstart
import typings.rrule.anon.PartialRRuleStrOptions
import typings.rrule.distEsmRruleMod.RRule
import typings.rrule.distEsmRrulesetMod.RRuleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmRrulestrMod {
  
  @JSImport("rrule/dist/esm/rrulestr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseInput(s: String, options: PartialRRuleStrOptions): Dtstart = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInput")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dtstart]
  
  inline def rrulestr(s: String): RRule | RRuleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any]).asInstanceOf[RRule | RRuleSet]
  inline def rrulestr(s: String, options: PartialRRuleStrOptions): RRule | RRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("rrulestr")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RRule | RRuleSet]
  
  trait RRuleStrOptions extends StObject {
    
    var cache: Boolean
    
    var compatible: Boolean
    
    var dtstart: js.Date | Null
    
    var forceset: Boolean
    
    var tzid: String | Null
    
    var unfold: Boolean
  }
  object RRuleStrOptions {
    
    inline def apply(cache: Boolean, compatible: Boolean, forceset: Boolean, unfold: Boolean): RRuleStrOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], compatible = compatible.asInstanceOf[js.Any], forceset = forceset.asInstanceOf[js.Any], unfold = unfold.asInstanceOf[js.Any], dtstart = null, tzid = null)
      __obj.asInstanceOf[RRuleStrOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RRuleStrOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
      
      inline def setDtstart(value: js.Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      inline def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      inline def setForceset(value: Boolean): Self = StObject.set(x, "forceset", value.asInstanceOf[js.Any])
      
      inline def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      inline def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      inline def setUnfold(value: Boolean): Self = StObject.set(x, "unfold", value.asInstanceOf[js.Any])
    }
  }
}

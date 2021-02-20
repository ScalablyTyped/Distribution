package typings.rrule

import typings.rrule.anon.Dtstart
import typings.rrule.anon.PartialRRuleStrOptions
import typings.rrule.rruleMod.default
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rrulestrMod {
  
  @JSImport("rrule/dist/esm/src/rrulestr", "parseInput")
  @js.native
  def parseInput(s: String, options: PartialRRuleStrOptions): Dtstart = js.native
  
  @JSImport("rrule/dist/esm/src/rrulestr", "rrulestr")
  @js.native
  def rrulestr(s: String): default | typings.rrule.rrulesetMod.default = js.native
  @JSImport("rrule/dist/esm/src/rrulestr", "rrulestr")
  @js.native
  def rrulestr(s: String, options: PartialRRuleStrOptions): default | typings.rrule.rrulesetMod.default = js.native
  
  @js.native
  trait RRuleStrOptions extends StObject {
    
    var cache: Boolean = js.native
    
    var compatible: Boolean = js.native
    
    var dtstart: Date | Null = js.native
    
    var forceset: Boolean = js.native
    
    var tzid: String | Null = js.native
    
    var unfold: Boolean = js.native
  }
  object RRuleStrOptions {
    
    @scala.inline
    def apply(cache: Boolean, compatible: Boolean, forceset: Boolean, unfold: Boolean): RRuleStrOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], compatible = compatible.asInstanceOf[js.Any], forceset = forceset.asInstanceOf[js.Any], unfold = unfold.asInstanceOf[js.Any])
      __obj.asInstanceOf[RRuleStrOptions]
    }
    
    @scala.inline
    implicit class RRuleStrOptionsMutableBuilder[Self <: RRuleStrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      @scala.inline
      def setForceset(value: Boolean): Self = StObject.set(x, "forceset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      @scala.inline
      def setUnfold(value: Boolean): Self = StObject.set(x, "unfold", value.asInstanceOf[js.Any])
    }
  }
}

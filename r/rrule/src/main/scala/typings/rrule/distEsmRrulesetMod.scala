package typings.rrule

import typings.rrule.distEsmRruleMod.RRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmRrulesetMod {
  
  @JSImport("rrule/dist/esm/rruleset", "RRuleSet")
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    * The same stratagy as RRule on cache, default to false
    * @constructor
    */
  open class RRuleSet () extends RRule {
    def this(noCache: Boolean) = this()
    
    /* private */ var _dtstart: Any = js.native
    
    val _exdate: js.Array[js.Date] = js.native
    
    val _exrule: js.Array[RRule] = js.native
    
    val _rdate: js.Array[js.Date] = js.native
    
    val _rrule: js.Array[RRule] = js.native
    
    /* private */ var _tzid: Any = js.native
    
    var dtstart: Any = js.native
    
    /**
      * Adds an EXDATE to the set
      *
      * @param {Date}
      */
    def exdate(date: js.Date): Unit = js.native
    
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of exdates
      */
    def exdates(): js.Array[js.Date] = js.native
    
    /**
      * Adds an EXRULE to the set
      *
      * @param {RRule}
      */
    def exrule(rrule: RRule): Unit = js.native
    
    /**
      * Get list of excluded rrules in this recurrence set.
      *
      * @return List of exrules
      */
    def exrules(): js.Array[RRule | RRuleSet] = js.native
    
    /**
      * Adds an RDate to the set
      *
      * @param {Date}
      */
    def rdate(date: js.Date): Unit = js.native
    
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of rdates
      */
    def rdates(): js.Array[js.Date] = js.native
    
    /**
      * Adds an RRule to the set
      *
      * @param {RRule}
      */
    def rrule(rrule: RRule): Unit = js.native
    
    /**
      * Get list of included rrules in this recurrence set.
      *
      * @return List of rrules
      */
    def rrules(): js.Array[RRule | RRuleSet] = js.native
    
    var tzid: Any = js.native
  }
}

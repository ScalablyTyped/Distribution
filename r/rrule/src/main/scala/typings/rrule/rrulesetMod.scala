package typings.rrule

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/rruleset", JSImport.Namespace)
@js.native
object rrulesetMod extends js.Object {
  
  @js.native
  trait RRuleSet
    extends typings.rrule.rruleMod.default {
    
    var _dtstart: js.Any = js.native
    
    val _exdate: js.Array[Date] = js.native
    
    val _exrule: js.Array[typings.rrule.rruleMod.default] = js.native
    
    val _rdate: js.Array[Date] = js.native
    
    val _rrule: js.Array[typings.rrule.rruleMod.default] = js.native
    
    var _tzid: js.Any = js.native
    
    var dtstart: js.Any = js.native
    
    /**
      * Adds an EXDATE to the set
      *
      * @param {Date}
      */
    def exdate(date: Date): Unit = js.native
    
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of exdates
      */
    def exdates(): js.Array[Date] = js.native
    
    /**
      * Adds an EXRULE to the set
      *
      * @param {RRule}
      */
    def exrule(rrule: typings.rrule.rruleMod.default): Unit = js.native
    
    /**
      * Get list of excluded rrules in this recurrence set.
      *
      * @return List of exrules
      */
    def exrules(): js.Array[typings.rrule.rruleMod.default | RRuleSet] = js.native
    
    /**
      * Adds an RDate to the set
      *
      * @param {Date}
      */
    def rdate(date: Date): Unit = js.native
    
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of rdates
      */
    def rdates(): js.Array[Date] = js.native
    
    /**
      * Adds an RRule to the set
      *
      * @param {RRule}
      */
    def rrule(rrule: typings.rrule.rruleMod.default): Unit = js.native
    
    /**
      * Get list of included rrules in this recurrence set.
      *
      * @return List of rrules
      */
    def rrules(): js.Array[typings.rrule.rruleMod.default | RRuleSet] = js.native
    
    var tzid: js.Any = js.native
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class default () extends RRuleSet {
    def this(noCache: Boolean) = this()
  }
}

package typings
package rruleLib.distEsmSrcRrulesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RRuleSet
  extends rruleLib.distEsmSrcRruleMod.default {
  var _dtstart: js.UndefOr[js.Any] = js.native
  val _exdate: js.Array[stdLib.Date] = js.native
  val _exrule: js.Array[rruleLib.distEsmSrcRruleMod.default] = js.native
  val _rdate: js.Array[stdLib.Date] = js.native
  val _rrule: js.Array[rruleLib.distEsmSrcRruleMod.default] = js.native
  var _tzid: js.UndefOr[js.Any] = js.native
  var dtstart: js.Any = js.native
  var tzid: js.Any = js.native
  /**
    * Adds an EXDATE to the set
    *
    * @param {Date}
    */
  def exdate(date: stdLib.Date): scala.Unit = js.native
  /**
    * Get list of included datetimes in this recurrence set.
    *
    * @return List of exdates
    */
  def exdates(): js.Array[stdLib.Date] = js.native
  /**
    * Adds an EXRULE to the set
    *
    * @param {RRule}
    */
  def exrule(rrule: rruleLib.distEsmSrcRruleMod.default): scala.Unit = js.native
  /**
    * Get list of excluded rrules in this recurrence set.
    *
    * @return List of exrules
    */
  def exrules(): js.Array[rruleLib.distEsmSrcRruleMod.default | RRuleSet] = js.native
  /**
    * Adds an RDate to the set
    *
    * @param {Date}
    */
  def rdate(date: stdLib.Date): scala.Unit = js.native
  /**
    * Get list of included datetimes in this recurrence set.
    *
    * @return List of rdates
    */
  def rdates(): js.Array[stdLib.Date] = js.native
  /**
    * Adds an RRule to the set
    *
    * @param {RRule}
    */
  def rrule(rrule: rruleLib.distEsmSrcRruleMod.default): scala.Unit = js.native
  /**
    * Get list of included rrules in this recurrence set.
    *
    * @return List of rrules
    */
  def rrules(): js.Array[rruleLib.distEsmSrcRruleMod.default | RRuleSet] = js.native
}


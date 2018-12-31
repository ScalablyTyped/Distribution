package typings
package rruleLib.distEsmRrulesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RRuleSet
  extends rruleLib.distEsmRruleMod.default {
  val _exdate: js.Array[stdLib.Date] = js.native
  val _exrule: js.Array[rruleLib.distEsmRruleMod.default] = js.native
  val _rdate: js.Array[stdLib.Date] = js.native
  val _rrule: js.Array[rruleLib.distEsmRruleMod.default] = js.native
  var _tzid: js.UndefOr[js.Any] = js.native
  var rdatesToString: js.Any = js.native
  /**
    * Adds an EXDATE to the set
    *
    * @param {Date}
    */
  def exdate(date: stdLib.Date): scala.Unit = js.native
  /**
    * Adds an EXRULE to the set
    *
    * @param {RRule}
    */
  def exrule(rrule: rruleLib.distEsmRruleMod.default): scala.Unit = js.native
  /**
    * Adds an RDate to the set
    *
    * @param {Date}
    */
  def rdate(date: stdLib.Date): scala.Unit = js.native
  def rrule(rrule: java.lang.String): scala.Unit = js.native
  /**
    * Adds an RRule to the set
    *
    * @param {RRule}
    */
  def rrule(rrule: rruleLib.distEsmRruleMod.default): scala.Unit = js.native
  def tzid(): js.UndefOr[java.lang.String] = js.native
  def tzid(tzid: java.lang.String): js.UndefOr[java.lang.String] = js.native
}


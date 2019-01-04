package typings
package rruleLib.distEsmSrcRrulesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RRuleSet
  extends rruleLib.distEsmSrcRruleMod.default {
  val _exdate: js.Array[stdLib.Date] = js.native
  val _exrule: js.Array[rruleLib.distEsmSrcRruleMod.default] = js.native
  val _rdate: js.Array[stdLib.Date] = js.native
  val _rrule: js.Array[rruleLib.distEsmSrcRruleMod.default] = js.native
  var _tzid: js.UndefOr[js.Any] = js.native
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
  def exrule(rrule: rruleLib.distEsmSrcRruleMod.default): scala.Unit = js.native
  /**
    * Adds an RDate to the set
    *
    * @param {Date}
    */
  def rdate(date: stdLib.Date): scala.Unit = js.native
  /**
    * Adds an RRule to the set
    *
    * @param {RRule}
    */
  def rrule(rrule: rruleLib.distEsmSrcRruleMod.default): scala.Unit = js.native
  def tzid(): js.UndefOr[java.lang.String] = js.native
  def tzid(tzid: java.lang.String): js.UndefOr[java.lang.String] = js.native
}


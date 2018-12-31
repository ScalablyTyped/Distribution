package typings
package rruleLib.distEsmIterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterResult extends js.Object {
  var _result: js.Array[stdLib.Date]
  val args: stdLib.Partial[IterArgs]
  val maxDate: stdLib.Date | scala.Null
  val method: java.lang.String
  val minDate: stdLib.Date | scala.Null
  var total: scala.Double
  /**
    * Possibly adds a date into the result.
    *
    * @param {Date} date - the date isn't necessarly added to the result
    *                      list (if it is too late/too early)
    * @return {Boolean} true if it makes sense to continue the iteration
    *                   false if we're done.
    */
  def accept(date: stdLib.Date): scala.Boolean
  /**
    *
    * @param {Date} date that is part of the result.
    * @return {Boolean} whether we are interested in more values.
    */
  def add(date: stdLib.Date): scala.Boolean
  /**
    * 'before' and 'after' return only one date, whereas 'all'
    * and 'between' an array.
    * @return {Date,Array?}
    */
  def getValue(): stdLib.Date | js.Array[stdLib.Date] | scala.Null
}


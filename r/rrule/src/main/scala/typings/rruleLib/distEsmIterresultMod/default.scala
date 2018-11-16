package typings
package rruleLib.distEsmIterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/iterresult", JSImport.Default)
@js.native
class default protected () extends IterResult {
  def this(method: java.lang.String, args: stdLib.Partial[IterArgs]) = this()
  /* CompleteClass */
  override var _result: js.Array[stdLib.Date] = js.native
  /* CompleteClass */
  override val args: stdLib.Partial[IterArgs] = js.native
  /* CompleteClass */
  override val maxDate: stdLib.Date | scala.Null = js.native
  /* CompleteClass */
  override val method: java.lang.String = js.native
  /* CompleteClass */
  override val minDate: stdLib.Date | scala.Null = js.native
  /* CompleteClass */
  override var total: scala.Double = js.native
  /**
       * Possibly adds a date into the result.
       *
       * @param {Date} date - the date isn't necessarly added to the result
       *                      list (if it is too late/too early)
       * @return {Boolean} true if it makes sense to continue the iteration
       *                   false if we're done.
       */
  /* CompleteClass */
  override def accept(date: stdLib.Date): scala.Boolean = js.native
  /**
       *
       * @param {Date} date that is part of the result.
       * @return {Boolean} whether we are interested in more values.
       */
  /* CompleteClass */
  override def add(date: stdLib.Date): scala.Boolean = js.native
  /**
       * 'before' and 'after' return only one date, whereas 'all'
       * and 'between' an array.
       * @return {Date,Array?}
       */
  /* CompleteClass */
  override def getValue(): stdLib.Date | js.Array[stdLib.Date] | scala.Null = js.native
}


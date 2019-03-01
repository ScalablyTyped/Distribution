package typings
package rruleLib.distEsmSrcIterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterResult[M /* <: rruleLib.distEsmSrcTypesMod.QueryMethodTypes */] extends js.Object {
  var _result: js.Array[stdLib.Date]
  val args: stdLib.Partial[IterArgs]
  val maxDate: stdLib.Date | scala.Null
  val method: M
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
  def getValue(): rruleLib.distEsmSrcTypesMod.IterResultType[M]
}

object IterResult {
  @scala.inline
  def apply[M /* <: rruleLib.distEsmSrcTypesMod.QueryMethodTypes */](
    _result: js.Array[stdLib.Date],
    accept: js.Function1[stdLib.Date, scala.Boolean],
    add: js.Function1[stdLib.Date, scala.Boolean],
    args: stdLib.Partial[IterArgs],
    clone: js.Function0[IterResult[M]],
    getValue: js.Function0[rruleLib.distEsmSrcTypesMod.IterResultType[M]],
    method: M,
    total: scala.Double,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null
  ): IterResult[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_result")(_result)
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.updateDynamic("total")(total)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    __obj.asInstanceOf[IterResult[M]]
  }
}


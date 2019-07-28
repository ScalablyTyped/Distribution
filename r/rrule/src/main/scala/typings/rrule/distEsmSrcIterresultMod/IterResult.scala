package typings.rrule.distEsmSrcIterresultMod

import typings.rrule.distEsmSrcTypesMod.IterResultType
import typings.rrule.distEsmSrcTypesMod.QueryMethodTypes
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterResult[M /* <: QueryMethodTypes */] extends js.Object {
  var _result: js.Array[Date]
  val args: Partial[IterArgs]
  val maxDate: Date | Null
  val method: M
  val minDate: Date | Null
  var total: Double
  /**
    * Possibly adds a date into the result.
    *
    * @param {Date} date - the date isn't necessarly added to the result
    *                      list (if it is too late/too early)
    * @return {Boolean} true if it makes sense to continue the iteration
    *                   false if we're done.
    */
  def accept(date: Date): Boolean
  /**
    *
    * @param {Date} date that is part of the result.
    * @return {Boolean} whether we are interested in more values.
    */
  def add(date: Date): Boolean
  /**
    * 'before' and 'after' return only one date, whereas 'all'
    * and 'between' an array.
    * @return {Date,Array?}
    */
  def getValue(): IterResultType[M]
}

object IterResult {
  @scala.inline
  def apply[M /* <: QueryMethodTypes */](
    _result: js.Array[Date],
    accept: Date => Boolean,
    add: Date => Boolean,
    args: Partial[IterArgs],
    clone: () => IterResult[M],
    getValue: () => IterResultType[M],
    method: M,
    total: Double,
    maxDate: Date = null,
    minDate: Date = null
  ): IterResult[M] = {
    val __obj = js.Dynamic.literal(_result = _result, accept = js.Any.fromFunction1(accept), add = js.Any.fromFunction1(add), args = args, clone = js.Any.fromFunction0(clone), getValue = js.Any.fromFunction0(getValue), method = method.asInstanceOf[js.Any], total = total)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    __obj.asInstanceOf[IterResult[M]]
  }
}


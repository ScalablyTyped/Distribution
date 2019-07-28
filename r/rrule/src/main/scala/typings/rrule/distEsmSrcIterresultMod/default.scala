package typings.rrule.distEsmSrcIterresultMod

import typings.rrule.distEsmSrcTypesMod.IterResultType
import typings.rrule.distEsmSrcTypesMod.QueryMethodTypes
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iterresult", JSImport.Default)
@js.native
class default[M /* <: QueryMethodTypes */] protected () extends IterResult[M] {
  def this(method: M, args: Partial[IterArgs]) = this()
  /* CompleteClass */
  override var _result: js.Array[Date] = js.native
  /* CompleteClass */
  override val args: Partial[IterArgs] = js.native
  /* CompleteClass */
  override val maxDate: Date | Null = js.native
  /* CompleteClass */
  override val method: M = js.native
  /* CompleteClass */
  override val minDate: Date | Null = js.native
  /* CompleteClass */
  override var total: Double = js.native
  /**
    * Possibly adds a date into the result.
    *
    * @param {Date} date - the date isn't necessarly added to the result
    *                      list (if it is too late/too early)
    * @return {Boolean} true if it makes sense to continue the iteration
    *                   false if we're done.
    */
  /* CompleteClass */
  override def accept(date: Date): Boolean = js.native
  /**
    *
    * @param {Date} date that is part of the result.
    * @return {Boolean} whether we are interested in more values.
    */
  /* CompleteClass */
  override def add(date: Date): Boolean = js.native
  /**
    * 'before' and 'after' return only one date, whereas 'all'
    * and 'between' an array.
    * @return {Date,Array?}
    */
  /* CompleteClass */
  override def getValue(): IterResultType[M] = js.native
}


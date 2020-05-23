package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DateTimeUtil")
@js.native
object DateTimeUtil extends js.Object {
  @js.native
  class SimpleDate protected ()
    extends typings.sharepoint.SP.DateTimeUtil.SimpleDate {
    def this(year: Double, month: Double, day: Double, era: Double) = this()
    /* CompleteClass */
    override def get_day(): Double = js.native
    /* CompleteClass */
    override def get_era(): Double = js.native
    /* CompleteClass */
    override def get_month(): Double = js.native
    /* CompleteClass */
    override def get_year(): Double = js.native
    /* CompleteClass */
    override def set_day(value: Double): Unit = js.native
    /* CompleteClass */
    override def set_era(value: Double): Unit = js.native
    /* CompleteClass */
    override def set_month(value: Double): Unit = js.native
    /* CompleteClass */
    override def set_year(value: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SimpleDate extends js.Object {
    def dateEquals(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateGreater(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateGreaterEqual(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateLess(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
    def dateLessEqual(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = js.native
  }
  
}


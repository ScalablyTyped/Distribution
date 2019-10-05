package typings.sharepoint.SP

import typings.sharepoint.SP.DateTimeUtil.SimpleDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DateTimeUtil")
@js.native
object DateTimeUtil extends js.Object {
  @js.native
  class SimpleDate protected () extends js.Object {
    def this(year: Double, month: Double, day: Double, era: Double) = this()
    def get_day(): Double = js.native
    def get_era(): Double = js.native
    def get_month(): Double = js.native
    def get_year(): Double = js.native
    def set_day(value: Double): Unit = js.native
    def set_era(value: Double): Unit = js.native
    def set_month(value: Double): Unit = js.native
    def set_year(value: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SimpleDate extends js.Object {
    def dateEquals(date1: SimpleDate, date2: SimpleDate): Boolean = js.native
    def dateGreater(date1: SimpleDate, date2: SimpleDate): Boolean = js.native
    def dateGreaterEqual(date1: SimpleDate, date2: SimpleDate): Boolean = js.native
    def dateLess(date1: SimpleDate, date2: SimpleDate): Boolean = js.native
    def dateLessEqual(date1: SimpleDate, date2: SimpleDate): Boolean = js.native
  }
  
}


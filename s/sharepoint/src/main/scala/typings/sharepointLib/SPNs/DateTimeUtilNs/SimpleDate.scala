package typings
package sharepointLib.SPNs.DateTimeUtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DateTimeUtil.SimpleDate")
@js.native
class SimpleDate protected () extends js.Object {
  def this(year: scala.Double, month: scala.Double, day: scala.Double, era: scala.Double) = this()
  def get_day(): scala.Double = js.native
  def get_era(): scala.Double = js.native
  def get_month(): scala.Double = js.native
  def get_year(): scala.Double = js.native
  def set_day(value: scala.Double): scala.Unit = js.native
  def set_era(value: scala.Double): scala.Unit = js.native
  def set_month(value: scala.Double): scala.Unit = js.native
  def set_year(value: scala.Double): scala.Unit = js.native
}

@JSGlobal("SP.DateTimeUtil.SimpleDate")
@js.native
object SimpleDate extends js.Object {
  def dateEquals(
    date1: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate,
    date2: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate
  ): scala.Boolean = js.native
  def dateGreater(
    date1: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate,
    date2: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate
  ): scala.Boolean = js.native
  def dateGreaterEqual(
    date1: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate,
    date2: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate
  ): scala.Boolean = js.native
  def dateLess(
    date1: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate,
    date2: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate
  ): scala.Boolean = js.native
  def dateLessEqual(
    date1: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate,
    date2: sharepointLib.SPNs.DateTimeUtilNs.SimpleDate
  ): scala.Boolean = js.native
}


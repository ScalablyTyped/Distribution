package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideDateTime")
@js.native
class GlideDateTime () extends js.Object {
  def this(value: java.lang.String) = this()
  def this(value: GlideDateTime) = this()
  def add(gd: scala.Double): scala.Unit = js.native
  def add(gd: GlideTime): scala.Unit = js.native
  def addDaysLocalTime(amount: scala.Double): scala.Unit = js.native
  def addDaysUTC(amount: scala.Double): scala.Unit = js.native
  def addMonthsLocalTime(amount: scala.Double): scala.Unit = js.native
  def addMonthsUTC(amount: scala.Double): scala.Unit = js.native
  def addSeconds(value: scala.Double): scala.Unit = js.native
  def addWeeksLocalTime(amount: scala.Double): scala.Unit = js.native
  def addWeeksUTC(amount: scala.Double): scala.Unit = js.native
  def addYearsLocalTime(amount: scala.Double): scala.Unit = js.native
  def addYearsUTC(amount: scala.Double): scala.Unit = js.native
  def compareTo(o: js.Object): scala.Double = js.native
  def equals(o: js.Object): scala.Boolean = js.native
  def getDSTOffset(): scala.Double = js.native
  def getDate(): GlideTime = js.native
  def getDayOfMonthLocalTime(): scala.Double = js.native
  def getDayOfMonthUTC(): scala.Double = js.native
  def getDayOfWeekLocalTime(): scala.Double = js.native
  def getDayOfWeekUTC(): scala.Double = js.native
  def getDaysInMonthUTC(): scala.Double = js.native
  def getDisplayValue(): java.lang.String = js.native
  def getDisplayValueInternal(): java.lang.String = js.native
  def getErrorMsg(): java.lang.String = js.native
  def getLocalDate(): GlideTime = js.native
  def getLocalTime(): GlideTime = js.native
  def getMonthLocalTime(): scala.Double = js.native
  def getMonthUTC(): scala.Double = js.native
  def getNumericValue(): scala.Double = js.native
  def getTZOffset(): scala.Double = js.native
  def getTime(): GlideTime = js.native
  def getValue(): java.lang.String = js.native
  def getWeekOfYearLocalTime(): scala.Double = js.native
  def getWeekOfYearUTC(): scala.Double = js.native
  def getYearLocalTime(): scala.Double = js.native
  def getYearUTC(): scala.Double = js.native
  def hasDate(): scala.Boolean = js.native
  def isDST(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def setDayOfMonthLocalTime(day: scala.Double): scala.Unit = js.native
  def setDayOfMonthUTC(day: scala.Double): scala.Unit = js.native
  def setDisplayValue(value: java.lang.String): scala.Unit = js.native
  def setDisplayValue(value: java.lang.String, format: java.lang.String): scala.Unit = js.native
  def setDisplayValueInternal(value: java.lang.String): scala.Unit = js.native
  def setGlideDateTime(g: GlideDateTime): scala.Unit = js.native
  def setMonthLocalTime(month: scala.Double): scala.Unit = js.native
  def setMonthUTC(month: scala.Double): scala.Unit = js.native
  def setNumericValue(milliseconds: scala.Double): scala.Unit = js.native
  def setValue(o: java.lang.String): scala.Unit = js.native
  def setValue(o: scala.Double): scala.Unit = js.native
  def setValue(o: GlideDateTime): scala.Unit = js.native
  def setValueUTC(dt: java.lang.String, format: java.lang.String): scala.Unit = js.native
  def setYearLocalTime(year: scala.Double): scala.Unit = js.native
  def setYearUTC(year: scala.Double): scala.Unit = js.native
  def subtract(start: GlideDateTime): GlideDuration = js.native
  def subtract(start: GlideDateTime, end: GlideDateTime): GlideDuration = js.native
  def subtract(time: scala.Double): scala.Unit = js.native
  def subtract(time: GlideTime): scala.Unit = js.native
}


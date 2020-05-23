package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideDateTime extends js.Object {
  def add(gd: Double): Unit = js.native
  def add(gd: GlideTime): Unit = js.native
  def addDaysLocalTime(amount: Double): Unit = js.native
  def addDaysUTC(amount: Double): Unit = js.native
  def addMonthsLocalTime(amount: Double): Unit = js.native
  def addMonthsUTC(amount: Double): Unit = js.native
  def addSeconds(value: Double): Unit = js.native
  def addWeeksLocalTime(amount: Double): Unit = js.native
  def addWeeksUTC(amount: Double): Unit = js.native
  def addYearsLocalTime(amount: Double): Unit = js.native
  def addYearsUTC(amount: Double): Unit = js.native
  def compareTo(o: js.Object): Double = js.native
  def equals(o: js.Object): Boolean = js.native
  def getDSTOffset(): Double = js.native
  def getDate(): GlideTime = js.native
  def getDayOfMonthLocalTime(): Double = js.native
  def getDayOfMonthUTC(): Double = js.native
  def getDayOfWeekLocalTime(): Double = js.native
  def getDayOfWeekUTC(): Double = js.native
  def getDaysInMonthUTC(): Double = js.native
  def getDisplayValue(): String = js.native
  def getDisplayValueInternal(): String = js.native
  def getErrorMsg(): String = js.native
  def getLocalDate(): GlideTime = js.native
  def getLocalTime(): GlideTime = js.native
  def getMonthLocalTime(): Double = js.native
  def getMonthUTC(): Double = js.native
  def getNumericValue(): Double = js.native
  def getTZOffset(): Double = js.native
  def getTime(): GlideTime = js.native
  def getValue(): String = js.native
  def getWeekOfYearLocalTime(): Double = js.native
  def getWeekOfYearUTC(): Double = js.native
  def getYearLocalTime(): Double = js.native
  def getYearUTC(): Double = js.native
  def hasDate(): Boolean = js.native
  def isDST(): Boolean = js.native
  def isValid(): Boolean = js.native
  def setDayOfMonthLocalTime(day: Double): Unit = js.native
  def setDayOfMonthUTC(day: Double): Unit = js.native
  def setDisplayValue(value: String): Unit = js.native
  def setDisplayValue(value: String, format: String): Unit = js.native
  def setDisplayValueInternal(value: String): Unit = js.native
  def setGlideDateTime(g: GlideDateTime): Unit = js.native
  def setMonthLocalTime(month: Double): Unit = js.native
  def setMonthUTC(month: Double): Unit = js.native
  def setNumericValue(milliseconds: Double): Unit = js.native
  def setValue(o: String): Unit = js.native
  def setValue(o: Double): Unit = js.native
  def setValue(o: GlideDateTime): Unit = js.native
  def setValueUTC(dt: String, format: String): Unit = js.native
  def setYearLocalTime(year: Double): Unit = js.native
  def setYearUTC(year: Double): Unit = js.native
  def subtract(start: GlideDateTime): GlideDuration = js.native
  def subtract(start: GlideDateTime, end: GlideDateTime): GlideDuration = js.native
  def subtract(time: Double): Unit = js.native
  def subtract(time: GlideTime): Unit = js.native
}


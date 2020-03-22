package typings.rcPicker.generateMod

import typings.rcPicker.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateConfig[DateType] extends js.Object {
  var locale: AnonFormat[DateType]
  def addDate(value: DateType, diff: Double): DateType
  def addMonth(value: DateType, diff: Double): DateType
  def addYear(value: DateType, diff: Double): DateType
  def getDate(value: DateType): Double
  def getHour(value: DateType): Double
  def getMinute(value: DateType): Double
  def getMonth(value: DateType): Double
  def getNow(): DateType
  def getSecond(value: DateType): Double
  def getWeekDay(value: DateType): Double
  def getYear(value: DateType): Double
  def isAfter(date1: DateType, date2: DateType): Boolean
  def isValidate(date: DateType): Boolean
  def setDate(value: DateType, date: Double): DateType
  def setHour(value: DateType, hour: Double): DateType
  def setMinute(value: DateType, minute: Double): DateType
  def setMonth(value: DateType, month: Double): DateType
  def setSecond(value: DateType, second: Double): DateType
  def setYear(value: DateType, year: Double): DateType
}

object GenerateConfig {
  @scala.inline
  def apply[DateType](
    addDate: (DateType, Double) => DateType,
    addMonth: (DateType, Double) => DateType,
    addYear: (DateType, Double) => DateType,
    getDate: DateType => Double,
    getHour: DateType => Double,
    getMinute: DateType => Double,
    getMonth: DateType => Double,
    getNow: () => DateType,
    getSecond: DateType => Double,
    getWeekDay: DateType => Double,
    getYear: DateType => Double,
    isAfter: (DateType, DateType) => Boolean,
    isValidate: DateType => Boolean,
    locale: AnonFormat[DateType],
    setDate: (DateType, Double) => DateType,
    setHour: (DateType, Double) => DateType,
    setMinute: (DateType, Double) => DateType,
    setMonth: (DateType, Double) => DateType,
    setSecond: (DateType, Double) => DateType,
    setYear: (DateType, Double) => DateType
  ): GenerateConfig[DateType] = {
    val __obj = js.Dynamic.literal(addDate = js.Any.fromFunction2(addDate), addMonth = js.Any.fromFunction2(addMonth), addYear = js.Any.fromFunction2(addYear), getDate = js.Any.fromFunction1(getDate), getHour = js.Any.fromFunction1(getHour), getMinute = js.Any.fromFunction1(getMinute), getMonth = js.Any.fromFunction1(getMonth), getNow = js.Any.fromFunction0(getNow), getSecond = js.Any.fromFunction1(getSecond), getWeekDay = js.Any.fromFunction1(getWeekDay), getYear = js.Any.fromFunction1(getYear), isAfter = js.Any.fromFunction2(isAfter), isValidate = js.Any.fromFunction1(isValidate), locale = locale.asInstanceOf[js.Any], setDate = js.Any.fromFunction2(setDate), setHour = js.Any.fromFunction2(setHour), setMinute = js.Any.fromFunction2(setMinute), setMonth = js.Any.fromFunction2(setMonth), setSecond = js.Any.fromFunction2(setSecond), setYear = js.Any.fromFunction2(setYear))
  
    __obj.asInstanceOf[GenerateConfig[DateType]]
  }
}


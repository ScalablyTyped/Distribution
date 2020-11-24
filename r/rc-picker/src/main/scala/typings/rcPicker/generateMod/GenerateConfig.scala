package typings.rcPicker.generateMod

import typings.rcPicker.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConfig[DateType] extends js.Object {
  
  def addDate(value: DateType, diff: Double): DateType = js.native
  
  def addMonth(value: DateType, diff: Double): DateType = js.native
  
  def addYear(value: DateType, diff: Double): DateType = js.native
  
  def getDate(value: DateType): Double = js.native
  
  def getEndDate(value: DateType): DateType = js.native
  
  def getFixedDate(fixed: String): DateType = js.native
  
  def getHour(value: DateType): Double = js.native
  
  def getMinute(value: DateType): Double = js.native
  
  def getMonth(value: DateType): Double = js.native
  
  def getNow(): DateType = js.native
  
  def getSecond(value: DateType): Double = js.native
  
  def getWeekDay(value: DateType): Double = js.native
  
  def getYear(value: DateType): Double = js.native
  
  def isAfter(date1: DateType, date2: DateType): Boolean = js.native
  
  def isValidate(date: DateType): Boolean = js.native
  
  var locale: Format[DateType] = js.native
  
  def setDate(value: DateType, date: Double): DateType = js.native
  
  def setHour(value: DateType, hour: Double): DateType = js.native
  
  def setMinute(value: DateType, minute: Double): DateType = js.native
  
  def setMonth(value: DateType, month: Double): DateType = js.native
  
  def setSecond(value: DateType, second: Double): DateType = js.native
  
  def setYear(value: DateType, year: Double): DateType = js.native
}
object GenerateConfig {
  
  @scala.inline
  def apply[DateType](
    addDate: (DateType, Double) => DateType,
    addMonth: (DateType, Double) => DateType,
    addYear: (DateType, Double) => DateType,
    getDate: DateType => Double,
    getEndDate: DateType => DateType,
    getFixedDate: String => DateType,
    getHour: DateType => Double,
    getMinute: DateType => Double,
    getMonth: DateType => Double,
    getNow: () => DateType,
    getSecond: DateType => Double,
    getWeekDay: DateType => Double,
    getYear: DateType => Double,
    isAfter: (DateType, DateType) => Boolean,
    isValidate: DateType => Boolean,
    locale: Format[DateType],
    setDate: (DateType, Double) => DateType,
    setHour: (DateType, Double) => DateType,
    setMinute: (DateType, Double) => DateType,
    setMonth: (DateType, Double) => DateType,
    setSecond: (DateType, Double) => DateType,
    setYear: (DateType, Double) => DateType
  ): GenerateConfig[DateType] = {
    val __obj = js.Dynamic.literal(addDate = js.Any.fromFunction2(addDate), addMonth = js.Any.fromFunction2(addMonth), addYear = js.Any.fromFunction2(addYear), getDate = js.Any.fromFunction1(getDate), getEndDate = js.Any.fromFunction1(getEndDate), getFixedDate = js.Any.fromFunction1(getFixedDate), getHour = js.Any.fromFunction1(getHour), getMinute = js.Any.fromFunction1(getMinute), getMonth = js.Any.fromFunction1(getMonth), getNow = js.Any.fromFunction0(getNow), getSecond = js.Any.fromFunction1(getSecond), getWeekDay = js.Any.fromFunction1(getWeekDay), getYear = js.Any.fromFunction1(getYear), isAfter = js.Any.fromFunction2(isAfter), isValidate = js.Any.fromFunction1(isValidate), locale = locale.asInstanceOf[js.Any], setDate = js.Any.fromFunction2(setDate), setHour = js.Any.fromFunction2(setHour), setMinute = js.Any.fromFunction2(setMinute), setMonth = js.Any.fromFunction2(setMonth), setSecond = js.Any.fromFunction2(setSecond), setYear = js.Any.fromFunction2(setYear))
    __obj.asInstanceOf[GenerateConfig[DateType]]
  }
  
  @scala.inline
  implicit class GenerateConfigOps[Self <: GenerateConfig[_], DateType] (val x: Self with GenerateConfig[DateType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddDate(value: (DateType, Double) => DateType): Self = this.set("addDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddMonth(value: (DateType, Double) => DateType): Self = this.set("addMonth", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddYear(value: (DateType, Double) => DateType): Self = this.set("addYear", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDate(value: DateType => Double): Self = this.set("getDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEndDate(value: DateType => DateType): Self = this.set("getEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFixedDate(value: String => DateType): Self = this.set("getFixedDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHour(value: DateType => Double): Self = this.set("getHour", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMinute(value: DateType => Double): Self = this.set("getMinute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMonth(value: DateType => Double): Self = this.set("getMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNow(value: () => DateType): Self = this.set("getNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecond(value: DateType => Double): Self = this.set("getSecond", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWeekDay(value: DateType => Double): Self = this.set("getWeekDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetYear(value: DateType => Double): Self = this.set("getYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAfter(value: (DateType, DateType) => Boolean): Self = this.set("isAfter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsValidate(value: DateType => Boolean): Self = this.set("isValidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocale(value: Format[DateType]): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDate(value: (DateType, Double) => DateType): Self = this.set("setDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetHour(value: (DateType, Double) => DateType): Self = this.set("setHour", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMinute(value: (DateType, Double) => DateType): Self = this.set("setMinute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMonth(value: (DateType, Double) => DateType): Self = this.set("setMonth", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSecond(value: (DateType, Double) => DateType): Self = this.set("setSecond", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetYear(value: (DateType, Double) => DateType): Self = this.set("setYear", js.Any.fromFunction2(value))
  }
}

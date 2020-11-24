package typings.rcPicker

import typings.rcPicker.anon.FormatList
import typings.rcPicker.anon.GenerateConfig
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.PickerMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/utils/dateUtil", JSImport.Namespace)
@js.native
object dateUtilMod extends js.Object {
  
  val WEEK_DAY_COUNT: /* 7 */ Double = js.native
  
  def formatValue[DateType](value: DateType, hasGenerateConfigLocaleFormat: GenerateConfig[DateType]): String = js.native
  
  def getClosingViewDate[DateType](
    viewDate: DateType,
    picker: PickerMode,
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType]
  ): DateType = js.native
  def getClosingViewDate[DateType](
    viewDate: DateType,
    picker: PickerMode,
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    offset: Double
  ): DateType = js.native
  
  def getQuarter[DateType](generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType], date: DateType): Double = js.native
  
  def getWeekStartDate[DateType](
    locale: String,
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    value: DateType
  ): DateType = js.native
  
  def isEqual[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    value1: NullableDateType[DateType],
    value2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isInRange[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    startDate: NullableDateType[DateType],
    endDate: NullableDateType[DateType],
    current: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isNullEqual[T](value1: T, value2: T): js.UndefOr[Boolean] = js.native
  
  def isSameDate[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isSameDecade[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    decade1: NullableDateType[DateType],
    decade2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isSameMonth[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    month1: NullableDateType[DateType],
    month2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isSameQuarter[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    quarter1: NullableDateType[DateType],
    quarter2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isSameTime[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    time1: NullableDateType[DateType],
    time2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isSameWeek[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    locale: String,
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def isSameYear[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    year1: NullableDateType[DateType],
    year2: NullableDateType[DateType]
  ): Boolean = js.native
  
  def parseValue[DateType](value: String, hasGenerateConfigLocaleFormatList: FormatList[DateType]): DateType = js.native
}

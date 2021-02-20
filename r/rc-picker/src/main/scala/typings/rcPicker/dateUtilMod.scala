package typings.rcPicker

import typings.rcPicker.anon.FormatList
import typings.rcPicker.anon.GenerateConfig
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilMod {
  
  @JSImport("rc-picker/es/utils/dateUtil", "WEEK_DAY_COUNT")
  @js.native
  val WEEK_DAY_COUNT: /* 7 */ Double = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "formatValue")
  @js.native
  def formatValue[DateType](value: DateType, hasGenerateConfigLocaleFormat: GenerateConfig[DateType]): String = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "getClosingViewDate")
  @js.native
  def getClosingViewDate[DateType](
    viewDate: DateType,
    picker: PickerMode,
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType]
  ): DateType = js.native
  @JSImport("rc-picker/es/utils/dateUtil", "getClosingViewDate")
  @js.native
  def getClosingViewDate[DateType](
    viewDate: DateType,
    picker: PickerMode,
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    offset: Double
  ): DateType = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "getQuarter")
  @js.native
  def getQuarter[DateType](generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType], date: DateType): Double = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "getWeekStartDate")
  @js.native
  def getWeekStartDate[DateType](
    locale: String,
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    value: DateType
  ): DateType = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isEqual")
  @js.native
  def isEqual[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    value1: NullableDateType[DateType],
    value2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isInRange")
  @js.native
  def isInRange[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    startDate: NullableDateType[DateType],
    endDate: NullableDateType[DateType],
    current: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isNullEqual")
  @js.native
  def isNullEqual[T](value1: T, value2: T): js.UndefOr[Boolean] = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameDate")
  @js.native
  def isSameDate[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameDecade")
  @js.native
  def isSameDecade[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    decade1: NullableDateType[DateType],
    decade2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameMonth")
  @js.native
  def isSameMonth[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    month1: NullableDateType[DateType],
    month2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameQuarter")
  @js.native
  def isSameQuarter[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    quarter1: NullableDateType[DateType],
    quarter2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameTime")
  @js.native
  def isSameTime[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    time1: NullableDateType[DateType],
    time2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameWeek")
  @js.native
  def isSameWeek[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    locale: String,
    date1: NullableDateType[DateType],
    date2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "isSameYear")
  @js.native
  def isSameYear[DateType](
    generateConfig: typings.rcPicker.generateMod.GenerateConfig[DateType],
    year1: NullableDateType[DateType],
    year2: NullableDateType[DateType]
  ): Boolean = js.native
  
  @JSImport("rc-picker/es/utils/dateUtil", "parseValue")
  @js.native
  def parseValue[DateType](value: String, hasGenerateConfigLocaleFormatList: FormatList[DateType]): DateType = js.native
}

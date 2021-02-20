package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import typings.reactNativeCalendars.reactNativeCalendarsStrings.custom
import typings.reactNativeCalendars.reactNativeCalendarsStrings.period
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CalendarMarkingProps extends StObject
object _CalendarMarkingProps {
  
  @scala.inline
  def CustomMarkingProps(markedDates: StringDictionary[CustomMarking], markingType: custom): typings.reactNativeCalendars.mod.CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.CustomMarkingProps]
  }
  
  @scala.inline
  def DotMarkingProps(markedDates: StringDictionary[DotMarking]): typings.reactNativeCalendars.mod.DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.DotMarkingProps]
  }
  
  @scala.inline
  def MultiDotMarkingProps(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): typings.reactNativeCalendars.mod.MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.MultiDotMarkingProps]
  }
  
  @scala.inline
  def MultiPeriodMarkingProps(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): typings.reactNativeCalendars.mod.MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.MultiPeriodMarkingProps]
  }
  
  @scala.inline
  def PeriodMarkingProps(markedDates: StringDictionary[PeriodMarking], markingType: period): typings.reactNativeCalendars.mod.PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.PeriodMarkingProps]
  }
}

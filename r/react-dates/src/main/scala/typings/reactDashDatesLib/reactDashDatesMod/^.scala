package typings
package reactDashDatesLib.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dates", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DateRangePicker: reactLib.reactMod.ReactNs.ClassicComponentClass[reactDashDatesLib.reactDashDatesMod.ReactDatesNs.DateRangePickerShape] = js.native
  var DayPickerRangeController: reactLib.reactMod.ReactNs.ClassicComponentClass[reactDashDatesLib.reactDashDatesMod.ReactDatesNs.DayPickerRangeControllerShape] = js.native
  var DayPickerSingleDateController: reactLib.reactMod.ReactNs.ClassicComponentClass[
    reactDashDatesLib.reactDashDatesMod.ReactDatesNs.DayPickerSingleDateControllerShape
  ] = js.native
  var SingleDatePicker: reactLib.reactMod.ReactNs.ClassicComponentClass[reactDashDatesLib.reactDashDatesMod.ReactDatesNs.SingleDatePickerShape] = js.native
  // UTILS
  //
  // utils/isInclusivelyAfterDay.js
  var isInclusivelyAfterDay: js.Function2[
    /* a */ momentLib.momentMod.momentNs.Moment, 
    /* b */ momentLib.momentMod.momentNs.Moment, 
    scala.Boolean
  ] = js.native
  // utils/isInclusivelyBeforeDay.js
  var isInclusivelyBeforeDay: js.Function2[
    /* a */ momentLib.momentMod.momentNs.Moment, 
    /* b */ momentLib.momentMod.momentNs.Moment, 
    scala.Boolean
  ] = js.native
  // utils/isNextDay.js
  var isNextDay: js.Function2[
    /* a */ momentLib.momentMod.momentNs.Moment, 
    /* b */ momentLib.momentMod.momentNs.Moment, 
    scala.Boolean
  ] = js.native
  // utils/isSameDay.js
  var isSameDay: js.Function2[
    /* a */ momentLib.momentMod.momentNs.Moment, 
    /* b */ momentLib.momentMod.momentNs.Moment, 
    scala.Boolean
  ] = js.native
  // utils/toISODateString.js
  var toISODateString: js.Function2[
    /* date */ momentLib.momentMod.momentNs.MomentInput, 
    /* currentFormat */ momentLib.momentMod.momentNs.MomentFormatSpecification, 
    java.lang.String | scala.Null
  ] = js.native
  // utils/toLocalizedDateString.js
  var toLocalizedDateString: js.Function2[
    /* date */ momentLib.momentMod.momentNs.MomentInput, 
    /* currentFormat */ momentLib.momentMod.momentNs.MomentFormatSpecification, 
    java.lang.String | scala.Null
  ] = js.native
  // utils/toMomentObject.js
  var toMomentObject: js.Function2[
    /* dateString */ momentLib.momentMod.momentNs.MomentInput, 
    /* customFormat */ momentLib.momentMod.momentNs.MomentFormatSpecification, 
    momentLib.momentMod.momentNs.Moment | scala.Null
  ] = js.native
}


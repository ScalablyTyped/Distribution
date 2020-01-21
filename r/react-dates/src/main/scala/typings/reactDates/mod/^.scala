package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.react.mod.ClassicComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dates", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DateRangePicker: ClassicComponentClass[DateRangePickerShape] = js.native
  var DayPickerRangeController: ClassicComponentClass[DayPickerRangeControllerShape] = js.native
  var DayPickerSingleDateController: ClassicComponentClass[DayPickerSingleDateControllerShape] = js.native
  var SingleDatePicker: ClassicComponentClass[SingleDatePickerShape] = js.native
  // UTILS
  //
  // utils/isInclusivelyAfterDay.js
  var isInclusivelyAfterDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/isInclusivelyBeforeDay.js
  var isInclusivelyBeforeDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/isNextDay.js
  var isNextDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/isSameDay.js
  var isSameDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/toISODateString.js
  var toISODateString: js.Function2[/* date */ MomentInput, /* currentFormat */ MomentFormatSpecification, String | Null] = js.native
  // utils/toLocalizedDateString.js
  var toLocalizedDateString: js.Function2[/* date */ MomentInput, /* currentFormat */ MomentFormatSpecification, String | Null] = js.native
  // utils/toMomentObject.js
  var toMomentObject: js.Function2[
    /* dateString */ MomentInput, 
    /* customFormat */ MomentFormatSpecification, 
    Moment | Null
  ] = js.native
}


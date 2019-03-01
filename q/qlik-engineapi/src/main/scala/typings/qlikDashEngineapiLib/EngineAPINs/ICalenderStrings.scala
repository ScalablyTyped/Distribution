package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CalenderStrings...
  */
trait ICalenderStrings extends js.Object {
  /**
    * List of short day names.
    */
  var qDayNames: js.Array[java.lang.String]
  /**
    * List of long day names.
    */
  var qLongDayNames: js.Array[java.lang.String]
  /**
    * List of long month names.
    */
  var qLongMonthNames: js.Array[java.lang.String]
  /**
    * List of short month names.
    */
  var qMonthNames: js.Array[java.lang.String]
}

object ICalenderStrings {
  @scala.inline
  def apply(
    qDayNames: js.Array[java.lang.String],
    qLongDayNames: js.Array[java.lang.String],
    qLongMonthNames: js.Array[java.lang.String],
    qMonthNames: js.Array[java.lang.String]
  ): ICalenderStrings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDayNames")(qDayNames)
    __obj.updateDynamic("qLongDayNames")(qLongDayNames)
    __obj.updateDynamic("qLongMonthNames")(qLongMonthNames)
    __obj.updateDynamic("qMonthNames")(qMonthNames)
    __obj.asInstanceOf[ICalenderStrings]
  }
}


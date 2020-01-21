package typings.qlikEngineapi.EngineAPI

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
  var qDayNames: js.Array[String]
  /**
    * List of long day names.
    */
  var qLongDayNames: js.Array[String]
  /**
    * List of long month names.
    */
  var qLongMonthNames: js.Array[String]
  /**
    * List of short month names.
    */
  var qMonthNames: js.Array[String]
}

object ICalenderStrings {
  @scala.inline
  def apply(
    qDayNames: js.Array[String],
    qLongDayNames: js.Array[String],
    qLongMonthNames: js.Array[String],
    qMonthNames: js.Array[String]
  ): ICalenderStrings = {
    val __obj = js.Dynamic.literal(qDayNames = qDayNames.asInstanceOf[js.Any], qLongDayNames = qLongDayNames.asInstanceOf[js.Any], qLongMonthNames = qLongMonthNames.asInstanceOf[js.Any], qMonthNames = qMonthNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICalenderStrings]
  }
}


package typings.qlikDashEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qDayNames = qDayNames, qLongDayNames = qLongDayNames, qLongMonthNames = qLongMonthNames, qMonthNames = qMonthNames)
  
    __obj.asInstanceOf[ICalenderStrings]
  }
}


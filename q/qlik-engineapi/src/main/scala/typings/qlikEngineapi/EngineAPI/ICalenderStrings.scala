package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CalenderStrings...
  */
@js.native
trait ICalenderStrings extends js.Object {
  
  /**
    * List of short day names.
    */
  var qDayNames: js.Array[String] = js.native
  
  /**
    * List of long day names.
    */
  var qLongDayNames: js.Array[String] = js.native
  
  /**
    * List of long month names.
    */
  var qLongMonthNames: js.Array[String] = js.native
  
  /**
    * List of short month names.
    */
  var qMonthNames: js.Array[String] = js.native
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
  
  @scala.inline
  implicit class ICalenderStringsOps[Self <: ICalenderStrings] (val x: Self) extends AnyVal {
    
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
    def setQDayNamesVarargs(value: String*): Self = this.set("qDayNames", js.Array(value :_*))
    
    @scala.inline
    def setQDayNames(value: js.Array[String]): Self = this.set("qDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLongDayNamesVarargs(value: String*): Self = this.set("qLongDayNames", js.Array(value :_*))
    
    @scala.inline
    def setQLongDayNames(value: js.Array[String]): Self = this.set("qLongDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLongMonthNamesVarargs(value: String*): Self = this.set("qLongMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setQLongMonthNames(value: js.Array[String]): Self = this.set("qLongMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMonthNamesVarargs(value: String*): Self = this.set("qMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setQMonthNames(value: js.Array[String]): Self = this.set("qMonthNames", value.asInstanceOf[js.Any])
  }
}

package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CalenderStrings...
  */
@js.native
trait ICalenderStrings extends StObject {
  
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
  implicit class ICalenderStringsMutableBuilder[Self <: ICalenderStrings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDayNames(value: js.Array[String]): Self = StObject.set(x, "qDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDayNamesVarargs(value: String*): Self = StObject.set(x, "qDayNames", js.Array(value :_*))
    
    @scala.inline
    def setQLongDayNames(value: js.Array[String]): Self = StObject.set(x, "qLongDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLongDayNamesVarargs(value: String*): Self = StObject.set(x, "qLongDayNames", js.Array(value :_*))
    
    @scala.inline
    def setQLongMonthNames(value: js.Array[String]): Self = StObject.set(x, "qLongMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLongMonthNamesVarargs(value: String*): Self = StObject.set(x, "qLongMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setQMonthNames(value: js.Array[String]): Self = StObject.set(x, "qMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMonthNamesVarargs(value: String*): Self = StObject.set(x, "qMonthNames", js.Array(value :_*))
  }
}

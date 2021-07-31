package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimeUtil {
  
  @JSGlobal("SP.DateTimeUtil.SimpleDate")
  @js.native
  class SimpleDate protected ()
    extends StObject
       with typings.sharepoint.SP.DateTimeUtil.SimpleDate {
    def this(year: Double, month: Double, day: Double, era: Double) = this()
    
    /* CompleteClass */
    override def get_day(): Double = js.native
    
    /* CompleteClass */
    override def get_era(): Double = js.native
    
    /* CompleteClass */
    override def get_month(): Double = js.native
    
    /* CompleteClass */
    override def get_year(): Double = js.native
    
    /* CompleteClass */
    override def set_day(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_era(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_month(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_year(value: Double): Unit = js.native
  }
  object SimpleDate {
    
    @JSGlobal("SP.DateTimeUtil.SimpleDate")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def dateEquals(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateEquals")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    @scala.inline
    def dateGreater(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateGreater")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    @scala.inline
    def dateGreaterEqual(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateGreaterEqual")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    @scala.inline
    def dateLess(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateLess")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    @scala.inline
    def dateLessEqual(
      date1: typings.sharepoint.SP.DateTimeUtil.SimpleDate,
      date2: typings.sharepoint.SP.DateTimeUtil.SimpleDate
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dateLessEqual")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}

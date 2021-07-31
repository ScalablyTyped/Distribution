package typings.strftime

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Format a local time/date according to locale settings
    * @param {string} format A format.
    * @return {string} Returns a string formatted.
    */
  @scala.inline
  def apply(format: String): String = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Format a local time/date according to locale settings
    * @param {string} format A format.
    * @param {Date}   date   A date.
    * @return {string} Returns a string formatted according format using the given date or the current local time.
    */
  @scala.inline
  def apply(format: String, date: Date): String = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("strftime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def localize(locale: Locale): strftimeFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("localize")(locale.asInstanceOf[js.Any]).asInstanceOf[strftimeFunction]
  
  @scala.inline
  def timezone(offset: String): strftimeFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("timezone")(offset.asInstanceOf[js.Any]).asInstanceOf[strftimeFunction]
  @scala.inline
  def timezone(offset: Double): strftimeFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("timezone")(offset.asInstanceOf[js.Any]).asInstanceOf[strftimeFunction]
  
  trait Locale extends StObject {
    
    var AM: js.UndefOr[String] = js.undefined
    
    var PM: js.UndefOr[String] = js.undefined
    
    var am: js.UndefOr[String] = js.undefined
    
    var days: js.UndefOr[js.Array[String]] = js.undefined
    
    var formats: LocaleFormats
    
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    var pm: js.UndefOr[String] = js.undefined
    
    var shortDays: js.UndefOr[js.Array[String]] = js.undefined
    
    var shortMonths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Locale {
    
    @scala.inline
    def apply(formats: LocaleFormats): Locale = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAM(value: String): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAMUndefined: Self = StObject.set(x, "AM", js.undefined)
      
      @scala.inline
      def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value :_*))
      
      @scala.inline
      def setFormats(value: LocaleFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setPM(value: String): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPMUndefined: Self = StObject.set(x, "PM", js.undefined)
      
      @scala.inline
      def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDaysUndefined: Self = StObject.set(x, "shortDays", js.undefined)
      
      @scala.inline
      def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value :_*))
      
      @scala.inline
      def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortMonthsUndefined: Self = StObject.set(x, "shortMonths", js.undefined)
      
      @scala.inline
      def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
    }
  }
  
  trait LocaleFormats extends StObject {
    
    var D: js.UndefOr[String] = js.undefined
    
    var F: js.UndefOr[String] = js.undefined
    
    var R: js.UndefOr[String] = js.undefined
    
    var T: js.UndefOr[String] = js.undefined
    
    var X: js.UndefOr[String] = js.undefined
    
    var c: js.UndefOr[String] = js.undefined
    
    var r: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[String] = js.undefined
  }
  object LocaleFormats {
    
    @scala.inline
    def apply(): LocaleFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleFormats]
    }
    
    @scala.inline
    implicit class LocaleFormatsMutableBuilder[Self <: LocaleFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "D", js.undefined)
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "F", js.undefined)
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "R", js.undefined)
      
      @scala.inline
      def setT(value: String): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTUndefined: Self = StObject.set(x, "T", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "X", js.undefined)
    }
  }
  
  type strftimeFunction = js.Function2[/* format */ String, /* date */ js.UndefOr[Date], String]
}

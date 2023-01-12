package typings.reactWidgets.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Century extends StObject {
  
  /**
    * A formatter for century, the default formats the first and last year of the century like: 1900 - 1999.
    */
  var century: Requireable[Any]
  
  /**
    * A formatter for day of the month
    *
    * @example ['prop', { date: "dt => String(dt.getDate())" }]
    */
  var date: Requireable[Any]
  
  /**
    * A formatter calendar days of the week, the default formats each day as a Narrow name: "Mo", "Tu", etc.
    *
    * @example ['prop', { day: "day => \n['🎉', 'M', 'T','W','Th', 'F', '🎉'][day.getDay()]" }]
    */
  var day: Requireable[Any]
  
  /**
    * A formatter for decade, the default formats the first and last year of the decade like: 2000 - 2009.
    */
  var decade: Requireable[Any]
  
  /**
    * A formatter for the Calendar footer, formats today's Date as a string.
    *
    * @example ['dateFormat', ['footerFormat', "{ date: 'medium' }", "date => 'Today is: ' + formatter(date)"]]
    */
  var footer: Requireable[Any]
  
  /**
    * A formatter for the header button of the month view.
    *
    * @example ['dateFormat', ['headerFormat', "{ date: 'medium' }"]]
    */
  var header: Requireable[Any]
  
  /**
    * A formatter for month name.
    *
    * @example ['dateFormat', ['monthFormat', "{ raw: 'MMMM' }", null, { defaultView: '"year"' }]]
    */
  var month: Requireable[Any]
  
  /**
    * A formatter for month name.
    *
    * @example ['dateFormat', ['yearFormat', "{ raw: 'yy' }", null, { defaultView: '"decade"' }]]
    */
  var year: Requireable[Any]
}
object Century {
  
  inline def apply(
    century: Requireable[Any],
    date: Requireable[Any],
    day: Requireable[Any],
    decade: Requireable[Any],
    footer: Requireable[Any],
    header: Requireable[Any],
    month: Requireable[Any],
    year: Requireable[Any]
  ): Century = {
    val __obj = js.Dynamic.literal(century = century.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], decade = decade.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Century]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Century] (val x: Self) extends AnyVal {
    
    inline def setCentury(value: Requireable[Any]): Self = StObject.set(x, "century", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Requireable[Any]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: Requireable[Any]): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDecade(value: Requireable[Any]): Self = StObject.set(x, "decade", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: Requireable[Any]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Requireable[Any]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Requireable[Any]): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Requireable[Any]): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}

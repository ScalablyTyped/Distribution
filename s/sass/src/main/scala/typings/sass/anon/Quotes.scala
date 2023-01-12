package typings.sass.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quotes extends StObject {
  
  var quotes: js.UndefOr[Boolean] = js.undefined
}
object Quotes {
  
  inline def apply(): Quotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quotes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quotes] (val x: Self) extends AnyVal {
    
    inline def setQuotes(value: Boolean): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
  }
}

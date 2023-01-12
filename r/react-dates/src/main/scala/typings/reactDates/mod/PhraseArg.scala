package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhraseArg extends StObject {
  
  var date: String
}
object PhraseArg {
  
  inline def apply(date: String): PhraseArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhraseArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhraseArg] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}

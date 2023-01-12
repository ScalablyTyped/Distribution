package typings.sass.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  /**
    * [[LegacyFileOptions.file]] if it was passed, otherwise the string
    * `"data"`.
    */
  var entry: String
  
  /**
    * The number of milliseconds between 1 January 1970 at 00:00:00 UTC and
    * the time at which Sass compilation began.
    */
  var start: Double
}
object Entry {
  
  inline def apply(entry: String, start: Double): Entry = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

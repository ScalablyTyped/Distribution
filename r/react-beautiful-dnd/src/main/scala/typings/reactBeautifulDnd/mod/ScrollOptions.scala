package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollOptions extends StObject {
  
  var shouldPublishImmediately: Boolean
}
object ScrollOptions {
  
  inline def apply(shouldPublishImmediately: Boolean): ScrollOptions = {
    val __obj = js.Dynamic.literal(shouldPublishImmediately = shouldPublishImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
  
  extension [Self <: ScrollOptions](x: Self) {
    
    inline def setShouldPublishImmediately(value: Boolean): Self = StObject.set(x, "shouldPublishImmediately", value.asInstanceOf[js.Any])
  }
}

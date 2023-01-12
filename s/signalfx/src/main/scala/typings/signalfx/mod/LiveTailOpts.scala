package typings.signalfx.mod

import typings.signalfx.anon.Matcher
import typings.signalfx.anon.Rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveTailOpts extends StObject {
  
  var query: Matcher
  
  var throttleOptions: Rate
}
object LiveTailOpts {
  
  inline def apply(query: Matcher, throttleOptions: Rate): LiveTailOpts = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], throttleOptions = throttleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTailOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveTailOpts] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Matcher): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setThrottleOptions(value: Rate): Self = StObject.set(x, "throttleOptions", value.asInstanceOf[js.Any])
  }
}

package typings.sentryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartOnChildSpanChange extends StObject {
  
  var restartOnChildSpanChange: js.UndefOr[Boolean] = js.undefined
}
object RestartOnChildSpanChange {
  
  inline def apply(): RestartOnChildSpanChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestartOnChildSpanChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestartOnChildSpanChange] (val x: Self) extends AnyVal {
    
    inline def setRestartOnChildSpanChange(value: Boolean): Self = StObject.set(x, "restartOnChildSpanChange", value.asInstanceOf[js.Any])
    
    inline def setRestartOnChildSpanChangeUndefined: Self = StObject.set(x, "restartOnChildSpanChange", js.undefined)
  }
}

package typings.std.anon

import typings.std.stdBooleans.`true`
import typings.std.stdStrings.`timed-out`
import typings.std.stdStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /* standard es2022.sharedmemory */
  var async: `true`
  
  /* standard es2022.sharedmemory */
  var value: js.Promise[ok | `timed-out`]
}
object Value {
  
  inline def apply(value: js.Promise[ok | `timed-out`]): Value = {
    val __obj = js.Dynamic.literal(async = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Promise[ok | `timed-out`]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.std.anon

import typings.std.stdBooleans.`false`
import typings.std.stdStrings.`not-equal`
import typings.std.stdStrings.`timed-out`
import typings.std.stdStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  /* standard es2022.sharedmemory */
  var async: `false`
  
  /* standard es2022.sharedmemory */
  var value: ok | `not-equal` | `timed-out`
}
object Async {
  
  inline def apply(value: ok | `not-equal` | `timed-out`): Async = {
    val __obj = js.Dynamic.literal(async = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  extension [Self <: Async](x: Self) {
    
    inline def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ok | `not-equal` | `timed-out`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with RollupWatcherEvent {
  
  var code: END
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(code = "END")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setCode(value: END): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}

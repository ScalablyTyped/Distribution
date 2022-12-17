package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with RollupWatcherEvent {
  
  var code: START
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(code = "START")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setCode(value: START): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}

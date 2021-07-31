package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with RollupWatcherEvent {
  
  var code: END
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal(code = "END")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: END): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}

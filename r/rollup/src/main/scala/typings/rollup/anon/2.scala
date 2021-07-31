package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with RollupWatcherEvent {
  
  var code: START
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal(code = "START")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: START): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}

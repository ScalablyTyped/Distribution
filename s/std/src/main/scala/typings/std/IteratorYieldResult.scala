package typings.std

import typings.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IteratorYieldResult[TYield]
  extends StObject
     with IteratorResult[TYield, js.Any] {
  
  var done: js.UndefOr[`false`] = js.undefined
  
  var value: TYield
}
object IteratorYieldResult {
  
  @scala.inline
  def apply[TYield](value: TYield): IteratorYieldResult[TYield] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorYieldResult[TYield]]
  }
  
  @scala.inline
  implicit class IteratorYieldResultMutableBuilder[Self <: IteratorYieldResult[?], TYield] (val x: Self & IteratorYieldResult[TYield]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setValue(value: TYield): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

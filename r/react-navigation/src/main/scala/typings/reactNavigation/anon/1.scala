package typings.reactNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[P] extends StObject {
  
  var params: js.UndefOr[P] = js.undefined
}
object `1` {
  
  @scala.inline
  def apply[P](): `1`[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[P]]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`[?], P] (val x: Self & `1`[P]) extends AnyVal {
    
    @scala.inline
    def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}

package typings.reactSpringCore.mod

import typings.reactSpringShared.mod.FluidValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait AnimationRange[T] extends StObject {
  
  var from: js.UndefOr[T | (FluidValue[T, scala.Any])] = js.undefined
  
  var to: js.UndefOr[T | (FluidValue[T, scala.Any])] = js.undefined
}
object AnimationRange {
  
  inline def apply[T](): AnimationRange[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationRange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationRange[?], T] (val x: Self & AnimationRange[T]) extends AnyVal {
    
    inline def setFrom(value: T | (FluidValue[T, scala.Any])): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: T | (FluidValue[T, scala.Any])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}

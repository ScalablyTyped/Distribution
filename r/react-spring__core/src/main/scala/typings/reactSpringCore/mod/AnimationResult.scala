package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The object given to the `onRest` prop and `start` promise. */
trait AnimationResult[T /* <: Readable[scala.Any] */] extends StObject {
  
  /** When true, the animation was cancelled before it could finish. */
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  /** When true, the animation was neither cancelled nor stopped prematurely. */
  var finished: js.UndefOr[Boolean] = js.undefined
  
  /** When true, no animation ever started. */
  var noop: js.UndefOr[Boolean] = js.undefined
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/core.@react-spring/core.Readable<infer U> ? U : never */ js.Any
}
object AnimationResult {
  
  inline def apply[T /* <: Readable[scala.Any] */](
    value: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/core.@react-spring/core.Readable<infer U> ? U : never */ js.Any
  ): AnimationResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationResult[?], T /* <: Readable[scala.Any] */] (val x: Self & AnimationResult[T]) extends AnyVal {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    inline def setNoopUndefined: Self = StObject.set(x, "noop", js.undefined)
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/core.@react-spring/core.Readable<infer U> ? U : never */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

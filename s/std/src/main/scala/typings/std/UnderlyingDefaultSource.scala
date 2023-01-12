package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingDefaultSource[R] extends StObject {
  
  /* standard dom */
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.undefined
  
  /* standard dom */
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | PromiseLike[Unit]]
  ] = js.undefined
  
  /* standard dom */
  var start: js.UndefOr[js.Function1[/* controller */ ReadableStreamDefaultController[R], Any]] = js.undefined
  
  /* standard dom */
  var `type`: Unit
}
object UnderlyingDefaultSource {
  
  inline def apply[R](`type`: Unit): UnderlyingDefaultSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingDefaultSource[R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnderlyingDefaultSource[?], R] (val x: Self & UnderlyingDefaultSource[R]) extends AnyVal {
    
    inline def setCancel(value: /* reason */ js.UndefOr[Any] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableStreamDefaultController[R] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableStreamDefaultController[R] => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

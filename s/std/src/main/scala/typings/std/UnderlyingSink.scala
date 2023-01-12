package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingSink[W] extends StObject {
  
  /* standard dom */
  var abort: js.UndefOr[UnderlyingSinkAbortCallback] = js.undefined
  
  /* standard dom */
  var close: js.UndefOr[UnderlyingSinkCloseCallback] = js.undefined
  
  /* standard dom */
  var start: js.UndefOr[UnderlyingSinkStartCallback] = js.undefined
  
  /* standard dom */
  var `type`: Unit
  
  /* standard dom */
  var write: js.UndefOr[UnderlyingSinkWriteCallback[W]] = js.undefined
}
object UnderlyingSink {
  
  inline def apply[W](`type`: Unit): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnderlyingSink[?], W] (val x: Self & UnderlyingSink[W]) extends AnyVal {
    
    inline def setAbort(value: /* reason */ js.UndefOr[Any] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setClose(value: () => Unit | PromiseLike[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setStart(value: /* controller */ WritableStreamDefaultController => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: (W, /* controller */ WritableStreamDefaultController) => Unit | PromiseLike[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}

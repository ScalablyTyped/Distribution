package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformer[I, O] extends StObject {
  
  /* standard dom */
  var flush: js.UndefOr[TransformerFlushCallback[O]] = js.undefined
  
  /* standard dom */
  var readableType: Unit
  
  /* standard dom */
  var start: js.UndefOr[TransformerStartCallback[O]] = js.undefined
  
  /* standard dom */
  var transform: js.UndefOr[TransformerTransformCallback[I, O]] = js.undefined
  
  /* standard dom */
  var writableType: Unit
}
object Transformer {
  
  inline def apply[I, O](readableType: Unit, writableType: Unit): Transformer[I, O] = {
    val __obj = js.Dynamic.literal(readableType = readableType.asInstanceOf[js.Any], writableType = writableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformer[I, O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transformer[?, ?], I, O] (val x: Self & (Transformer[I, O])) extends AnyVal {
    
    inline def setFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setReadableType(value: Unit): Self = StObject.set(x, "readableType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: /* controller */ TransformStreamDefaultController[O] => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | PromiseLike[Unit]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWritableType(value: Unit): Self = StObject.set(x, "writableType", value.asInstanceOf[js.Any])
  }
}

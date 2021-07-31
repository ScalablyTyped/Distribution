package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformer[I, O] extends StObject {
  
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.undefined
  
  var readableType: Unit
  
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.undefined
  
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[I, O]] = js.undefined
  
  var writableType: Unit
}
object Transformer {
  
  @scala.inline
  def apply[I, O](readableType: Unit, writableType: Unit): Transformer[I, O] = {
    val __obj = js.Dynamic.literal(readableType = readableType.asInstanceOf[js.Any], writableType = writableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformer[I, O]]
  }
  
  @scala.inline
  implicit class TransformerMutableBuilder[Self <: Transformer[?, ?], I, O] (val x: Self & (Transformer[I, O])) extends AnyVal {
    
    @scala.inline
    def setFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setReadableType(value: Unit): Self = StObject.set(x, "readableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Thenable[Unit]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setWritableType(value: Unit): Self = StObject.set(x, "writableType", value.asInstanceOf[js.Any])
  }
}

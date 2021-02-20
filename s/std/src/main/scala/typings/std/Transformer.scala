package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer[I, O] extends StObject {
  
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.native
  
  var readableType: js.UndefOr[scala.Nothing] = js.native
  
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.native
  
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[I, O]] = js.native
  
  var writableType: js.UndefOr[scala.Nothing] = js.native
}
object Transformer {
  
  @scala.inline
  def apply[I, O](): Transformer[I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transformer[I, O]]
  }
  
  @scala.inline
  implicit class TransformerMutableBuilder[Self <: Transformer[_, _], I, O] (val x: Self with (Transformer[I, O])) extends AnyVal {
    
    @scala.inline
    def setFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Thenable[Unit]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}

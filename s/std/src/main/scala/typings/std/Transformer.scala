package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformer[I, O] extends js.Object {
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
  implicit class TransformerOps[Self <: Transformer[_, _], I, O] (val x: Self with (Transformer[I, O])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self = this.set("flush", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    @scala.inline
    def setStart(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Thenable[Unit]): Self = this.set("transform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}


package typings.sliceSource.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceSource extends js.Object {
  
  def cancel(): js.Promise[Unit] = js.native
  
  def read(): js.Promise[SliceChunk] = js.native
  
  def slice(length: Double): js.Promise[Uint8Array] = js.native
}
object SliceSource {
  
  @scala.inline
  def apply(
    cancel: () => js.Promise[Unit],
    read: () => js.Promise[SliceChunk],
    slice: Double => js.Promise[Uint8Array]
  ): SliceSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), slice = js.Any.fromFunction1(slice))
    __obj.asInstanceOf[SliceSource]
  }
  
  @scala.inline
  implicit class SliceSourceOps[Self <: SliceSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: () => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRead(value: () => js.Promise[SliceChunk]): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlice(value: Double => js.Promise[Uint8Array]): Self = this.set("slice", js.Any.fromFunction1(value))
  }
}

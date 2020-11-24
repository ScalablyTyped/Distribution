package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
@js.native
trait ArrayBufferTypes extends js.Object {
  
  var ArrayBuffer: typings.std.ArrayBuffer = js.native
  
  var SharedArrayBuffer: typings.std.SharedArrayBuffer = js.native
}
object ArrayBufferTypes {
  
  @scala.inline
  def apply(ArrayBuffer: ArrayBuffer, SharedArrayBuffer: SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferTypes]
  }
  
  @scala.inline
  implicit class ArrayBufferTypesOps[Self <: ArrayBufferTypes] (val x: Self) extends AnyVal {
    
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
    def setArrayBuffer(value: ArrayBuffer): Self = this.set("ArrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedArrayBuffer(value: SharedArrayBuffer): Self = this.set("SharedArrayBuffer", value.asInstanceOf[js.Any])
  }
}

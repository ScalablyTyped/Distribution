package typings.std.anon

import typings.std.ReadableStream
import typings.std.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Readable[R, T] extends js.Object {
  var readable: ReadableStream[T] = js.native
  var writable: WritableStream[R] = js.native
}

object Readable {
  @scala.inline
  def apply[R, T](readable: ReadableStream[T], writable: WritableStream[R]): Readable[R, T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readable[R, T]]
  }
  @scala.inline
  implicit class ReadableOps[Self <: Readable[_, _], R, T] (val x: Self with (Readable[R, T])) extends AnyVal {
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
    def setReadable(value: ReadableStream[T]): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritable(value: WritableStream[R]): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
  
}


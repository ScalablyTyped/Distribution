package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamReader[R] extends js.Object {
  def cancel(): js.Promise[Unit] = js.native
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  def releaseLock(): Unit = js.native
}

object ReadableStreamReader {
  @scala.inline
  def apply[R](
    cancel: () => js.Promise[Unit],
    read: () => js.Promise[ReadableStreamReadResult[R]],
    releaseLock: () => Unit
  ): ReadableStreamReader[R] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), releaseLock = js.Any.fromFunction0(releaseLock))
    __obj.asInstanceOf[ReadableStreamReader[R]]
  }
  @scala.inline
  implicit class ReadableStreamReaderOps[Self <: ReadableStreamReader[_], R] (val x: Self with ReadableStreamReader[R]) extends AnyVal {
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
    def setCancel(value: () => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setRead(value: () => js.Promise[ReadableStreamReadResult[R]]): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setReleaseLock(value: () => Unit): Self = this.set("releaseLock", js.Any.fromFunction0(value))
  }
  
}


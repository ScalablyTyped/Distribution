package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends js.Object {
  
  def atEnd(): Boolean = js.native
  
  def close(): Unit = js.native
  
  def flush(): Unit = js.native
  
  def read(): String = js.native
  
  def readLine(): String = js.native
  
  def seek(position: Double): Unit = js.native
  
  def write(data: String): Unit = js.native
  
  def writeLine(data: String): Unit = js.native
}
object Stream {
  
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    close: () => Unit,
    flush: () => Unit,
    read: () => String,
    readLine: () => String,
    seek: Double => Unit,
    write: String => Unit,
    writeLine: String => Unit
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), read = js.Any.fromFunction0(read), readLine = js.Any.fromFunction0(readLine), seek = js.Any.fromFunction1(seek), write = js.Any.fromFunction1(write), writeLine = js.Any.fromFunction1(writeLine))
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
    
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
    def setAtEnd(value: () => Boolean): Self = this.set("atEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRead(value: () => String): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadLine(value: () => String): Self = this.set("readLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteLine(value: String => Unit): Self = this.set("writeLine", js.Any.fromFunction1(value))
  }
}

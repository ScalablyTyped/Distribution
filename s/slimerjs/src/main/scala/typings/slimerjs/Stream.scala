package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  def atEnd(): Boolean
  
  def close(): Unit
  
  def flush(): Unit
  
  def read(): String
  
  def readLine(): String
  
  def seek(position: Double): Unit
  
  def write(data: String): Unit
  
  def writeLine(data: String): Unit
}
object Stream {
  
  inline def apply(
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
  
  extension [Self <: Stream](x: Self) {
    
    inline def setAtEnd(value: () => Boolean): Self = StObject.set(x, "atEnd", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setRead(value: () => String): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReadLine(value: () => String): Self = StObject.set(x, "readLine", js.Any.fromFunction0(value))
    
    inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    inline def setWriteLine(value: String => Unit): Self = StObject.set(x, "writeLine", js.Any.fromFunction1(value))
  }
}

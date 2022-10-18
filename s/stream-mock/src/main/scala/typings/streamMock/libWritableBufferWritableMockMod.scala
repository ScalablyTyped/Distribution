package typings.streamMock

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.WritableOptions
import typings.streamMock.libWritableIwritablemockMod.IWritableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritableBufferWritableMockMod {
  
  @JSImport("stream-mock/lib/writable/BufferWritableMock", JSImport.Default)
  @js.native
  open class default () extends BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  trait BufferWritableMock extends IWritableMock {
    
    def _write(
      chunk: String,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def _write(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    @JSName("data")
    var data_BufferWritableMock: js.Array[Buffer] = js.native
    
    @JSName("flatData")
    var flatData_BufferWritableMock: Buffer = js.native
  }
}

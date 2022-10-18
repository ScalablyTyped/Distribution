package typings.streamMock

import typings.node.streamMod.WritableOptions
import typings.streamMock.libWritableBufferWritableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritableMod {
  
  @JSImport("stream-mock/lib/writable", "BufferWritableMock")
  @js.native
  open class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "ObjectWritableMock")
  @js.native
  open class ObjectWritableMock ()
    extends typings.streamMock.libWritableObjectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "WritableMock")
  @js.native
  open class WritableMock ()
    extends typings.streamMock.libWritableWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
}

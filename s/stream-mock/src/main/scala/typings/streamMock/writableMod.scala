package typings.streamMock

import typings.node.streamMod.WritableOptions
import typings.streamMock.bufferWritableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writableMod {
  
  @JSImport("stream-mock/lib/writable", "BufferWritableMock")
  @js.native
  open class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "ObjectWritableMock")
  @js.native
  open class ObjectWritableMock ()
    extends typings.streamMock.objectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "WritableMock")
  @js.native
  open class WritableMock ()
    extends typings.streamMock.writableMockMod.default {
    def this(options: WritableOptions) = this()
  }
}

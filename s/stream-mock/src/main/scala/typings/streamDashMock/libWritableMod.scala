package typings.streamDashMock

import typings.node.streamMod.WritableOptions
import typings.streamDashMock.libWritableBufferWritableMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable", JSImport.Namespace)
@js.native
object libWritableMod extends js.Object {
  @js.native
  class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typings.streamDashMock.libWritableObjectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typings.streamDashMock.libWritableWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
}


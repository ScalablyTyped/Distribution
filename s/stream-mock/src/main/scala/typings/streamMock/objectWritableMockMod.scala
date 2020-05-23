package typings.streamMock

import typings.node.streamMod.WritableOptions
import typings.streamMock.iwritablemockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable/ObjectWritableMock", JSImport.Namespace)
@js.native
object objectWritableMockMod extends js.Object {
  @js.native
  trait ObjectWritableMock extends IWritableMock {
    @JSName("data")
    var data_ObjectWritableMock: js.Array[_] = js.native
    @JSName("flatData")
    var flatData_ObjectWritableMock: js.Array[_] = js.native
  }
  
  @js.native
  class default () extends ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
}


package typings.streamDashMock

import typings.node.Buffer
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable/IWritableMock", JSImport.Namespace)
@js.native
object libWritableIWritableMockMod extends js.Object {
  @js.native
  trait IWritableMock extends Writable {
    var data: js.Array[_] | Buffer = js.native
    var flatData: js.Array[_] | Buffer = js.native
  }
  
}


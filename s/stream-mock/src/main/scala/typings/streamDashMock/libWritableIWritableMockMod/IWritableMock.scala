package typings.streamDashMock.libWritableIWritableMockMod

import typings.node.Buffer
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWritableMock extends Writable {
  var data: js.Array[_] | Buffer = js.native
  var flatData: js.Array[_] | Buffer = js.native
}


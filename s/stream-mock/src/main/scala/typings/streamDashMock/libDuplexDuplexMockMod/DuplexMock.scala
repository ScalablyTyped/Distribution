package typings.streamDashMock.libDuplexDuplexMockMod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Duplex
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.streamDashMock.libReadableIReadableMockMod.IReadableMock because var conflicts: destroyed, readable. Inlined it- typings.streamDashMock.libWritableIWritableMockMod.IWritableMock because Inheritance from two classes. Inlined data, flatData */ @js.native
trait DuplexMock extends Duplex {
  var _readableState: js.Any = js.native
  var _writableState: js.Any = js.native
  var data: js.Array[_] | Buffer = js.native
  var encoding: BufferEncoding = js.native
  var flatData: js.Array[_] | Buffer = js.native
  var it: IterableIterator[_] = js.native
  var objectMode: Boolean = js.native
}


package typings
package streamDashMockLib.libDuplexDuplexMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- streamDashMockLib.libReadableIReadableMockMod.IReadableMock because var conflicts: readable. Inlined it- streamDashMockLib.libWritableIWritableMockMod.IWritableMock because Inheritance from two classes. Inlined data, flatData */ @js.native
trait DuplexMock
  extends nodeLib.streamMod.Duplex {
  var _readableState: js.Any = js.native
  var _writableState: js.Any = js.native
  var data: js.Array[_] | nodeLib.Buffer = js.native
  var encoding: nodeLib.BufferEncoding = js.native
  var flatData: js.Array[_] | nodeLib.Buffer = js.native
  var it: stdLib.IterableIterator[_] = js.native
  var objectMode: scala.Boolean = js.native
  val readableObjectMode: scala.Boolean = js.native
  val writableObjectMode: scala.Boolean = js.native
}


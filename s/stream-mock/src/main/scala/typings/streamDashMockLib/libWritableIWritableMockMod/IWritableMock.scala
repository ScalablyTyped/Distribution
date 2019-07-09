package typings
package streamDashMockLib.libWritableIWritableMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWritableMock
  extends nodeLib.streamMod.Writable {
  var data: js.Array[_] | nodeLib.Buffer = js.native
  var flatData: js.Array[_] | nodeLib.Buffer = js.native
}


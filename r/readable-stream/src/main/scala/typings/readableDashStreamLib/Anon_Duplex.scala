package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duplex extends js.Object {
  var Duplex: nodeLib.streamMod.Duplex
  var PassThrough: nodeLib.streamMod.PassThrough
  var Readable: nodeLib.streamMod.Readable
  var Stream: nodeLib.streamMod.namespaced
  var Transform: nodeLib.streamMod.Transform
  var Writable: nodeLib.streamMod.Writable
}

object Anon_Duplex {
  @scala.inline
  def apply(
    Duplex: nodeLib.streamMod.Duplex,
    PassThrough: nodeLib.streamMod.PassThrough,
    Readable: nodeLib.streamMod.Readable,
    Stream: nodeLib.streamMod.namespaced,
    Transform: nodeLib.streamMod.Transform,
    Writable: nodeLib.streamMod.Writable
  ): Anon_Duplex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Duplex")(Duplex)
    __obj.updateDynamic("PassThrough")(PassThrough)
    __obj.updateDynamic("Readable")(Readable)
    __obj.updateDynamic("Stream")(Stream)
    __obj.updateDynamic("Transform")(Transform)
    __obj.updateDynamic("Writable")(Writable)
    __obj.asInstanceOf[Anon_Duplex]
  }
}


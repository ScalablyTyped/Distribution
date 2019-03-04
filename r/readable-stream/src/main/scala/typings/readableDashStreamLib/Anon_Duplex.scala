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
    val __obj = js.Dynamic.literal(Duplex = Duplex, PassThrough = PassThrough, Readable = Readable, Stream = Stream, Transform = Transform, Writable = Writable)
  
    __obj.asInstanceOf[Anon_Duplex]
  }
}


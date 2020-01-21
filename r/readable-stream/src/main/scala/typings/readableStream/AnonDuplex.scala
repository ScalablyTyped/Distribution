package typings.readableStream

import typings.node.streamMod.Duplex
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.Writable
import typings.node.streamMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuplex extends js.Object {
  var Duplex: typings.node.streamMod.Duplex
  var PassThrough: typings.node.streamMod.PassThrough
  var Readable: typings.node.streamMod.Readable
  var Stream: ^
  var Transform: typings.node.streamMod.Transform
  var Writable: typings.node.streamMod.Writable
}

object AnonDuplex {
  @scala.inline
  def apply(
    Duplex: Duplex,
    PassThrough: PassThrough,
    Readable: Readable,
    Stream: ^,
    Transform: Transform,
    Writable: Writable
  ): AnonDuplex = {
    val __obj = js.Dynamic.literal(Duplex = Duplex.asInstanceOf[js.Any], PassThrough = PassThrough.asInstanceOf[js.Any], Readable = Readable.asInstanceOf[js.Any], Stream = Stream.asInstanceOf[js.Any], Transform = Transform.asInstanceOf[js.Any], Writable = Writable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuplex]
  }
}


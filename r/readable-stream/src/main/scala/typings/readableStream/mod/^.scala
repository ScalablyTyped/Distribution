package typings.readableStream.mod

import typings.readableStream.AnonDuplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readable-stream", JSImport.Namespace)
@js.native
class ^ () extends _Readable {
  def this(options: ReadableOptions) = this()
}

@JSImport("readable-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // if (process.env.READABLE_STREAM === 'disable' && Stream)
  var NodeBaseExport: typings.node.streamMod.Readable with AnonDuplex = js.native
}


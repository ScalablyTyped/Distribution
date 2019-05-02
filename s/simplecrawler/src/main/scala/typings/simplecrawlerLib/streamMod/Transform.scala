package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(opts: TransformOptions) = this()
  def _transform(chunk: js.Any, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
}


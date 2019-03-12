package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferRequest extends js.Object {
  var chunk: js.Any = js.native
   // TODO
  var encoding: java.lang.String = js.native
  var isBuf: scala.Boolean = js.native
  var next: BufferRequest | scala.Null = js.native
  def callback(): scala.Unit = js.native
  def callback(error: stdLib.Error): scala.Unit = js.native
}


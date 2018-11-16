package typings
package shapefileLib.shapefileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Source[RecordType] extends js.Object {
  var bbox: js.Array[scala.Double]
  def cancel(): stdLib.Promise[scala.Unit]
  def read(): stdLib.Promise[shapefileLib.Anon_Done[RecordType]]
}


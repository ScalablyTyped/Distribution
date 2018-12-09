package typings
package shapefileLib.shapefileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Source[RecordType] extends js.Object {
  var bbox: js.Array[scala.Double]
  def cancel(): js.Promise[scala.Unit]
  def read(): js.Promise[shapefileLib.Anon_Done[RecordType]]
}


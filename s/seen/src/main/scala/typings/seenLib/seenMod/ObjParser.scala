package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "ObjParser")
@js.native
class ObjParser () extends js.Object {
  var commands: seenLib.Anon_F = js.native
  var faces: js.Array[js.Array[scala.Double]] = js.native
  var vertices: js.Array[js.Array[scala.Double]] = js.native
  def mapFacePoints(faceMap: js.Function1[/* points */ js.Array[Point], _]): scala.Unit = js.native
  def parse(contents: java.lang.String): scala.Unit = js.native
}


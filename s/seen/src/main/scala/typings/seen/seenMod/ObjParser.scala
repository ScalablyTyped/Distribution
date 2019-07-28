package typings.seen.seenMod

import typings.seen.Anon_F
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "ObjParser")
@js.native
class ObjParser () extends js.Object {
  var commands: Anon_F = js.native
  var faces: js.Array[js.Array[Double]] = js.native
  var vertices: js.Array[js.Array[Double]] = js.native
  def mapFacePoints(faceMap: js.Function1[/* points */ js.Array[Point], _]): Unit = js.native
  def parse(contents: String): Unit = js.native
}


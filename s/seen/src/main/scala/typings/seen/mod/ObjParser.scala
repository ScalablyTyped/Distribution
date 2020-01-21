package typings.seen.mod

import typings.seen.AnonF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "ObjParser")
@js.native
class ObjParser () extends js.Object {
  var commands: AnonF = js.native
  var faces: js.Array[js.Array[Double]] = js.native
  var vertices: js.Array[js.Array[Double]] = js.native
  def mapFacePoints(faceMap: js.Function1[/* points */ js.Array[Point], _]): Unit = js.native
  def parse(contents: String): Unit = js.native
}


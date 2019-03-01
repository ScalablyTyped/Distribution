package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingBoxLines extends js.Object {
  var boundingBox: java.lang.String
  var lines: js.Array[Anon_BoundingBoxWords]
}

object Anon_BoundingBoxLines {
  @scala.inline
  def apply(boundingBox: java.lang.String, lines: js.Array[Anon_BoundingBoxWords]): Anon_BoundingBoxLines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingBox")(boundingBox)
    __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[Anon_BoundingBoxLines]
  }
}


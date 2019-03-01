package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingBoxWords extends js.Object {
  var boundingBox: java.lang.String
  var words: js.Array[Anon_BoundingBox]
}

object Anon_BoundingBoxWords {
  @scala.inline
  def apply(boundingBox: java.lang.String, words: js.Array[Anon_BoundingBox]): Anon_BoundingBoxWords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingBox")(boundingBox)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Anon_BoundingBoxWords]
  }
}


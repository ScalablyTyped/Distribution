package typings.projectDashOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingBoxWords extends js.Object {
  var boundingBox: String
  var words: js.Array[Anon_BoundingBox]
}

object Anon_BoundingBoxWords {
  @scala.inline
  def apply(boundingBox: String, words: js.Array[Anon_BoundingBox]): Anon_BoundingBoxWords = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox, words = words)
  
    __obj.asInstanceOf[Anon_BoundingBoxWords]
  }
}


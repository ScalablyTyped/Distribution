package typings.projectOxford.mod.FaceResponses

import typings.projectOxford.AnonConfidence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identify extends js.Object {
  var candidates: js.Array[AnonConfidence]
  var faceId: String
}

object Identify {
  @scala.inline
  def apply(candidates: js.Array[AnonConfidence], faceId: String): Identify = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identify]
  }
}


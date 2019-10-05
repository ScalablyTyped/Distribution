package typings.projectDashOxford.projectDashOxfordMod.FaceResponses

import typings.projectDashOxford.Anon_Confidence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identify extends js.Object {
  var candidates: js.Array[Anon_Confidence]
  var faceId: String
}

object Identify {
  @scala.inline
  def apply(candidates: js.Array[Anon_Confidence], faceId: String): Identify = {
    val __obj = js.Dynamic.literal(candidates = candidates, faceId = faceId)
  
    __obj.asInstanceOf[Identify]
  }
}


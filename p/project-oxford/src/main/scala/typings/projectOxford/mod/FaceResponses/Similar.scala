package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Similar extends js.Object {
  var faceIds: js.Array[String]
}

object Similar {
  @scala.inline
  def apply(faceIds: js.Array[String]): Similar = {
    val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Similar]
  }
}


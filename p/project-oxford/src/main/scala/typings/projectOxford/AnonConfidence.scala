package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfidence extends js.Object {
  var confidence: Double
  var personId: String
}

object AnonConfidence {
  @scala.inline
  def apply(confidence: Double, personId: String): AnonConfidence = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfidence]
  }
}


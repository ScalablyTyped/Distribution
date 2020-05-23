package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confidence extends js.Object {
  var confidence: Double
  var personId: String
}

object Confidence {
  @scala.inline
  def apply(confidence: Double, personId: String): Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confidence]
  }
}


package typings.projectDashOxford.projectDashOxfordMod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verify extends js.Object {
  var confidence: Double
  var isIdentical: Boolean
}

object Verify {
  @scala.inline
  def apply(confidence: Double, isIdentical: Boolean): Verify = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], isIdentical = isIdentical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Verify]
  }
}


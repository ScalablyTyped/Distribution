package typings.projectDashOxford.projectDashOxfordMod.FaceResponsesNs

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
    val __obj = js.Dynamic.literal(confidence = confidence, isIdentical = isIdentical)
  
    __obj.asInstanceOf[Verify]
  }
}


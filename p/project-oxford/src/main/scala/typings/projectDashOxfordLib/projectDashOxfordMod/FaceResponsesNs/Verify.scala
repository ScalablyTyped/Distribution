package typings
package projectDashOxfordLib.projectDashOxfordMod.FaceResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verify extends js.Object {
  var confidence: scala.Double
  var isIdentical: scala.Boolean
}

object Verify {
  @scala.inline
  def apply(confidence: scala.Double, isIdentical: scala.Boolean): Verify = {
    val __obj = js.Dynamic.literal(confidence = confidence, isIdentical = isIdentical)
  
    __obj.asInstanceOf[Verify]
  }
}


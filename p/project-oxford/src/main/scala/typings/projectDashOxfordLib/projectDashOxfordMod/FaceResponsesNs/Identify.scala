package typings
package projectDashOxfordLib.projectDashOxfordMod.FaceResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identify extends js.Object {
  var candidates: js.Array[projectDashOxfordLib.Anon_Confidence]
  var faceId: java.lang.String
}

object Identify {
  @scala.inline
  def apply(candidates: js.Array[projectDashOxfordLib.Anon_Confidence], faceId: java.lang.String): Identify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("candidates")(candidates)
    __obj.updateDynamic("faceId")(faceId)
    __obj.asInstanceOf[Identify]
  }
}


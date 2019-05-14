package typings
package reactDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementType extends js.Object {
  var elementType: js.Any
  var poseConfig: popmotionDashPoseLib.libTypesMod.DomPopmotionConfig | reactDashPoseLib.libComponentsPoseElementTypesMod.ConfigFactory
}

object Anon_ElementType {
  @scala.inline
  def apply(
    elementType: js.Any,
    poseConfig: popmotionDashPoseLib.libTypesMod.DomPopmotionConfig | reactDashPoseLib.libComponentsPoseElementTypesMod.ConfigFactory
  ): Anon_ElementType = {
    val __obj = js.Dynamic.literal(elementType = elementType, poseConfig = poseConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ElementType]
  }
}


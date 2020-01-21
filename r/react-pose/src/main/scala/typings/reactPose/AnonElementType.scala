package typings.reactPose

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.reactPose.typesMod.ConfigFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementType extends js.Object {
  var elementType: js.Any
  var poseConfig: DomPopmotionConfig | ConfigFactory
}

object AnonElementType {
  @scala.inline
  def apply(elementType: js.Any, poseConfig: DomPopmotionConfig | ConfigFactory): AnonElementType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElementType]
  }
}


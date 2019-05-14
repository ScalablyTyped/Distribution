package typings
package reactDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPosedMod {
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[
      popmotionDashPoseLib.libTypesMod.DomPopmotionConfig | DomPopmotionConfigFactory[T]
    ], 
    reactLib.reactMod.ComponentType[reactDashPoseLib.libComponentsPoseElementTypesMod.PoseElementProps with T]
  ]
  type DomPopmotionConfigFactory[T] = js.Function1[
    /* props */ reactDashPoseLib.libComponentsPoseElementTypesMod.PoseElementProps with T, 
    popmotionDashPoseLib.libTypesMod.DomPopmotionConfig
  ]
}

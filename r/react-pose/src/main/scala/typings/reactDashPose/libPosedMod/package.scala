package typings.reactDashPose

import typings.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typings.react.reactMod.ComponentType
import typings.reactDashPose.libComponentsPoseElementTypesMod.PoseElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPosedMod {
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[DomPopmotionConfig | DomPopmotionConfigFactory[T]], 
    ComponentType[PoseElementProps with T]
  ]
  type DomPopmotionConfigFactory[T] = js.Function1[/* props */ PoseElementProps with T, DomPopmotionConfig]
}

package typings.reactDashPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLProps
import typings.reactDashPose.libComponentsPoseElementTypesMod.PoseElementProps
import typings.reactDashPose.libPosedMod.ComponentFactory
import typings.reactDashPose.libPosedMod.DomPopmotionConfigFactory
import typings.reactDashPose.libPosedMod.Posed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/posed", JSImport.Namespace)
@js.native
object libPosedMod extends js.Object {
  @js.native
  trait Posed extends /* key */ StringDictionary[ComponentFactory[HTMLProps[_]]] {
    def apply[T](component: ComponentType[T]): ComponentFactory[T] = js.native
  }
  
  val default: Posed = js.native
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[DomPopmotionConfig | DomPopmotionConfigFactory[T]], 
    ComponentType[PoseElementProps with T]
  ]
  type DomPopmotionConfigFactory[T] = js.Function1[/* props */ PoseElementProps with T, DomPopmotionConfig]
}


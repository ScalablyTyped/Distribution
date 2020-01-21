package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.reactPose.typesMod.PoseElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/posed", JSImport.Namespace)
@js.native
object posedMod extends js.Object {
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


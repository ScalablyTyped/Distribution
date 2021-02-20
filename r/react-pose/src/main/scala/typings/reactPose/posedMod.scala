package typings.reactPose

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.reactPose.typesMod.PoseElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object posedMod extends Shortcut {
  
  @JSImport("react-pose/lib/posed", JSImport.Default)
  @js.native
  val default: Posed = js.native
  
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[DomPopmotionConfig | DomPopmotionConfigFactory[T]], 
    ComponentType[PoseElementProps with T]
  ]
  
  type DomPopmotionConfigFactory[T] = js.Function1[/* props */ PoseElementProps with T, DomPopmotionConfig]
  
  @js.native
  trait Posed extends /* key */ StringDictionary[ComponentFactory[HTMLProps[_]]] {
    
    def apply[T](component: ComponentType[T]): ComponentFactory[T] = js.native
  }
  
  type _To = Posed
  
  /* This means you don't have to write `default`, but can instead just say `posedMod.foo` */
  override def _to: Posed = default
}

package typings.reactPose

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.libTypesMod.DomPopmotionConfig
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.reactPose.libComponentsPoseElementTypesMod.PoseElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPosedMod extends Shortcut {
  
  @JSImport("react-pose/lib/posed", JSImport.Default)
  @js.native
  val default: Posed = js.native
  
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[DomPopmotionConfig | DomPopmotionConfigFactory[T]], 
    ComponentType[PoseElementProps & T]
  ]
  
  type DomPopmotionConfigFactory[T] = js.Function1[/* props */ PoseElementProps & T, DomPopmotionConfig]
  
  @js.native
  trait Posed
    extends StObject
       with /* key */ StringDictionary[ComponentFactory[HTMLProps[Any]]] {
    
    def apply[T](component: ComponentType[T]): ComponentFactory[T] = js.native
  }
  
  type _To = Posed
  
  /* This means you don't have to write `default`, but can instead just say `libPosedMod.foo` */
  override def _to: Posed = default
}

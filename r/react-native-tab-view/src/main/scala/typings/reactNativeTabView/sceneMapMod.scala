package typings.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.anon.SceneRendererPropsroutean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneMapMod {
  
  @JSImport("react-native-tab-view/lib/typescript/SceneMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scenes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element]]
}

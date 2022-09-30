package typings.reactNativeDraggableFlatlist

import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.anon.ActiveIndexAnim
import typings.reactNativeDraggableFlatlist.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextAnimatedValueContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/context/animatedValueContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useAnimatedValues(): ActiveIndexAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedValues")().asInstanceOf[ActiveIndexAnim]
}

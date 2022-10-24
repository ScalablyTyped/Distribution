package typings.reactNativeDraggableFlatlist

import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.anon.Children
import typings.reactNativeDraggableFlatlist.anon.ContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextNestableScrollContainerContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/nestableScrollContainerContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NestableScrollContainerProvider(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainerProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useNestableScrollContainerContext(): ContainerRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestableScrollContainerContext")().asInstanceOf[ContainerRef]
}

package typings.reactNativeDraggableFlatlist

import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.anon.Children
import typings.reactNativeDraggableFlatlist.anon.ContainerSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptContextNestableScrollContainerContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/context/nestableScrollContainerContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NestableScrollContainerProvider(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainerProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useNestableScrollContainerContext(): js.UndefOr[ContainerSize] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestableScrollContainerContext")().asInstanceOf[js.UndefOr[ContainerSize]]
  
  inline def useSafeNestableScrollContainerContext(): ContainerSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeNestableScrollContainerContext")().asInstanceOf[ContainerSize]
}

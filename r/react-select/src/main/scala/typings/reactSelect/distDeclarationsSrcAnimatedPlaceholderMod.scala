package typings.reactSelect

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactSelect.distDeclarationsSrcComponentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedPlaceholderMod {
  
  @JSImport("react-select/dist/declarations/src/animated/Placeholder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: PlaceholderComponent): js.Function1[/* props */ PlaceholderProps[Any, Boolean, GroupBase[Any]], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ PlaceholderProps[Any, Boolean, GroupBase[Any]], Element]]
  
  type PlaceholderComponent = js.Function1[/* props */ PlaceholderProps[Any, Boolean, GroupBase[Any]], ReactElement]
}

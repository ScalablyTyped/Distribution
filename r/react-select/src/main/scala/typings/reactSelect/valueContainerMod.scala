package typings.reactSelect

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.typesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueContainerMod {
  
  @JSImport("react-select/dist/declarations/src/animated/ValueContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: ValueContainerComponent): js.Function1[/* props */ ValueContainerProps[Any, Boolean, GroupBase[Any]], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ ValueContainerProps[Any, Boolean, GroupBase[Any]], Element]]
  
  type ValueContainerComponent = js.Function1[/* props */ ValueContainerProps[Any, Boolean, GroupBase[Any]], ReactElement]
}

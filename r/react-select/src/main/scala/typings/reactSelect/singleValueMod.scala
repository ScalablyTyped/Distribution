package typings.reactSelect

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.typesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleValueMod {
  
  @JSImport("react-select/dist/declarations/src/animated/SingleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: SingleValueComponent): js.Function1[/* props */ SingleValueProps[Any, Boolean, GroupBase[Any]], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ SingleValueProps[Any, Boolean, GroupBase[Any]], Element]]
  
  type SingleValueComponent = js.Function1[/* props */ SingleValueProps[Any, Boolean, GroupBase[Any]], ReactElement]
}

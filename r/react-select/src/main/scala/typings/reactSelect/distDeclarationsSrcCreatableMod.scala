package typings.reactSelect

import typings.reactSelect.distDeclarationsSrcCreatableMod_.CreatableSelect
import typings.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcUseCreatableMod.BaseCreatableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCreatableMod {
  
  @JSImport("react-select/dist/declarations/src/creatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/creatable", JSImport.Default)
  @js.native
  val default: CreatableSelect = js.native
  
  inline def useCreatable[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: BaseCreatableProps[Option, IsMulti, Group]): PublicBaseSelectProps[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCreatable")(param0.asInstanceOf[js.Any]).asInstanceOf[PublicBaseSelectProps[Option, IsMulti, Group]]
}

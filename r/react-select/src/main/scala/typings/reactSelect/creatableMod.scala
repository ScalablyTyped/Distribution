package typings.reactSelect

import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSelect.reactSelectBooleans.`false`
import typings.reactSelect.selectMod.PublicBaseSelectProps
import typings.reactSelect.typesMod.GroupBase
import typings.reactSelect.useCreatableMod.BaseCreatableProps
import typings.reactSelect.useCreatableMod.CreatableAdditionalProps
import typings.reactSelect.useStateManagerMod.StateManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creatableMod {
  
  @JSImport("react-select/dist/declarations/src/Creatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/Creatable", JSImport.Default)
  @js.native
  val default: CreatableSelect = js.native
  
  inline def useCreatable[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
    hasAllowCreateWhileLoadingCreateOptionPositionFormatCreateLabelIsValidNewOptionGetNewOptionDataOnCreateOptionPropsOptionsPropsOnChangeRestSelectProps: BaseCreatableProps[Option, IsMulti, Group]
  ): PublicBaseSelectProps[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCreatable")(hasAllowCreateWhileLoadingCreateOptionPositionFormatCreateLabelIsValidNewOptionGetNewOptionDataOnCreateOptionPropsOptionsPropsOnChangeRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[PublicBaseSelectProps[Option, IsMulti, Group]]
  
  type CreatableProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (StateManagerProps[Option, IsMulti, Group]) & (CreatableAdditionalProps[Option, Group])
  
  type CreatableSelect = js.Function1[
    /* props */ (CreatableProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[typings.reactSelect.selectMod.default[Any, `false`, GroupBase[Any]]]), 
    ReactElement
  ]
}

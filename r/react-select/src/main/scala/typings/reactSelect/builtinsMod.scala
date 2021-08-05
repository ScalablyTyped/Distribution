package typings.reactSelect

import typings.react.mod.ReactNode
import typings.reactSelect.typesMod.GroupType
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtinsMod {
  
  @JSImport("react-select/src/builtins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatGroupLabel(group: GroupType[js.Any]): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("formatGroupLabel")(group.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  type formatGroupLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* group */ GroupType[OptionType], ReactNode]
  
  inline def getOptionLabel(option: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionLabel")(option.asInstanceOf[js.Any]).asInstanceOf[String]
  type getOptionLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  
  inline def getOptionValue(option: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionValue")(option.asInstanceOf[js.Any]).asInstanceOf[String]
  type getOptionValue[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  
  inline def isOptionDisabled(option: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionDisabled")(option.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  type isOptionDisabled[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, Boolean]
}

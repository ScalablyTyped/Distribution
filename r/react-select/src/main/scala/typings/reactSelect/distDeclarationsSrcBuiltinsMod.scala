package typings.reactSelect

import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcBuiltinsMod {
  
  @JSImport("react-select/dist/declarations/src/builtins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatGroupLabel[Option, Group /* <: GroupBase[Option] */](group: Group): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatGroupLabel")(group.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOptionLabel[Option](option: Option): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionLabel")(option.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOptionValue[Option](option: Option): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionValue")(option.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isOptionDisabled[Option](option: Option): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionDisabled")(option.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

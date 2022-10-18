package typings.storybookReact

import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDef
import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDefaultValue
import typings.storybookReact.anon.PartialTypeResolvers
import typings.storybookReact.distTs3Dot9ClientDocsLibDefaultValuesCreateFromRawDefaultPropMod.TypeResolvers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsLibDefaultValuesMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/defaultValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultValue(defaultValue: String): PropDefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[PropDefaultValue]
  
  inline def createDefaultValueFromRawDefaultProp(rawDefaultProp: Any, propDef: PropDef): PropDefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValueFromRawDefaultProp")(rawDefaultProp.asInstanceOf[js.Any], propDef.asInstanceOf[js.Any])).asInstanceOf[PropDefaultValue]
  inline def createDefaultValueFromRawDefaultProp(rawDefaultProp: Any, propDef: PropDef, typeResolvers: TypeResolvers): PropDefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValueFromRawDefaultProp")(rawDefaultProp.asInstanceOf[js.Any], propDef.asInstanceOf[js.Any], typeResolvers.asInstanceOf[js.Any])).asInstanceOf[PropDefaultValue]
  
  inline def createTypeResolvers(): TypeResolvers = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeResolvers")().asInstanceOf[TypeResolvers]
  inline def createTypeResolvers(customResolvers: PartialTypeResolvers): TypeResolvers = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeResolvers")(customResolvers.asInstanceOf[js.Any]).asInstanceOf[TypeResolvers]
  
  inline def extractFunctionName(func: js.Function, propName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFunctionName")(func.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[String]
}

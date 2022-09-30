package typings.storybookStore

import typings.storybookStore.ts39TypesMod.ModuleExports
import typings.storybookStore.ts39TypesMod.WebProjectAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeConfigsMod {
  
  @JSImport("@storybook/store/dist/ts3.9/csf/composeConfigs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeConfigs[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](moduleExportList: js.Array[ModuleExports]): WebProjectAnnotations[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeConfigs")(moduleExportList.asInstanceOf[js.Any]).asInstanceOf[WebProjectAnnotations[TFramework]]
  
  inline def getArrayField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): js.Array[TFieldType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Array[TFieldType]]
  
  inline def getField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType | js.Array[TFieldType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType | js.Array[TFieldType]]
  
  inline def getObjectField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType]
  
  inline def getSingletonField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingletonField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType]
}

package typings.storybookManager

import typings.storybookManager.distGlobalsMod.ModuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<@storybook/manager.@storybook/manager/dist/globals.ModuleInfo> */
  trait RequiredModuleInfo extends StObject {
    
    var defaultExport: Boolean
    
    var namedExports: js.Array[String]
    
    var `type`: ModuleType
    
    var varName: String
  }
  object RequiredModuleInfo {
    
    inline def apply(defaultExport: Boolean, namedExports: js.Array[String], `type`: ModuleType, varName: String): RequiredModuleInfo = {
      val __obj = js.Dynamic.literal(defaultExport = defaultExport.asInstanceOf[js.Any], namedExports = namedExports.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredModuleInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredModuleInfo] (val x: Self) extends AnyVal {
      
      inline def setDefaultExport(value: Boolean): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      inline def setNamedExports(value: js.Array[String]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsVarargs(value: String*): Self = StObject.set(x, "namedExports", js.Array(value*))
      
      inline def setType(value: ModuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
    }
  }
}

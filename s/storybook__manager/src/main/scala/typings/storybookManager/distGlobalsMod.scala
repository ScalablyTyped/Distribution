package typings.storybookManager

import typings.storybookManager.anon.RequiredModuleInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlobalsMod {
  
  /* Inlined std.Required<std.Record<'react' | 'react-dom' | '@storybook/components' | '@storybook/channels' | '@storybook/core-events' | '@storybook/router' | '@storybook/theming' | '@storybook/api' | '@storybook/manager-api' | '@storybook/addons' | '@storybook/client-logger', std.Required<@storybook/manager.@storybook/manager/dist/globals.ModuleInfo>>> */
  object definitions {
    
    @JSImport("@storybook/manager/dist/globals", "definitions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/manager/dist/globals", "definitions.react")
    @js.native
    def react: RequiredModuleInfo = js.native
    
    @JSImport("@storybook/manager/dist/globals", "definitions.react-dom")
    @js.native
    def reactDom: RequiredModuleInfo = js.native
    
    inline def reactDom_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react-dom")(x.asInstanceOf[js.Any])
    
    inline def react_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/addons")
    @js.native
    def storybookAddons: RequiredModuleInfo = js.native
    
    inline def storybookAddons_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/addons")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/api")
    @js.native
    def storybookApi: RequiredModuleInfo = js.native
    
    inline def storybookApi_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/api")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/channels")
    @js.native
    def storybookChannels: RequiredModuleInfo = js.native
    
    inline def storybookChannels_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/channels")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/client-logger")
    @js.native
    def storybookClientLogger: RequiredModuleInfo = js.native
    
    inline def storybookClientLogger_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/client-logger")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/components")
    @js.native
    def storybookComponents: RequiredModuleInfo = js.native
    
    inline def storybookComponents_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/components")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/core-events")
    @js.native
    def storybookCoreEvents: RequiredModuleInfo = js.native
    
    inline def storybookCoreEvents_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/core-events")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/manager-api")
    @js.native
    def storybookManagerApi: RequiredModuleInfo = js.native
    
    inline def storybookManagerApi_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/manager-api")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/router")
    @js.native
    def storybookRouter: RequiredModuleInfo = js.native
    
    inline def storybookRouter_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/router")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/manager/dist/globals", "definitions.@storybook/theming")
    @js.native
    def storybookTheming: RequiredModuleInfo = js.native
    
    inline def storybookTheming_=(x: RequiredModuleInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("@storybook/theming")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Information that discribes a module to be imported.
    */
  trait ModuleInfo extends StObject {
    
    /**
      * Set to `false` to prevent emitting code for default import/export
      * (which you won't need to unless you are finicky).
      * Defaults to `true`. No effect if `type` is `"cjs"`.
      */
    var defaultExport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Names of variables that are exported from the module and may be imported
      * from another module.
      * No effect if `type` is `"cjs"`.
      */
    var namedExports: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Type (either `"esm"` or `"cjs"`) that determines the internal behavior of
      * this plugin. Defaults to `"esm"`.
      */
    var `type`: js.UndefOr[ModuleType] = js.undefined
    
    /**
      * Global variable name with which the import statements of the module
      * should be replaced.
      */
    var varName: String
  }
  object ModuleInfo {
    
    inline def apply(varName: String): ModuleInfo = {
      val __obj = js.Dynamic.literal(varName = varName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
      
      inline def setDefaultExport(value: Boolean): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      inline def setDefaultExportUndefined: Self = StObject.set(x, "defaultExport", js.undefined)
      
      inline def setNamedExports(value: js.Array[String]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setNamedExportsVarargs(value: String*): Self = StObject.set(x, "namedExports", js.Array(value*))
      
      inline def setType(value: ModuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookManager.storybookManagerStrings.esm
    - typings.storybookManager.storybookManagerStrings.cjs
  */
  trait ModuleType extends StObject
  object ModuleType {
    
    inline def cjs: typings.storybookManager.storybookManagerStrings.cjs = "cjs".asInstanceOf[typings.storybookManager.storybookManagerStrings.cjs]
    
    inline def esm: typings.storybookManager.storybookManagerStrings.esm = "esm".asInstanceOf[typings.storybookManager.storybookManagerStrings.esm]
  }
}

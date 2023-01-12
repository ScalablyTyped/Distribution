package typings.storybookCoreCommon

import typings.storybookCoreCommon.distTs3Dot9TypesMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsGetStorybookInfoMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/get-storybook-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStorybookInfo(packageJson: PackageJson): StorybookInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookInfo")(packageJson.asInstanceOf[js.Any]).asInstanceOf[StorybookInfo]
  
  trait StorybookInfo extends StObject {
    
    var configDir: js.UndefOr[String] = js.undefined
    
    var framework: String
    
    var frameworkPackage: String
    
    var mainConfig: js.UndefOr[String] = js.undefined
    
    var managerConfig: js.UndefOr[String] = js.undefined
    
    var previewConfig: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object StorybookInfo {
    
    inline def apply(framework: String, frameworkPackage: String, version: String): StorybookInfo = {
      val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], frameworkPackage = frameworkPackage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorybookInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorybookInfo] (val x: Self) extends AnyVal {
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setFrameworkPackage(value: String): Self = StObject.set(x, "frameworkPackage", value.asInstanceOf[js.Any])
      
      inline def setMainConfig(value: String): Self = StObject.set(x, "mainConfig", value.asInstanceOf[js.Any])
      
      inline def setMainConfigUndefined: Self = StObject.set(x, "mainConfig", js.undefined)
      
      inline def setManagerConfig(value: String): Self = StObject.set(x, "managerConfig", value.asInstanceOf[js.Any])
      
      inline def setManagerConfigUndefined: Self = StObject.set(x, "managerConfig", js.undefined)
      
      inline def setPreviewConfig(value: String): Self = StObject.set(x, "previewConfig", value.asInstanceOf[js.Any])
      
      inline def setPreviewConfigUndefined: Self = StObject.set(x, "previewConfig", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

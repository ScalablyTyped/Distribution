package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsCheckAddonOrderMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/check-addon-order", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkAddonOrder(hasBeforeAfterConfigFileGetConfig: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAddonOrder")(hasBeforeAfterConfigFileGetConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type AddonEntry = String | OptionsEntry
  
  trait AddonInfo extends StObject {
    
    var inEssentials: Boolean
    
    var name: String
  }
  object AddonInfo {
    
    inline def apply(inEssentials: Boolean, name: String): AddonInfo = {
      val __obj = js.Dynamic.literal(inEssentials = inEssentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddonInfo]
    }
    
    extension [Self <: AddonInfo](x: Self) {
      
      inline def setInEssentials(value: Boolean): Self = StObject.set(x, "inEssentials", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var after: AddonInfo
    
    var before: AddonInfo
    
    var configFile: String
    
    def getConfig(path: String): Any
  }
  object Options {
    
    inline def apply(after: AddonInfo, before: AddonInfo, configFile: String, getConfig: String => Any): Options = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], getConfig = js.Any.fromFunction1(getConfig))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfter(value: AddonInfo): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: AddonInfo): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setGetConfig(value: String => Any): Self = StObject.set(x, "getConfig", js.Any.fromFunction1(value))
    }
  }
  
  trait OptionsEntry extends StObject {
    
    var name: String
  }
  object OptionsEntry {
    
    inline def apply(name: String): OptionsEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsEntry]
    }
    
    extension [Self <: OptionsEntry](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.NormalizeOptionsdirectory
import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import typings.storybookCoreCommon.distTs3Dot9TypesMod.StoriesEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsNormalizeStoriesMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/normalize-stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDirectoryFromWorkingDir(param0: NormalizeOptionsdirectory): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectoryFromWorkingDir")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeStories(entries: js.Array[StoriesEntry], options: NormalizeOptions): js.Array[NormalizedStoriesSpecifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStories")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedStoriesSpecifier]]
  
  inline def normalizeStoriesEntry(entry: StoriesEntry, param1: NormalizeOptions): NormalizedStoriesSpecifier = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStoriesEntry")(entry.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[NormalizedStoriesSpecifier]
  
  trait NormalizeOptions extends StObject {
    
    var configDir: String
    
    var workingDir: String
  }
  object NormalizeOptions {
    
    inline def apply(configDir: String, workingDir: String): NormalizeOptions = {
      val __obj = js.Dynamic.literal(configDir = configDir.asInstanceOf[js.Any], workingDir = workingDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizeOptions]
    }
    
    extension [Self <: NormalizeOptions](x: Self) {
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    }
  }
}

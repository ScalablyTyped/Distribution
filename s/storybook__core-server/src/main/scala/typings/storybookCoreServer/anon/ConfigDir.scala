package typings.storybookCoreServer.anon

import typings.storybookStore.distTs3Dot9TypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigDir extends StObject {
  
  var configDir: Path
  
  var storiesV2Compatibility: Boolean
  
  var storyStoreV7: Boolean
  
  var workingDir: Path
}
object ConfigDir {
  
  inline def apply(configDir: Path, storiesV2Compatibility: Boolean, storyStoreV7: Boolean, workingDir: Path): ConfigDir = {
    val __obj = js.Dynamic.literal(configDir = configDir.asInstanceOf[js.Any], storiesV2Compatibility = storiesV2Compatibility.asInstanceOf[js.Any], storyStoreV7 = storyStoreV7.asInstanceOf[js.Any], workingDir = workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigDir] (val x: Self) extends AnyVal {
    
    inline def setConfigDir(value: Path): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setStoriesV2Compatibility(value: Boolean): Self = StObject.set(x, "storiesV2Compatibility", value.asInstanceOf[js.Any])
    
    inline def setStoryStoreV7(value: Boolean): Self = StObject.set(x, "storyStoreV7", value.asInstanceOf[js.Any])
    
    inline def setWorkingDir(value: Path): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
  }
}

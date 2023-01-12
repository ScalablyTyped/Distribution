package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/core-common.@storybook/core-common/dist/ts3.9/utils/normalize-stories.NormalizeOptions & {  directory :string} */
trait NormalizeOptionsdirectory extends StObject {
  
  var configDir: String
  
  var directory: String
  
  var workingDir: String
}
object NormalizeOptionsdirectory {
  
  inline def apply(configDir: String, directory: String, workingDir: String): NormalizeOptionsdirectory = {
    val __obj = js.Dynamic.literal(configDir = configDir.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], workingDir = workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeOptionsdirectory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizeOptionsdirectory] (val x: Self) extends AnyVal {
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
  }
}

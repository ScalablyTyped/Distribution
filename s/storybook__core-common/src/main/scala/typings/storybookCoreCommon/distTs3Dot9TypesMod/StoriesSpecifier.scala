package typings.storybookCoreCommon.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoriesSpecifier extends StObject {
  
  /**
    * Where to start looking for story files
    */
  var directory: String
  
  /**
    * What does the filename of a story file look like?
    * (a glob, relative to directory, no leading `./`)
    * If unset, we use `** / *.stories.@(mdx|tsx|ts|jsx|js)` (no spaces)
    */
  var files: js.UndefOr[String] = js.undefined
  
  /**
    * When auto-titling, what to prefix all generated titles with (default: '')
    */
  var titlePrefix: js.UndefOr[String] = js.undefined
}
object StoriesSpecifier {
  
  inline def apply(directory: String): StoriesSpecifier = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesSpecifier]
  }
  
  extension [Self <: StoriesSpecifier](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setTitlePrefix(value: String): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
    
    inline def setTitlePrefixUndefined: Self = StObject.set(x, "titlePrefix", js.undefined)
  }
}

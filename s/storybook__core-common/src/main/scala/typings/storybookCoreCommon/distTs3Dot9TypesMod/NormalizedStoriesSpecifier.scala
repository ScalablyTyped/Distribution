package typings.storybookCoreCommon.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@storybook/core-common.@storybook/core-common/dist/ts3.9/types.StoriesSpecifier> & {  importPathMatcher :std.RegExp} */
trait NormalizedStoriesSpecifier extends StObject {
  
  var directory: String
  
  var files: String
  
  var importPathMatcher: js.RegExp
  
  var titlePrefix: String
}
object NormalizedStoriesSpecifier {
  
  inline def apply(directory: String, files: String, importPathMatcher: js.RegExp, titlePrefix: String): NormalizedStoriesSpecifier = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], importPathMatcher = importPathMatcher.asInstanceOf[js.Any], titlePrefix = titlePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedStoriesSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedStoriesSpecifier] (val x: Self) extends AnyVal {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setImportPathMatcher(value: js.RegExp): Self = StObject.set(x, "importPathMatcher", value.asInstanceOf[js.Any])
    
    inline def setTitlePrefix(value: String): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
  }
}

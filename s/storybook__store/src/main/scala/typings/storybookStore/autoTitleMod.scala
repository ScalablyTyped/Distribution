package typings.storybookStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoTitleMod {
  
  @JSImport("@storybook/store/dist/ts3.9/autoTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def userOrAutoTitle(fileName: String, storiesEntries: js.Array[NormalizedStoriesSpecifier]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitle")(fileName.asInstanceOf[js.Any], storiesEntries.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitle(fileName: String, storiesEntries: js.Array[NormalizedStoriesSpecifier], userTitle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitle")(fileName.asInstanceOf[js.Any], storiesEntries.asInstanceOf[js.Any], userTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def userOrAutoTitleFromSpecifier(fileName: String, entry: NormalizedStoriesSpecifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitleFromSpecifier(fileName: String, entry: NormalizedStoriesSpecifier, userTitle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], userTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitleFromSpecifier(fileName: Double, entry: NormalizedStoriesSpecifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitleFromSpecifier(fileName: Double, entry: NormalizedStoriesSpecifier, userTitle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], userTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait NormalizedStoriesSpecifier extends StObject {
    
    var directory: String
    
    var files: js.UndefOr[String] = js.undefined
    
    var importPathMatcher: js.RegExp
    
    var titlePrefix: js.UndefOr[String] = js.undefined
  }
  object NormalizedStoriesSpecifier {
    
    inline def apply(directory: String, importPathMatcher: js.RegExp): NormalizedStoriesSpecifier = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], importPathMatcher = importPathMatcher.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedStoriesSpecifier]
    }
    
    extension [Self <: NormalizedStoriesSpecifier](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setImportPathMatcher(value: js.RegExp): Self = StObject.set(x, "importPathMatcher", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefix(value: String): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefixUndefined: Self = StObject.set(x, "titlePrefix", js.undefined)
    }
  }
}

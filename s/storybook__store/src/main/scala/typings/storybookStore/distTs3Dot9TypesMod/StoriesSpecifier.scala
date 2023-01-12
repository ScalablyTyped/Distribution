package typings.storybookStore.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoriesSpecifier extends StObject {
  
  var directory: String
  
  var titlePrefix: js.UndefOr[String] = js.undefined
}
object StoriesSpecifier {
  
  inline def apply(directory: String): StoriesSpecifier = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoriesSpecifier] (val x: Self) extends AnyVal {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setTitlePrefix(value: String): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
    
    inline def setTitlePrefixUndefined: Self = StObject.set(x, "titlePrefix", js.undefined)
  }
}

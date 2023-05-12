package typings.storybookReactDomShim.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directory extends StObject {
  
  /**
  			Relative path to package.json if it is placed in non-root directory (for example if it is part of a monorepo).
  			[Read more.](https://github.com/npm/rfcs/blob/latest/implemented/0010-monorepo-subdirectory-declaration.md)
  			*/
  var directory: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var url: String
}
object Directory {
  
  inline def apply(`type`: String, url: String): Directory = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

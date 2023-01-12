package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.sketchHqSketchFileFormatTs.anon.ExpandedSymbolPathsInSidebar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var document: ExpandedSymbolPathsInSidebar
}
object User {
  
  inline def apply(document: ExpandedSymbolPathsInSidebar): User = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: ExpandedSymbolPathsInSidebar): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}

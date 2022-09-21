package typings.sketchHqSketchFileFormatTs.typesMod

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
  
  extension [Self <: User](x: Self) {
    
    inline def setDocument(value: ExpandedSymbolPathsInSidebar): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}

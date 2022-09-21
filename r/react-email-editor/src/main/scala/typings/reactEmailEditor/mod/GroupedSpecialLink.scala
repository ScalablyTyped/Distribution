package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedSpecialLink
  extends StObject
     with SpecialLink {
  
  val name: String
  
  val specialLinks: js.Array[SimpleSpecialLink | GroupedSpecialLink]
}
object GroupedSpecialLink {
  
  inline def apply(name: String, specialLinks: js.Array[SimpleSpecialLink | GroupedSpecialLink]): GroupedSpecialLink = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specialLinks = specialLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedSpecialLink]
  }
  
  extension [Self <: GroupedSpecialLink](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpecialLinks(value: js.Array[SimpleSpecialLink | GroupedSpecialLink]): Self = StObject.set(x, "specialLinks", value.asInstanceOf[js.Any])
    
    inline def setSpecialLinksVarargs(value: (SimpleSpecialLink | GroupedSpecialLink)*): Self = StObject.set(x, "specialLinks", js.Array(value*))
  }
}

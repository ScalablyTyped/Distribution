package typings.shiki.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementProps
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: String
}
object ElementProps {
  
  inline def apply(children: String): ElementProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}

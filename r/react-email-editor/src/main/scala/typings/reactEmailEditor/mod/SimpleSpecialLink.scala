package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleSpecialLink
  extends StObject
     with SpecialLink {
  
  val href: String
  
  val name: String
  
  val target: String
}
object SimpleSpecialLink {
  
  inline def apply(href: String, name: String, target: String): SimpleSpecialLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSpecialLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleSpecialLink] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

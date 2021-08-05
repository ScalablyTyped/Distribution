package typings.reactElemental.mod

import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps
  extends StObject
     with AnchorHTMLAttributes[HTMLAnchorElement] {
  
  val activeColor: js.UndefOr[String] = js.undefined
  
  val ref: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  val type_LinkProps: js.UndefOr[LinkType] = js.undefined
}
object LinkProps {
  
  inline def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  
  extension [Self <: LinkProps](x: Self) {
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setType(value: LinkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipLinkListProps extends StObject {
  
  var LinkWrapper: js.UndefOr[LinkWrapperType] = js.undefined
  
  var links: js.Array[Link]
}
object TooltipLinkListProps {
  
  inline def apply(links: js.Array[Link]): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLinkListProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipLinkListProps] (val x: Self) extends AnyVal {
    
    inline def setLinkWrapper(value: LinkWrapperType): Self = StObject.set(x, "LinkWrapper", value.asInstanceOf[js.Any])
    
    inline def setLinkWrapperUndefined: Self = StObject.set(x, "LinkWrapper", js.undefined)
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
  }
}

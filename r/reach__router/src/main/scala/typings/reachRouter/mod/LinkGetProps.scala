package typings.reachRouter.mod

import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkGetProps extends StObject {
  
  var href: String = js.native
  
  var isCurrent: Boolean = js.native
  
  var isPartiallyCurrent: Boolean = js.native
  
  var location: WindowLocation[LocationState] = js.native
}
object LinkGetProps {
  
  @scala.inline
  def apply(
    href: String,
    isCurrent: Boolean,
    isPartiallyCurrent: Boolean,
    location: WindowLocation[LocationState]
  ): LinkGetProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], isCurrent = isCurrent.asInstanceOf[js.Any], isPartiallyCurrent = isPartiallyCurrent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkGetProps]
  }
  
  @scala.inline
  implicit class LinkGetPropsMutableBuilder[Self <: LinkGetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrent(value: Boolean): Self = StObject.set(x, "isCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPartiallyCurrent(value: Boolean): Self = StObject.set(x, "isPartiallyCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}

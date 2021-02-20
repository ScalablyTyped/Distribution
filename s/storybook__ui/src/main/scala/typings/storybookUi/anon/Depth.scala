package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Depth extends StObject {
  
  var depth: js.UndefOr[Double] = js.native
  
  var isComponent: js.UndefOr[Boolean] = js.native
  
  var isExpandable: js.UndefOr[Boolean] = js.native
  
  var isExpanded: js.UndefOr[Boolean] = js.native
}
object Depth {
  
  @scala.inline
  def apply(): Depth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Depth]
  }
  
  @scala.inline
  implicit class DepthMutableBuilder[Self <: Depth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComponentUndefined: Self = StObject.set(x, "isComponent", js.undefined)
    
    @scala.inline
    def setIsExpandable(value: Boolean): Self = StObject.set(x, "isExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
  }
}

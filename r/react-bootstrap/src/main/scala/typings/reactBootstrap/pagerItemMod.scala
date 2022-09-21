package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerItemMod {
  
  @JSImport("react-bootstrap/lib/PagerItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PagerItemProps, js.Object, Any]
  
  type PagerItem = Component[PagerItemProps, js.Object, Any]
  
  trait PagerItemProps
    extends StObject
       with HTMLProps[PagerItem] {
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var next: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onSelect")
    var onSelect_PagerItemProps: js.UndefOr[SelectCallback] = js.undefined
    
    var previous: js.UndefOr[Boolean] = js.undefined
  }
  object PagerItemProps {
    
    inline def apply(): PagerItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerItemProps]
    }
    
    extension [Self <: PagerItemProps](x: Self) {
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}

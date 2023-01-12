package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.Ref
import typings.react.mod.TableHTMLAttributes
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibTableMod {
  
  @JSImport("reactstrap/types/lib/Table", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TableProps, js.Object, Any]
  
  type Table = Component[TableProps, js.Object, Any]
  
  trait TableProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement]
       with /* key */ StringDictionary[Any] {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var hover: js.UndefOr[Boolean] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLTableElement]] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var reflow: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[Boolean | String] = js.undefined
    
    var responsiveTag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var striped: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLTableElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLTableElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setReflow(value: Boolean): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
      
      inline def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
      
      inline def setResponsive(value: Boolean | String): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveTag(value: ElementType[Any]): Self = StObject.set(x, "responsiveTag", value.asInstanceOf[js.Any])
      
      inline def setResponsiveTagUndefined: Self = StObject.set(x, "responsiveTag", js.undefined)
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}

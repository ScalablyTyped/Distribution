package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.Ref
import typings.react.mod.TableHTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("reactstrap/lib/Table", JSImport.Default)
  @js.native
  class default ()
    extends Component[TableProps, js.Object, js.Any]
  
  type Table = Component[TableProps, js.Object, js.Any]
  
  @js.native
  trait TableProps
    extends TableHTMLAttributes[HTMLTableElement]
       with /* key */ StringDictionary[js.Any] {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var borderless: js.UndefOr[Boolean] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var hover: js.UndefOr[Boolean] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLTableElement]] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var reflow: js.UndefOr[Boolean] = js.native
    
    var responsive: js.UndefOr[Boolean | String] = js.native
    
    var responsiveTag: js.UndefOr[ElementType[_]] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var striped: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLTableElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLTableElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setReflow(value: Boolean): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean | String): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveTag(value: ElementType[_]): Self = StObject.set(x, "responsiveTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveTagUndefined: Self = StObject.set(x, "responsiveTag", js.undefined)
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}

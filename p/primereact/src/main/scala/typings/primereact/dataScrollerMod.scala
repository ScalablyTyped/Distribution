package typings.primereact

import typings.primereact.anon.First
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataScrollerMod {
  
  @JSImport("primereact/components/datascroller/DataScroller", "DataScroller")
  @js.native
  class DataScroller protected ()
    extends Component[DataScrollerProps, js.Any, js.Any] {
    def this(props: DataScrollerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataScrollerProps, context: js.Any) = this()
  }
  
  @js.native
  trait DataScrollerProps extends StObject {
    
    var buffer: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var loader: js.UndefOr[js.Any] = js.native
    
    var onLazyLoad: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var scrollHeight: js.UndefOr[js.Any] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[js.Array[_]] = js.native
  }
  object DataScrollerProps {
    
    @scala.inline
    def apply(): DataScrollerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataScrollerProps]
    }
    
    @scala.inline
    implicit class DataScrollerPropsMutableBuilder[Self <: DataScrollerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLoader(value: js.Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setOnLazyLoad(value: /* e */ First => Unit): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setScrollHeight(value: js.Any): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}

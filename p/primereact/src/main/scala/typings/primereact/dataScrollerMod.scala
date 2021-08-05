package typings.primereact

import typings.primereact.anon.First
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait DataScrollerProps extends StObject {
    
    var buffer: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var loader: js.UndefOr[js.Any] = js.undefined
    
    var onLazyLoad: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var scrollHeight: js.UndefOr[js.Any] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataScrollerProps {
    
    inline def apply(): DataScrollerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataScrollerProps]
    }
    
    extension [Self <: DataScrollerProps](x: Self) {
      
      inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoader(value: js.Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setOnLazyLoad(value: /* e */ First => Unit): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1(value))
      
      inline def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setScrollHeight(value: js.Any): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
